/**
 * 
 */
package hu.modembed.model.editor;

import hu.modembed.MODembedCore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;


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
					for(EClass t : MODembedCore.getAllSubTypes(edomain.getResourceSet(), type)){
						if (!t.isAbstract())
							manager.add(new NewElementAction(edomain, (EObject)element, t, ref));
					}
				}
				
				String commandID = IWorkbenchCommandConstants.EDIT_DELETE;
				CommandContributionItemParameter param = new CommandContributionItemParameter(PlatformUI.getWorkbench(),commandID, commandID, CommandContributionItem.STYLE_PUSH);
				manager.add(new CommandContributionItem(param));
			}
		}

	}

	
}
