/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer.internal;

import java.util.HashMap;
import java.util.Map;

import hu.cubussapiens.modembed.modularasm.compiler.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.compiler.resolvers.ExtensionPointModuleResolver;
import hu.cubussapiens.modembed.modularasm.compiler.resolvers.MultipleModuleResolver;
import hu.cubussapiens.modembed.modularasm.indexer.IModuleIndexer;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

/**
 * @author balazs.grill
 *
 */
public class SharedModuleIndexer extends MultipleModuleResolver
		implements IModuleIndexer {

	private final Map<String, Module> modules = new HashMap<String, Module>();
	
	/**
	 * @param resolvers
	 */
	public SharedModuleIndexer() {
		super(new ExtensionPointModuleResolver());
	}

	@Override
	public Module resolveModule(QualifiedID moduleID) {
		String id = MASMCompilerPlugin.qualIDtoString(moduleID);
		Module m = modules.get(id);
		if (m == null){
			m = super.resolveModule(moduleID);
			modules.put(id, m);
		}
		return m;
	}
	
}
