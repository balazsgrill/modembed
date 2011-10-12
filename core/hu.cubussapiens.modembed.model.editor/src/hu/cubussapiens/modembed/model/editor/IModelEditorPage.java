/**
 * 
 */
package hu.cubussapiens.modembed.model.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public interface IModelEditorPage {

	public void init(Resource resource, EditingDomain editingdomain, AdapterFactory adapterFactory);
	
	public void createControls(Composite parent);
	
	public void setContextMenu(MenuManager contextMenu);
	
	public ISelectionProvider getSelectionProvider();
	
	public void dispose();
	
}
