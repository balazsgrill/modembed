/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.resolvers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

/**
 * @author balazs.grill
 *
 */
public class MultipleModuleResolver implements IModuleResolver {

	private IModuleResolver[] resolvers;
	
	/**
	 * 
	 */
	public MultipleModuleResolver(IModuleResolver...resolvers) {
		this.resolvers = resolvers;
	}

	protected void setResolvers(IModuleResolver[] resolvers) {
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

	@Override
	public String[] getSubPackages(List<String> sections) {
		Set<String> result = new HashSet<String>();
		for(IModuleResolver mr : resolvers){
			result.addAll(Arrays.asList(mr.getSubPackages(sections)));
		}
		return result.toArray(new String[result.size()]);
	}

	@Override
	public String[] getModules(List<String> sections) {
		List<String> result = new ArrayList<String>();
		for(IModuleResolver mr : resolvers){
			result.addAll(Arrays.asList(mr.getModules(sections)));
		}
		return result.toArray(new String[result.size()]);
	}

}
