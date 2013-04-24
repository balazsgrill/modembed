/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ITypeExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(hu.modembed.model.textnotations.type.ITypeExpectedElement follower, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<hu.modembed.model.textnotations.type.util.TypePair<hu.modembed.model.textnotations.type.ITypeExpectedElement, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[]>> getFollowers();
	
}
