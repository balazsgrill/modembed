/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeOutlinePageTypeSortingAction extends hu.modembed.model.textnotations.type.ui.AbstractTypeOutlinePageAction {
	
	public TypeOutlinePageTypeSortingAction(hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
