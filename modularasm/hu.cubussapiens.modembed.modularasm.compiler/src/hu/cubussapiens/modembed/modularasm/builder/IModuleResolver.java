/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder;

import hu.cubussapiens.modembed.modularasm.modularASM.Module;

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
	public Module resolveModule(String moduleID);
	
}
