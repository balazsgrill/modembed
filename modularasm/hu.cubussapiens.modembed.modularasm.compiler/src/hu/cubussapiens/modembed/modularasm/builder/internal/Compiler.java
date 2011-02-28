/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

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

	public Module main;
	public IArchitectureResolver archresolver;
	public IModuleResolver modresolver;
	
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
		
		monitor.beginTask("Compiling..", 100);
		
		/*
		 * Instantiate main module, which will trigger the preparation
		 * of the full software architecture
		 */
		CompilationManager cmanager = new CompilationManager(this);
		cmanager.instantiate(main);
		monitor.worked(1);
		
		/*
		 * Preparing function instances
		 */
		IProgressMonitor sm = new SubProgressMonitor(monitor, 49);
		sm.beginTask("Compiling functions..", cmanager.symbolManager.functions.size());
		for(FunctionInstance fi : cmanager.symbolManager.functions){
			fi.prepare();
			sm.worked(1);
		}
		sm.done();
		
		monitor.done();
		return null;
	}

}
