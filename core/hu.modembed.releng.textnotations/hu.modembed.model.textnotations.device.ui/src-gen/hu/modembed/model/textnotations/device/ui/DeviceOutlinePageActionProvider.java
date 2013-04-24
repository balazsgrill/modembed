/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

public class DeviceOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(hu.modembed.model.textnotations.device.ui.DeviceOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new hu.modembed.model.textnotations.device.ui.DeviceOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.device.ui.DeviceOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.device.ui.DeviceOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.device.ui.DeviceOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.device.ui.DeviceOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.device.ui.DeviceOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
