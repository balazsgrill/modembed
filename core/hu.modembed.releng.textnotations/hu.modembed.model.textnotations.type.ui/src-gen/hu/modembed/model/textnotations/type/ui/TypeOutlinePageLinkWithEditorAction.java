/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeOutlinePageLinkWithEditorAction extends hu.modembed.model.textnotations.type.ui.AbstractTypeOutlinePageAction {
	
	public TypeOutlinePageLinkWithEditorAction(hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
