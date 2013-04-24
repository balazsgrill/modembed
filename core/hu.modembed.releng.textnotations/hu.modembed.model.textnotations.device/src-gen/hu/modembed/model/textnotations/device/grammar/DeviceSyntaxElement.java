/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class DeviceSyntaxElement {
	
	private DeviceSyntaxElement[] children;
	private DeviceSyntaxElement parent;
	private hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality;
	
	public DeviceSyntaxElement(hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality, DeviceSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (DeviceSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(DeviceSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public DeviceSyntaxElement getParent() {
		return parent;
	}
	
	public DeviceSyntaxElement[] getChildren() {
		if (children == null) {
			return new DeviceSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public hu.modembed.model.textnotations.device.grammar.DeviceCardinality getCardinality() {
		return cardinality;
	}
	
}
