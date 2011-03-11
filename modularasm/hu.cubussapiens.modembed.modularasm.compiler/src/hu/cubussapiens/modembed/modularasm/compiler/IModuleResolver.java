/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler;

import java.util.List;

import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

/**
 * Implementors of this interface are responsible for resolving
 * modules based in qualified IDs.
 * 
 * @author balage
 *
 */
public interface IModuleResolver {

	/**
	 * Try to resolve the given Module. Returns null if the module
	 * could not be found
	 * 
	 * @param moduleID
	 * @return
	 */
	public Module resolveModule(QualifiedID moduleID);
	
	/**
	 * List the available packages, which are located
	 * under the given package (denoted by the sections)
	 * @return
	 */
	public String[] getSubPackages(List<String> sections);
	
	/**
	 * List the available modules, which are located
	 * under the given package (denoted by the sections)
	 * @param sections
	 * @return
	 */
	public String[] getModules(List<String> sections);
	
}
