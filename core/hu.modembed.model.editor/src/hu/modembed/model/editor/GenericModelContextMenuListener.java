/**
 * 
 */
package hu.modembed.model.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;


/**
 * @author balazs.grill
 *
 */
public class GenericModelContextMenuListener implements IMenuListener {

	private final ISelectionProvider selectionProvider;
	private final EditingDomain edomain;
	
	public GenericModelContextMenuListener(ISelectionProvider selectionProvider, EditingDomain edomain) {
		this.selectionProvider = selectionProvider;
		this.edomain = edomain;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuListener#menuAboutToShow(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void menuAboutToShow(IMenuManager manager) {
		ISelection s = selectionProvider.getSelection();
		if (s instanceof IStructuredSelection){
			Object element = ((IStructuredSelection) s).getFirstElement();
			if (element instanceof EObject){
				
				EClass eclass = ((EObject) element).eClass();
				for(EReference ref : eclass.getEAllContainments()){
					EClass type = ref.getEReferenceType();
					for(EClass t : getAllSubTypes(type)){
						if (!t.isAbstract())
							manager.add(new NewElementAction(edomain, (EObject)element, t, ref));
					}
				}
				
			}
		}

	}

	private List<EClass> getAllSubTypes(EClass base) {
		List<EClass> subs = new ArrayList<EClass>();
		subs.add(base);

		for (Object oo : edomain.getResourceSet().getPackageRegistry().values()) {

			if (oo instanceof EPackage) {
				Iterator<EObject> iter = ((EPackage) oo).eContents().iterator();
				while (iter.hasNext()) {
					EObject o = iter.next();
					if (o instanceof EClass) {
						EClass cls = (EClass) o;
						if (cls.getEAllSuperTypes().contains(base))
							subs.add(cls);
					}
				}
			}
		}
		return subs;
	}
	
}
