/**
 * 
 */
package hu.modembed.model.editor.properties;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * @author balage
 *
 */
public class EReferenceChangeCommand extends AbstractCommand {

	private final EObject eobject;
	private final EReference reference;
	
	private Object oldvalue = null;
	private Object newvalue = null;
	
	public EReferenceChangeCommand(EObject eobject, EReference reference, Object newvalue) {
		this.eobject = eobject;
		this.reference = reference;
		this.newvalue = newvalue;
		
	}
	
	@Override
	protected boolean prepare() {
		oldvalue = eobject.eGet(reference);
		
		return true;
	}
	
	@Override
	public void undo() {
		eobject.eSet(reference, oldvalue);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		eobject.eSet(reference, newvalue);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		execute();
	}

}
