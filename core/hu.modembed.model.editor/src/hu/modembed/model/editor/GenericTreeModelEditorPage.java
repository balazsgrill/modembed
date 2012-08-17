/**
 * 
 */
package hu.modembed.model.editor;

import hu.modembed.ui.databinding.EObjectContentListObservableFactory;
import hu.modembed.ui.databinding.ElementLabelValueFactory;

import java.util.Collection;
import java.util.EventObject;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.MasterDetailObservables;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class GenericTreeModelEditorPage implements IModelEditorPage, CommandStackListener{

	private Resource resource;
	private EditingDomain editingDomain;
	
	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IModelEditorPage#init(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public void init(Resource resource, EditingDomain editingDomain) {
		this.resource = resource;
		this.editingDomain = editingDomain;
	}
	
	private TreeViewer selectionViewer;
	
	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IModelEditorPage#createControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControls(Composite parent) {
		parent.setLayout(new FillLayout());
		selectionViewer = new TreeViewer(parent);
		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(new EObjectContentListObservableFactory(editingDomain), null);
		IObservableSet knownelements = contentProvider.getKnownElements();
		IObservableMap labels = MasterDetailObservables.detailValues(
				knownelements, new ElementLabelValueFactory(editingDomain), String.class);
		
		
		selectionViewer.setContentProvider(contentProvider);
		selectionViewer.setLabelProvider(new ObservableMapLabelProvider(labels));
		selectionViewer.setInput(resource);
		selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);

		MenuManager mm = new MenuManager();
		mm.setRemoveAllWhenShown(true);
		mm.addMenuListener(new GenericModelContextMenuListener(selectionViewer, editingDomain));
		selectionViewer.getControl().setMenu(mm.createContextMenu(selectionViewer.getControl()));
		
		editingDomain.getCommandStack().addCommandStackListener(this);
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IModelEditorPage#dispose()
	 */
	@Override
	public void dispose() {
		editingDomain.getCommandStack().removeCommandStackListener(this);

	}

//	@Override
//	public void setContextMenu(MenuManager contextMenu) {
//		Menu menu = contextMenu.createContextMenu(selectionViewer.getControl());
//		selectionViewer.getControl().setMenu(menu);
//
//		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
//		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
//		selectionViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(selectionViewer));
//		selectionViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, selectionViewer));
//	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return selectionViewer;
	}

	/**
	 * This sets the selection into whichever viewer is active.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable =
				new Runnable() {
					public void run() {
						// Try to select the items in the current content viewer of the editor.
						//
						if (selectionViewer != null){
							selectionViewer.setSelection(new StructuredSelection(theSelection.toArray()));
						}
						
					}
				};
			selectionViewer.getControl().getShell().getDisplay().asyncExec(runnable);
		}
	}
	
	@Override
	public void commandStackChanged(EventObject event) {
		Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
		  if (mostRecentCommand != null) {
			  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
		  }
		
	}

	@Override
	public String toString() {
		return "Model Tree";
	}
	
}
