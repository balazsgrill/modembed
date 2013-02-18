/**
 * 
 */
package hu.modembed.includedcode;

import hu.modembed.utils.tree.ITree;
import hu.modembed.utils.tree.SimpleTree;
import hu.modembed.utils.tree.UnmodifiableTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
				projects.add(new IncludedProject(ce));
			}
			if ("category".equals(ce.getName())){
				categories.add(new CategoryElement(ce));
			}
		}
		
		fill(projectTree, null);
		
	}
	
}
