/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeParseResult implements hu.modembed.model.textnotations.type.ITypeParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	
	private hu.modembed.model.textnotations.type.ITypeLocationMap locationMap;
	
	private java.util.Collection<hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>> commands = new java.util.ArrayList<hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>>();
	
	public TypeParseResult() {
		super();
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public hu.modembed.model.textnotations.type.ITypeLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(hu.modembed.model.textnotations.type.ITypeLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
