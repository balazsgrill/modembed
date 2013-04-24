/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeOutlinePageAutoExpandAction extends hu.modembed.model.textnotations.type.ui.AbstractTypeOutlinePageAction {
	
	public TypeOutlinePageAutoExpandAction(hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
