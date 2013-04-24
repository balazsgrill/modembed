/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

public class DeviceOutlinePageTypeSortingAction extends hu.modembed.model.textnotations.device.ui.AbstractDeviceOutlinePageAction {
	
	public DeviceOutlinePageTypeSortingAction(hu.modembed.model.textnotations.device.ui.DeviceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
