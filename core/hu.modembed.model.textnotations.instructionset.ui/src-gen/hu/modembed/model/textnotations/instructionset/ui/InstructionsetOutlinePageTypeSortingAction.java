/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetOutlinePageTypeSortingAction extends hu.modembed.model.textnotations.instructionset.ui.AbstractInstructionsetOutlinePageAction {
	
	public InstructionsetOutlinePageTypeSortingAction(hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
