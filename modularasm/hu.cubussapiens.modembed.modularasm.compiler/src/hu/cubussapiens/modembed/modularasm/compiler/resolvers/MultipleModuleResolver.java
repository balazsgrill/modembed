/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.resolvers;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

/**
 * @author balazs.grill
 *
 */
public class MultipleModuleResolver implements IModuleResolver {

	private final IModuleResolver[] resolvers;
	
	/**
	 * 
	 */
	public MultipleModuleResolver(IModuleResolver...resolvers) {
		this.resolvers = resolvers;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver#resolveModule(hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID)
	 */
	@Override
	public Module resolveModule(QualifiedID moduleID) {
		for(IModuleResolver mr : resolvers){
			Module m = mr.resolveModule(moduleID);
			if (m != null) return m;
		}
		return null;
	}

}
