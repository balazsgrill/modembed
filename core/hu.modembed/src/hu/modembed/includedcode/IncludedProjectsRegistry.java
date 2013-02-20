/**
 * 
 */
package hu.modembed.includedcode;

import hu.modembed.utils.tree.ITree;
import hu.modembed.utils.tree.SimpleTree;
import hu.modembed.utils.tree.UnmodifiableTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author balazs.grill
 *
 */
public final class IncludedProjectsRegistry {

	private static IncludedProjectsRegistry instance;
	
	public static IncludedProjectsRegistry getInstance() {
		if (instance == null){
			instance = new IncludedProjectsRegistry();
		}
		return instance;
	}
	
	private static final String EPID = "hu.modembed.ui.includedCode";
	
	private final List<IncludedProject> projects = new ArrayList<IncludedProject>();
	private final List<CategoryElement> categories = new ArrayList<CategoryElement>();
	private final ITree<Object> projectTree = new SimpleTree<Object>("Root");
	
	/**
	 * Chronological level
	 */
	private final Map<IncludedProject, Integer> chronoLevel = new HashMap<IncludedProject, Integer>();
	private final Map<String, IncludedProject> projectById = new HashMap<String, IncludedProject>();
	
	public List<IncludedProject> getProjects() {
		return Collections.unmodifiableList(projects);
	}
	
	public ITree<Object> getProjectTree(){
		return new UnmodifiableTree<Object>(projectTree);
	}
	
	private static boolean idequals(String id1, String id2){
		if (id1 == null) return id2 == null;
		return id1.equals(id2);
	}
	
	private void fill(ITree<Object> tree, CategoryElement category){
		String catId = (category == null) ? null : category.getId();
		for(IncludedProject p : projects){
			if (idequals(catId, p.getCategory())){
				tree.addChild(p);
			}
		}
		
		for(CategoryElement ce : categories){
			if (idequals(catId, ce.getParent())){
				ITree<Object> catTree = tree.addChild(ce);
				fill(catTree, ce);
			}
		}
	}
	
	private IncludedProjectsRegistry() {
		for(IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			if ("project".equals(ce.getName())){
				IncludedProject ip = new IncludedProject(ce); 
				projects.add(ip);
				projectById.put(ip.getID(), ip);
			}
			if ("category".equals(ce.getName())){
				categories.add(new CategoryElement(ce));
			}
		}
		
		Set<IncludedProject> remain = new HashSet<IncludedProject>(projects);
		int lastSize = -1;
		while(lastSize != remain.size()){
			lastSize = remain.size();
			
			List<IncludedProject> done = new LinkedList<IncludedProject>();
			for(IncludedProject ip : remain) {
				if (chronoLevel.containsKey(ip)){
					done.add(ip);
				}else{
					boolean allow = true;
					int level = 0;
					for(String did : ip.getDependencies()) if(allow){
						IncludedProject dip = projectById.get(did);
						if (dip != null){
							Integer dlevel = chronoLevel.get(dip);
							if (dlevel == null){
								allow = false;
							}else{
								level = Math.max(level, dlevel+1);
							}
						}
					}
					if (allow){
						chronoLevel.put(ip, level);
						done.add(ip);
					}
				}
			}
			
			remain.removeAll(done);
		}
		
		fill(projectTree, null);
		
	}
	
	public List<IncludedProject> resolveDependencies(Collection<IncludedProject> projects){
		Set<IncludedProject> all = new HashSet<IncludedProject>();
		Queue<IncludedProject> queue = new LinkedList<IncludedProject>(projects);
		
		while(!queue.isEmpty()){
			IncludedProject ip = queue.poll();
			if (!all.contains(ip)){
				all.add(ip);
				for(String dep : ip.getDependencies()){
					IncludedProject dip = projectById.get(dep);
					if (dip != null){
						queue.add(dip);
					}
				}
			}
		}
		
		List<IncludedProject> result = new ArrayList<IncludedProject>(all);
		Collections.sort(result, new Comparator<IncludedProject>() {

			@Override
			public int compare(IncludedProject o1, IncludedProject o2) {
				Integer i1 = chronoLevel.get(o1);
				Integer i2 = chronoLevel.get(o2);
				return i1.compareTo(i2);
			}
		});
		return result;
	}
	
}
