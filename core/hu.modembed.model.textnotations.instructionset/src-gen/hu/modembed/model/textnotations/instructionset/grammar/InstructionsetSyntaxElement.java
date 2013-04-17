/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class InstructionsetSyntaxElement {
	
	private InstructionsetSyntaxElement[] children;
	private InstructionsetSyntaxElement parent;
	private hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality;
	
	public InstructionsetSyntaxElement(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality, InstructionsetSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (InstructionsetSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(InstructionsetSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public InstructionsetSyntaxElement getParent() {
		return parent;
	}
	
	public InstructionsetSyntaxElement[] getChildren() {
		if (children == null) {
			return new InstructionsetSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality getCardinality() {
		return cardinality;
	}
	
}
