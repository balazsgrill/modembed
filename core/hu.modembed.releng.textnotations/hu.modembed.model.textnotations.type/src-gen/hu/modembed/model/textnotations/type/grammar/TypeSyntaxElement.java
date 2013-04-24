/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class TypeSyntaxElement {
	
	private TypeSyntaxElement[] children;
	private TypeSyntaxElement parent;
	private hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality;
	
	public TypeSyntaxElement(hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality, TypeSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (TypeSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(TypeSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public TypeSyntaxElement getParent() {
		return parent;
	}
	
	public TypeSyntaxElement[] getChildren() {
		if (children == null) {
			return new TypeSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public hu.modembed.model.textnotations.type.grammar.TypeCardinality getCardinality() {
		return cardinality;
	}
	
}
