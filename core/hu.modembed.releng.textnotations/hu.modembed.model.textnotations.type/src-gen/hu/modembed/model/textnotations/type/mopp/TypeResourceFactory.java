/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public TypeResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new hu.modembed.model.textnotations.type.mopp.TypeResource(uri);
	}
	
}
