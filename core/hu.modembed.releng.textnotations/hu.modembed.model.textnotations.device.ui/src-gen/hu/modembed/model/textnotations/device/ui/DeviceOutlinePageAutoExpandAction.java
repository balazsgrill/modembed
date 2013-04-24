/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

public class DeviceOutlinePageAutoExpandAction extends hu.modembed.model.textnotations.device.ui.AbstractDeviceOutlinePageAction {
	
	public DeviceOutlinePageAutoExpandAction(hu.modembed.model.textnotations.device.ui.DeviceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
