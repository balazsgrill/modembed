/**
 * 
 */
package hu.cubussapiens.modembed.model.editor;

import java.util.Collection;
import java.util.EventObject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;

/**
 * @author balazs.grill
 *
 */
public class GenericTreeModelEditorPage implements IModelEditorPage, CommandStackListener{

	private Resource resource;
	private EditingDomain editingDomain;
	private AdapterFactory adapterFactory;
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.model.editor.IModelEditorPage#init(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public void init(Resource resource, EditingDomain editingDomain, AdapterFactory adapterFactory) {
		this.resource = resource;
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
	}
	
	private TreeViewer selectionViewer;
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.model.editor.IModelEditorPage#createControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControls(Composite parent) {
		parent.setLayout(new FillLayout());
		selectionViewer = new TreeViewer(parent);
		selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));

		selectionViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		selectionViewer.setInput(resource);
		selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);

		new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);

		editingDomain.getCommandStack().addCommandStackListener(this);
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.model.editor.IModelEditorPage#dispose()
	 */
	@Override
	public void dispose() {
		editingDomain.getCommandStack().removeCommandStackListener(this);

	}

	@Override
	public void setContextMenu(MenuManager contextMenu) {
		Menu menu = contextMenu.createContextMenu(selectionViewer.getControl());
		selectionViewer.getControl().setMenu(menu);

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		selectionViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(selectionViewer));
		selectionViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, selectionViewer));
	}

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
			  selectionViewer.refresh();
			  
			  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
		  }
		
	}

	@Override
	public String toString() {
		return "Model Tree";
	}
	
}
