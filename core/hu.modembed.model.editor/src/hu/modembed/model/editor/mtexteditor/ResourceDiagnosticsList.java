/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class ResourceDiagnosticsList extends UpdatingList {

	private final Resource resource;
	
	public ResourceDiagnosticsList(Resource resource) {
		this.resource = resource;
		update();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.list.IObservableList#getElementType()
	 */
	@Override
	public Object getElementType() {
		return Diagnostic.class;
	}

	@Override
	protected List<?> doUpdate() {
		return new ArrayList<Object>(resource.getErrors());
	}

}
