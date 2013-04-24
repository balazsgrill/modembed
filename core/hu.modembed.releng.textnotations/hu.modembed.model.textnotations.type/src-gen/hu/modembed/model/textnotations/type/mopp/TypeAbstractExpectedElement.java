/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class TypeAbstractExpectedElement implements hu.modembed.model.textnotations.type.ITypeExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<hu.modembed.model.textnotations.type.util.TypePair<hu.modembed.model.textnotations.type.ITypeExpectedElement, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[]>> followers = new java.util.LinkedHashSet<hu.modembed.model.textnotations.type.util.TypePair<hu.modembed.model.textnotations.type.ITypeExpectedElement, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[]>>();
	
	public TypeAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(hu.modembed.model.textnotations.type.ITypeExpectedElement follower, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[] path) {
		followers.add(new hu.modembed.model.textnotations.type.util.TypePair<hu.modembed.model.textnotations.type.ITypeExpectedElement, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.type.util.TypePair<hu.modembed.model.textnotations.type.ITypeExpectedElement, hu.modembed.model.textnotations.type.mopp.TypeContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
