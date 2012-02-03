/**
 * 
 */
package hu.e.parser.scoping;

import hu.e.parser.eSyntax.CompilationUnit;
import hu.modembed.MODembedCore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
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
		
		for(String d : deps){
			try {
				for(URI uri : MODembedCore.getVisibleResources(d,"e")){
					try{
						Resource r = resourceset.getResource(uri, true);
						for(EObject eo : r.getContents()){
							if (eo instanceof CompilationUnit){
								String name = ((Package) eo).getName();
								QualifiedName qname = QualifiedName.create(name.split("\\."));
								descs.add(EObjectDescription.create(qname, eo));
							}
						}
					}catch(Exception e){
						
					}
				}
			} catch (CoreException e) {
				
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
