/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import hu.modembed.ui.databinding.ElementLabelValueFactory;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
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
	private final OutlineContentListObservableFactory contentFactory;
	private final IObservableFactory labelFactory;
	
	
	public MContentOutlinePage(EditingDomain edomain) {
		this.edomain = edomain;
		this.contentFactory = new OutlineContentListObservableFactory(edomain);
		this.labelFactory = new ElementLabelValueFactory(edomain){
			@Override
			public IObservable createObservable(Object target) {
				//if (target instanceof )
				return super.createObservable(target);
			}
		};
	}
	
	public void update(){
		this.contentFactory.update();
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(contentFactory, null);
		IObservableSet knownelements = contentProvider.getKnownElements();
		IObservableMap labels = MasterDetailObservables.detailValues(
				knownelements, labelFactory, String.class);
		
		getTreeViewer().setContentProvider(contentProvider);
		getTreeViewer().setLabelProvider(new ObservableMapLabelProvider(labels));
		getTreeViewer().setInput(edomain.getResourceSet());
	}
	
}
