/**
 * 
 */
package hu.modembed.model.editor.grass;

import hu.balazsgrill.grass.GrassViewer;
import hu.balazsgrill.grass.databinding.ObservableTreeContentProvider;
import hu.modembed.model.editor.IModelEditorPage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class GrassModelEditorPage implements IModelEditorPage {

	private Resource resource;
	private EditingDomain editingDomain;
	
	private GrassViewer viewer;
	
	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IModelEditorPage#init(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public void init(Resource resource, EditingDomain editingdomain) {
		this.resource = resource;
		this.editingDomain = editingdomain;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IModelEditorPage#createControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControls(Composite parent) {
		parent.setLayout(new FillLayout());
		viewer = new GrassViewer(parent, SWT.DOUBLE_BUFFERED);

		ObservableTreeContentProvider contentProvider = new ObservableTreeContentProvider(new ModelContentObservableListFactory(editingDomain));
		//IObservableSet knownelements = contentProvider.getKnownElements();
		//IObservableMap labels = MasterDetailObservables.detailValues(
			//	knownelements, new ElementLabelValueFactory(editingDomain), String.class);
		
		
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(new ObservableMapLabelAndFigureProvider());
		viewer.setInput(resource);
		viewer.refresh();
	}

	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IModelEditorPage#getSelectionProvider()
	 */
	@Override
	public ISelectionProvider getSelectionProvider() {
		return viewer;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IModelEditorPage#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
