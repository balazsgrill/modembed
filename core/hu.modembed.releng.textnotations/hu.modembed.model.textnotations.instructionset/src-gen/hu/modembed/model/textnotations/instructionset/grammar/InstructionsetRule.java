/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class InstructionsetRule extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public InstructionsetRule(org.eclipse.emf.ecore.EClass metaclass, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice choice, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality) {
		super(cardinality, new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice getDefinition() {
		return (hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice) getChildren()[0];
	}
	
}

