/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

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
	
	private final Compiler compiler;
	
	public final InstructionManager insManager;
	
	public CompilationManager(Compiler compiler) {
		this.compiler = compiler;
		
		insManager = new InstructionManager(
				compiler.archresolver.getInstructionSet(MASMCompilerPlugin.qualIDtoString(compiler.main.getTarget()), 
				resourceSet));
	}
	
	public Module getModuleDef(QualifiedID moduleID){
		String name = MASMCompilerPlugin.qualIDtoString(moduleID);
		Module m = modules.get(name);
		if (m == null){
			m = compiler.modresolver.resolveModule(moduleID);
			if (m != null){
				modules.put(name, m);
			}
		}
		return m;
	}
	
	public ModuleInstance instantiate(Module module) throws CompilerException{
		
		ModuleInstance mi = new ModuleInstance(module, this);
		instances.add(mi);
		return mi;
	}
	
}
