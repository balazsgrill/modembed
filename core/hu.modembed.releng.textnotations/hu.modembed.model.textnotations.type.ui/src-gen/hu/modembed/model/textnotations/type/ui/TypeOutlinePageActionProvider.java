/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new hu.modembed.model.textnotations.type.ui.TypeOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.type.ui.TypeOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.type.ui.TypeOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.type.ui.TypeOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.type.ui.TypeOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new hu.modembed.model.textnotations.type.ui.TypeOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
