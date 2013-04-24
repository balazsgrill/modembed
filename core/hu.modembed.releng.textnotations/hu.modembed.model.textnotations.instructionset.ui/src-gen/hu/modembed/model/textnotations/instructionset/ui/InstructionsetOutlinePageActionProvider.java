/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.instructionset.ui.InstructionsetOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
