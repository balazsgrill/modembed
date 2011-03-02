/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler;

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
	
}
