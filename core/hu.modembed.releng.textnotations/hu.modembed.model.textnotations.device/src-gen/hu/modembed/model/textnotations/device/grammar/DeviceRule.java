/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class DeviceRule extends hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public DeviceRule(org.eclipse.emf.ecore.EClass metaclass, hu.modembed.model.textnotations.device.grammar.DeviceChoice choice, hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality) {
		super(cardinality, new hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public hu.modembed.model.textnotations.device.grammar.DeviceChoice getDefinition() {
		return (hu.modembed.model.textnotations.device.grammar.DeviceChoice) getChildren()[0];
	}
	
}

