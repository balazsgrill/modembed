/**
 * 
 */
package hu.modembed.index.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import hu.modembed.index.IIndexedModel;

/**
 * @author balazs.grill
 *
 */
public class SimpleIndexedModel implements IIndexedModel {

	private final String qualifiedName;
	private final URI uri;
	private final EClass eclass;
	
	
	public SimpleIndexedModel(String qualifiedName, URI uri, EClass eclass) {
		super();
		this.qualifiedName = qualifiedName;
		this.uri = uri;
		this.eclass = eclass;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.index.IIndexedModel#getQualifiedName()
	 */
	@Override
	public String getQualifiedName() {
		return qualifiedName;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.index.IIndexedModel#getResourceURI()
	 */
	@Override
	public URI getResourceURI() {
		return uri;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.index.IIndexedModel#getEClass()
	 */
	@Override
	public EClass getEClass() {
		return eclass;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.index.IIndexedModel#load(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public EObject load(ResourceSet resourceSet) {
		Resource resource = resourceSet.getResource(uri, true);
		if (resource != null && !resource.getContents().isEmpty())
			return resource.getContents().get(0);
		return null;
	}

}
