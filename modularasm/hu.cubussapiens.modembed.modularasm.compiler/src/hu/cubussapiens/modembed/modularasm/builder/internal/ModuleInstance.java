/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instance;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem;
import hu.cubussapiens.modembed.modularasm.modularASM.Variable;
import hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl;

import java.util.HashMap;
import java.util.Map;


/**
 * @author balazs.grill
 *
 */
public class ModuleInstance {

	public final Module type;
	public final CompilationManager manager;
	
	public final Map<String, ISymbol> variables = new HashMap<String, ISymbol>();
	
	public final Map<String, ISymbol> functions = new HashMap<String, ISymbol>();
	
	public ModuleInstance(Module module, CompilationManager manager) {
		this.type = module;
		this.manager = manager;
		
		for(ModuleItem item : module.getItems()){
			if (item instanceof VariableDecl){
				Variable v = ((VariableDecl) item).getVariable();
				VariableInstance vi = new VariableInstance(this, v);
				ISymbol vs = manager.symbolManager.createVariableSymbol(vi);
				variables.put(v.getName(), vs);
			}
			if (item instanceof Instance){
				Instance i = (Instance)item;
				//instances.put(i.getName(), i);
			}
			if (item instanceof Function){
				Function f = (Function)item;
				FunctionInstance fi = new FunctionInstance(this, f);
				ISymbol fs = manager.symbolManager.createFunctionSymbol(fi);
				functions.put(f.getName(), fs);
			}
		}
		
		//for(Variable v)
	}
	
}
