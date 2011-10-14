/**
 * 
 */
package hu.e.parser.scoping;

import hu.cubussapiens.modembed.MODembedCore;
import hu.e.parser.eSyntax.Package;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

/**
 * @author balazs.grill
 *
 */
public class PluginDependencyScope extends AbstractScope {

	private final List<IEObjectDescription> descs = new ArrayList<IEObjectDescription>();
	
	/**
	 * @param parent
	 * @param ignoreCase
	 */
	public PluginDependencyScope(URI context,ResourceSet resourceset, IScope parent) {
		super(parent, false);
		String projname = context.trimFragment().segment(1);
		List<String> deps = MODembedCore.collectAllDependencies(projname);
		deps.remove(projname);
		
		for(String d : deps){
			for(URI uri : MODembedCore.getVisibleResources(d)){
				try{
					Resource r = resourceset.getResource(uri, true);
					for(EObject eo : r.getContents()){
						if (eo instanceof Package){
							descs.add(EObjectDescription.create(((Package) eo).getName(), eo));
						}
					}
				}catch(Exception e){
					
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.impl.AbstractScope#getAllLocalElements()
	 */
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return descs;
	}

}
