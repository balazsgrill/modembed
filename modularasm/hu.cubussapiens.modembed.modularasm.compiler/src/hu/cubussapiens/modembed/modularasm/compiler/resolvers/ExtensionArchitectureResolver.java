/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.resolvers;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import embedded.assembly.InstructionSet;
import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.modularasm.compiler.IArchitectureResolver;

/**
 * @author balazs.grill
 *
 */
public class ExtensionArchitectureResolver implements IArchitectureResolver {

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.IArchitectureResolver#getInstructionSet(java.lang.String)
	 */
	@Override
	public InstructionSet getInstructionSet(String archid, ResourceSet resourceSet) {
		URL url = MODembedCore.getDefault().getInstructionSetModel(archid);
		if (url == null) return null;
		Resource r = resourceSet.getResource(URI.createURI(url.toString()), true);
		EObject eo = r.getContents().get(0);
		return (eo instanceof InstructionSet) ? (InstructionSet)eo : null;
	}

}
