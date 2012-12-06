/**
 * 
 */
package hu.modembed.model.editor.properties;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public class EMultiFeatureAddCommand extends AbstractCommand {

	private final EObject eobject;
	private final EStructuralFeature feature;
	private final Object[] added;
	
	public EMultiFeatureAddCommand(EObject eobject, EStructuralFeature feature, Object[] added) {
		this.eobject = eobject;
		this.feature = feature;
		this.added = added;
	}
	
	@Override
	protected boolean prepare() {
		return feature.isMany();
	}
	
	@Override
	public void undo() {
		@SuppressWarnings("unchecked")
		List<Object> list = (List<Object>) eobject.eGet(feature);
		list.removeAll(Arrays.asList(added));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		@SuppressWarnings("unchecked")
		List<Object> list = (List<Object>) eobject.eGet(feature);
		list.addAll(Arrays.asList(added));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		execute();
	}

}
