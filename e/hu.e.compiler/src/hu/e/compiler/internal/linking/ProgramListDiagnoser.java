/**
 * 
 */
package hu.e.compiler.internal.linking;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * @author balazs.grill
 *
 */
public class ProgramListDiagnoser {

	public static class UncontainedEntry{
		public final EObject parent;
		public final EReference ref;
		public UncontainedEntry(EObject parent, EReference ref) {
			super();
			this.parent = parent;
			this.ref = ref;
		}
		
		@Override
		public String toString() {
			return ref.getName()+" in "+parent.eResource().getURIFragment(parent);
		}
	}
	
	public static List<UncontainedEntry> getUncontainedEntries(EObject root){
		TreeIterator<EObject> iter = root.eAllContents();
		Set<EObject> content = new HashSet<EObject>();
		while(iter.hasNext()){
			content.add(iter.next());
		}
		
		List<UncontainedEntry> entries = new LinkedList<ProgramListDiagnoser.UncontainedEntry>();
		
		for(EObject eo : content){
			for(EReference ref : eo.eClass().getEAllReferences()){
				if (!ref.isContainment()){
					Object o = eo.eGet(ref);
					if (o instanceof EObject){
						if (!content.contains(o)){
							entries.add(new UncontainedEntry(eo, ref));
						}
					}
				}
			}
		}
		
		return entries;
	}
	
}
