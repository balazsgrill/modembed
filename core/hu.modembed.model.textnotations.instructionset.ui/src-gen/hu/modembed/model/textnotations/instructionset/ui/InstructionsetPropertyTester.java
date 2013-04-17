/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetPropertyTester extends org.eclipse.core.expressions.PropertyTester {
	
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof org.eclipse.core.resources.IResource) {
			org.eclipse.core.resources.IResource resource = (org.eclipse.core.resources.IResource) receiver;
			return hasMatchingURI(resource);
		} else if (receiver instanceof org.eclipse.ui.part.FileEditorInput) {
			org.eclipse.ui.part.FileEditorInput editorInput = (org.eclipse.ui.part.FileEditorInput) receiver;
			org.eclipse.core.resources.IFile file = editorInput.getFile();
			return hasMatchingURI(file);
		}
		return false;
	}
	
	private boolean hasMatchingURI(org.eclipse.core.resources.IResource resource) {
		String path = resource.getLocationURI().getPath();
		return path.endsWith("." + new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation().getSyntaxName());
	}
	
}
