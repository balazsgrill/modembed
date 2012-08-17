/**
 * 
 */
package hu.modembed.model.editor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author balazs.grill
 *
 */
public class DeleteHandler extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection s = HandlerUtil.getCurrentSelection(event);
		if (s instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) s).getFirstElement();
			
			if (o instanceof EObject){
				final EObject target = (EObject)o;
				TransactionalEditingDomain edomain = TransactionUtil.getEditingDomain(target);
				edomain.getCommandStack().execute(
				new RecordingCommand(edomain) {
					
					@Override
					protected void doExecute() {
						EcoreUtil.delete(target);
					}
				});
			}
		}
		
		return null;
	}

}
