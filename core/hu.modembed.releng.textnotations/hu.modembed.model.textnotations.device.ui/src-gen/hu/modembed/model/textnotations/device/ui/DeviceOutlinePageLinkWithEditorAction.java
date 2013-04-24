/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

public class DeviceOutlinePageLinkWithEditorAction extends hu.modembed.model.textnotations.device.ui.AbstractDeviceOutlinePageAction {
	
	public DeviceOutlinePageLinkWithEditorAction(hu.modembed.model.textnotations.device.ui.DeviceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
