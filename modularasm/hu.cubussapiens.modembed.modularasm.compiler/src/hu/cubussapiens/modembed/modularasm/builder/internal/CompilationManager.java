/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import hu.cubussapiens.modembed.modularasm.builder.CompilerException;
import hu.cubussapiens.modembed.modularasm.builder.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author balazs.grill
 *
 */
public class CompilationManager {

	public final ResourceSet resourceSet = new ResourceSetImpl();
	
	public final Map<String, Module> modules = new HashMap<String, Module>();
	
	public final List<ModuleInstance> instances = new ArrayList<ModuleInstance>();
	
	public final SymbolManager symbolManager = new SymbolManager();
	
	//private final Compiler compiler;
	
	public final InstructionManager insManager;
	
	public CompilationManager(Compiler compiler) {
		//this.compiler = compiler;
		
		insManager = new InstructionManager(
				compiler.archresolver.getInstructionSet(MASMCompilerPlugin.qualIDtoString(compiler.main.getTarget()), 
				resourceSet));
	}
	
	public ModuleInstance instantiate(Module module) throws CompilerException{
		
		ModuleInstance mi = new ModuleInstance(module, this);
		instances.add(mi);
		return mi;
	}
	
}
