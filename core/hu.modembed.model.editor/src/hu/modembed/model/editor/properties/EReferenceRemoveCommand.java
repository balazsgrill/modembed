/**
 * 
 */
package hu.modembed.model.editor.properties;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * @author balazs.grill
 *
 */
public class EReferenceRemoveCommand extends AbstractCommand {

	private final EObject eobject;
	private final EReference reference;
	private final Object[] removed;
	
	public EReferenceRemoveCommand(EObject eobject, EReference reference, Object[] removed) {
		this.eobject = eobject;
		this.reference = reference;
		this.removed = removed;
	}
	
	@Override
	protected boolean prepare() {
		return reference.isMany();
	}
	
	@Override
	public void undo() {
		@SuppressWarnings("unchecked")
		List<Object> list = (List<Object>) eobject.eGet(reference);
		list.addAll(Arrays.asList(removed));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		@SuppressWarnings("unchecked")
		List<Object> list = (List<Object>) eobject.eGet(reference);
		list.removeAll(Arrays.asList(removed));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		execute();
	}

}
