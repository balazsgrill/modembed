/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import hu.cubussapiens.modembed.modularasm.builder.CompilerException;
import hu.cubussapiens.modembed.modularasm.builder.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.LiteralSymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instance;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;
import hu.cubussapiens.modembed.modularasm.modularASM.Symbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Variable;

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
	
	public final Map<String, ISymbol> symbols = new HashMap<String, ISymbol>();
	
	public final Map<String, ModuleInstance> instances = new HashMap<String, ModuleInstance>();
	
	private ModuleInstance parent = null;
	private String nameInParent = null;
	
	public ISymbol resolveReference(QualifiedID qid) throws CompilerException{
		ModuleInstance namespace = this;
		for (int i = 0;i<qid.getSegments().size()-1;i++){
			String n = qid.getSegments().get(i);
			namespace = instances.get(n);
			if (namespace == null)
				throw new CompilerException("Could not resolve namespace: "+MASMCompilerPlugin.qualIDtoString(qid));
		}
		ISymbol s = null;
		String last = qid.getSegments().get(qid.getSegments().size()-1);
		
		s = namespace.symbols.get(last);
		if (s != null) return s;
		
		s = namespace.variables.get(last);
		if (s != null) return s;
		
		s = namespace.functions.get(last);
		if (s != null) return s;
		
		throw new CompilerException("Could not resolve symbol: "+last);
	}
	
	public ModuleInstance(Module module, CompilationManager manager) throws CompilerException {
		this.type = module;
		this.manager = manager;
		
		for(ModuleItem item : module.getItems()){
			if (item instanceof Variable){
				Variable v = ((Variable) item);
				VariableInstance vi = new VariableInstance(this, v);
				ISymbol vs = manager.symbolManager.createVariableSymbol(vi);
				variables.put(v.getName(), vs);
			}
			if (item instanceof Instance){
				Instance i = (Instance)item;
				Module m = manager.getModuleDef(i.getType());
				if (m == null) throw new CompilerException("Can't resolve module: "+MASMCompilerPlugin.qualIDtoString(i.getType()));
				ModuleInstance mi = manager.instantiate(m);
				mi.parent = this;
				mi.nameInParent = i.getName();
				instances.put(i.getName(), mi);
			}
			if (item instanceof Function){
				Function f = (Function)item;
				FunctionInstance fi = new FunctionInstance(this, f);
				ISymbol fs = manager.symbolManager.createFunctionSymbol(fi);
				functions.put(f.getName(), fs);
			}
			if (item instanceof Symbol){
				Symbol s = (Symbol)item;
				ISymbol sy = new LiteralSymbol(s.getValue());
				symbols.put(s.getName(), sy);
			}
		}
	}
	
	public String getRootReference(){
		if (parent != null){
			String r = parent.getRootReference(); 
			return (r.isEmpty() ? "" : r+".")+nameInParent;
		}
		return "";
	}
	
}
