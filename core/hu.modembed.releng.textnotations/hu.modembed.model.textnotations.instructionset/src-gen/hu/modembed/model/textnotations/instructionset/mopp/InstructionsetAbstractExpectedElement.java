/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class InstructionsetAbstractExpectedElement implements hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<hu.modembed.model.textnotations.instructionset.util.InstructionsetPair<hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[]>> followers = new java.util.LinkedHashSet<hu.modembed.model.textnotations.instructionset.util.InstructionsetPair<hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[]>>();
	
	public InstructionsetAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement follower, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[] path) {
		followers.add(new hu.modembed.model.textnotations.instructionset.util.InstructionsetPair<hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.util.InstructionsetPair<hu.modembed.model.textnotations.instructionset.IInstructionsetExpectedElement, hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
