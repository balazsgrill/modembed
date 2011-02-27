/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import java.util.HashMap;
import java.util.Map;

import hu.cubussapiens.modembed.modularasm.builder.CompilerException;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instance;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem;
import hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl;

/**
 * @author balage
 *
 */
public class ModuleCompiler {

	public final Module module;
	
	public final Map<String, VariableDecl> variables = new HashMap<String, VariableDecl>();
	
	public final Map<String, Instance> instances = new HashMap<String, Instance>();
	
	public final Map<String, Function> functions = new HashMap<String, Function>();
	
	public ModuleCompiler(Module module) throws CompilerException {
		this.module = module;
		for(ModuleItem item : module.getItems()){
			if (item instanceof VariableDecl){
				variables.put(((VariableDecl) item).getVariable().getName(), (VariableDecl)item);
			}
			if (item instanceof Instance){
				Instance i = (Instance)item;
				instances.put(i.getName(), i);
			}
			if (item instanceof Function){
				Function f = (Function)item;
				functions.put(f.getName(), f);
			}
		}
	}
	
}
