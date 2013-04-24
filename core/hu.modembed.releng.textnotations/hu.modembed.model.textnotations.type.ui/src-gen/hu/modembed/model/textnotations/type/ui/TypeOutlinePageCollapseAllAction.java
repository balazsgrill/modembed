/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeOutlinePageCollapseAllAction extends hu.modembed.model.textnotations.type.ui.AbstractTypeOutlinePageAction {
	
	public TypeOutlinePageCollapseAllAction(hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer) {
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
