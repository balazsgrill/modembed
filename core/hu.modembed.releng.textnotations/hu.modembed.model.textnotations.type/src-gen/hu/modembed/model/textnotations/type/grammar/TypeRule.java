/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class TypeRule extends hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public TypeRule(org.eclipse.emf.ecore.EClass metaclass, hu.modembed.model.textnotations.type.grammar.TypeChoice choice, hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality) {
		super(cardinality, new hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public hu.modembed.model.textnotations.type.grammar.TypeChoice getDefinition() {
		return (hu.modembed.model.textnotations.type.grammar.TypeChoice) getChildren()[0];
	}
	
}

