/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetParseResult implements hu.modembed.model.textnotations.instructionset.IInstructionsetParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>> commands = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>>();
	
	public InstructionsetParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
