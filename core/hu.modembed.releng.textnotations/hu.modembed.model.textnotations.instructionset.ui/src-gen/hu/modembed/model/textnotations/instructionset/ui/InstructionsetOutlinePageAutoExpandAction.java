/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetOutlinePageAutoExpandAction extends hu.modembed.model.textnotations.instructionset.ui.AbstractInstructionsetOutlinePageAction {
	
	public InstructionsetOutlinePageAutoExpandAction(hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
