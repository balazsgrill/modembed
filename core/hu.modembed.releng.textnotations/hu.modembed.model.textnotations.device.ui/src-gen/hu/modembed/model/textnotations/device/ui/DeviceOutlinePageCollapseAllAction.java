/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

public class DeviceOutlinePageCollapseAllAction extends hu.modembed.model.textnotations.device.ui.AbstractDeviceOutlinePageAction {
	
	public DeviceOutlinePageCollapseAllAction(hu.modembed.model.textnotations.device.ui.DeviceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
