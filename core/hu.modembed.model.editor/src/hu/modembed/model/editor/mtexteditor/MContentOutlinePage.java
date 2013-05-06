/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import hu.modembed.ui.databinding.EObjectContentListObservableFactory;
import hu.modembed.ui.databinding.ElementLabelValueFactory;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.MasterDetailObservables;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

/**
 * @author balazs.grill
 *
 */
public class MContentOutlinePage extends ContentOutlinePage {

	private final EditingDomain edomain;
	
	public MContentOutlinePage(EditingDomain edomain) {
		this.edomain = edomain;
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(new EObjectContentListObservableFactory(edomain), null);
		IObservableSet knownelements = contentProvider.getKnownElements();
		IObservableMap labels = MasterDetailObservables.detailValues(
				knownelements, new ElementLabelValueFactory(edomain), String.class);
		
		getTreeViewer().setContentProvider(contentProvider);
		getTreeViewer().setLabelProvider(new ObservableMapLabelProvider(labels));
		getTreeViewer().setInput(edomain.getResourceSet());
	}
	
}
