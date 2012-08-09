/**
 * 
 */
package hu.modembed.model.editor;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;

/**
 * @author balazs.grill
 *
 */
public class NewElementAction extends Action {

	private final EditingDomain edomain;
	private final EObject target;
	private final EClass newclass;
	private final EReference reference;
	
	public NewElementAction(EditingDomain edomain, EObject target, EClass newclass, EReference reference) {
		this.edomain = edomain;
		this.target = target;
		this.newclass = newclass;
		this.reference = reference;
		setText("new "+newclass.getName()+" ("+reference.getName()+")");
	}
	
	@Override
	public void run() {
		RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) edomain) {
			
			@Override
			protected void doExecute() {
				EObject eo = newclass.getEPackage().getEFactoryInstance().create(newclass);
				if (reference.isMany()){
					@SuppressWarnings("unchecked")
					List<Object> list = (List<Object>) target.eGet(reference);
					list.add(eo);
				}else{
					target.eSet(reference, eo);
				}
			}
		};
		edomain.getCommandStack().execute(command);
	}
	
}
