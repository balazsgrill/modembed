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
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

/**
 * @author balazs.grill
 *
 */
public class ProjectDependencyScope extends AbstractScope {

	private final List<IEObjectDescription> descs = new ArrayList<IEObjectDescription>();
	
	/**
	 * @param parent
	 * @param ignoreCase
	 */
	public ProjectDependencyScope(URI context,ResourceSet resourceset, IScope parent) {
		super(parent, false);
		String projname = context.trimFragment().segment(1);
		
		try {
			for(URI uri : MODembedCore.getDefault().getResourceProvider().getResources(projname,"e")){
				try{
					Resource r = resourceset.getResource(uri, true);
					for(EObject eo : r.getContents()){
						if (eo instanceof CompilationUnit){
//							String name = ((CompilationUnit) eo).getName();
//							QualifiedName qname = QualifiedName.create(name.split("\\."));
//							descs.add(EObjectDescription.create(qname, eo));
						}
					}
				}catch(Exception e){

				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
