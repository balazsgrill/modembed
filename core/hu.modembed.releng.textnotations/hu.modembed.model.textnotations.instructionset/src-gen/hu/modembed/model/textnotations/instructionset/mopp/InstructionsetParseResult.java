/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetParseResult implements hu.modembed.model.textnotations.instructionset.IInstructionsetParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	
	private hu.modembed.model.textnotations.instructionset.IInstructionsetLocationMap locationMap;
	
	private java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>> commands = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>>();
	
	public InstructionsetParseResult() {
		super();
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(hu.modembed.model.textnotations.instructionset.IInstructionsetLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
