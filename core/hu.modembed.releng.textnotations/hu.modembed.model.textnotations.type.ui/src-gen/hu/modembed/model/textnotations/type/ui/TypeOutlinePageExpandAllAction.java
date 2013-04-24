/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeOutlinePageExpandAllAction extends hu.modembed.model.textnotations.type.ui.AbstractTypeOutlinePageAction {
	
	public TypeOutlinePageExpandAllAction(hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
