/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetOutlinePageLexicalSortingAction extends hu.modembed.model.textnotations.instructionset.ui.AbstractInstructionsetOutlinePageAction {
	
	public InstructionsetOutlinePageLexicalSortingAction(hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
