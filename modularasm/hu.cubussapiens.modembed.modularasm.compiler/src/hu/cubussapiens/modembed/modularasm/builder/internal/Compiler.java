/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import hexfile.HexFile;
import hu.cubussapiens.modembed.modularasm.builder.CompilerException;
import hu.cubussapiens.modembed.modularasm.builder.IArchitectureResolver;
import hu.cubussapiens.modembed.modularasm.builder.ICompiler;
import hu.cubussapiens.modembed.modularasm.builder.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;

/**
 * @author balage
 *
 */
public class Compiler implements ICompiler {

	Module main;
	IArchitectureResolver archresolver;
	IModuleResolver modresolver;
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.ICompiler#setMain(hu.cubussapiens.modembed.modularasm.modularASM.Module)
	 */
	@Override
	public void setMain(Module main) {
		this.main = main;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.ICompiler#setArchResolver(hu.cubussapiens.modembed.modularasm.builder.IArchitectureResolver)
	 */
	@Override
	public void setArchResolver(IArchitectureResolver resolver) {
		this.archresolver = resolver;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.ICompiler#setModuleResolver(hu.cubussapiens.modembed.modularasm.builder.IModuleResolver)
	 */
	@Override
	public void setModuleResolver(IModuleResolver resolver) {
		this.modresolver = resolver;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.ICompiler#compile(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public HexFile compile(IProgressMonitor monitor) throws CompilerException{
		
		Map<String, Module> modules = new HashMap<String, Module>();
		Map<Module, ModuleCompiler> compilers = new HashMap<Module, ModuleCompiler>();
		
		compilers.put(main, new ModuleCompiler(main));
		
		return null;
	}

}
