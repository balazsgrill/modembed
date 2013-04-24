/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetOutlinePageLinkWithEditorAction extends hu.modembed.model.textnotations.instructionset.ui.AbstractInstructionsetOutlinePageAction {
	
	public InstructionsetOutlinePageLinkWithEditorAction(hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
