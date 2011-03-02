/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder;

import java.util.Map;

import memory.MemoryModel;

import org.eclipse.core.runtime.IProgressMonitor;

import hexfile.HexFile;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;

/**
 * Interface for modular assembly compiler
 * 
 * @author balage
 *
 */
public interface ICompiler {

	public void setMain(Module main);
	
	public void setArchResolver(IArchitectureResolver resolver);
	
	public void setModuleResolver(IModuleResolver resolver);
	
	public void setMemoryModel(MemoryModel memmodel);
	
	public HexFile compile(IProgressMonitor monitor) throws CompilerException;
	
	public Map<String, Long> getSymbolMapping();
	
}
