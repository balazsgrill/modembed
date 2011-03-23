/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.compiler.internal.namespaces.Namespace;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.LiteralSymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord;
import hu.cubussapiens.modembed.modularasm.modularASM.Function;
import hu.cubussapiens.modembed.modularasm.modularASM.Instance;
import hu.cubussapiens.modembed.modularasm.modularASM.Method;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem;
import hu.cubussapiens.modembed.modularasm.modularASM.Symbol;
import hu.cubussapiens.modembed.modularasm.modularASM.Variable;

import java.util.HashMap;
import java.util.Map;


/**
 * @author balazs.grill
 *
 */
public class ModuleInstance extends Namespace{

	public final Module type;
	public final CompilationManager manager;
	
	public final Map<String, ISymbol> variables = new HashMap<String, ISymbol>();
	
	public final Map<String, ISymbol> functions = new HashMap<String, ISymbol>();
	
	public final Map<String, ISymbol> symbols = new HashMap<String, ISymbol>();
	
	public final Map<String, ISymbol> configurationWords = new HashMap<String, ISymbol>();
	
	public final Map<String, ModuleInstance> instances = new HashMap<String, ModuleInstance>();
	
	public final Map<String, MethodDescriptor> methods = new HashMap<String, MethodDescriptor>();
	
	private ModuleInstance parent = null;
	private String nameInParent = null;
	private ConfigurationWordManager cwManager;
	
	public void prepare() throws CompilerException{
		this.cwManager = new ConfigurationWordManager(this);
		
		for(ModuleItem item : type.getItems()){
			if (item instanceof Variable){
				Variable v = ((Variable) item);
				VariableInstance vi = new VariableInstance(this, v);
				ISymbol vs = manager.symbolManager.createVariableSymbol(vi);
				variables.put(v.getName(), vs);
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
			
			if (item instanceof ConfigurationWord){
				ConfigurationWord cw = (ConfigurationWord)item;
				ISymbol cwsymbol = cwManager.createSymbol(cw);
				if (cwsymbol != null){
					configurationWords.put(cw.getName(), cwsymbol);
				}
			}
			
			if (item instanceof Method){
				Method m = (Method)item;
				methods.put(m.getName(), new MethodDescriptor(this, m));
			}
		}
	}
	
	@Override
	public MethodDescriptor getMethod(String name) throws CompilerException{
		MethodDescriptor md = methods.get(name);
		
		if (md == null)
			throw new CompilerException("Could not resolve method: "+name);
		
		return md;
	}
	
	@Override
	public ISymbol getSymbol(String name) throws CompilerException{
		ISymbol s = null;
		String last = name;
		
		s = symbols.get(last);
		if (s != null) return s;
		
		s = configurationWords.get(last);
		if (s != null) return s;
		
		s = variables.get(last);
		if (s != null) return s;
		
		s = functions.get(last);
		if (s != null) return s;
		
		throw new CompilerException("Could not resolve symbol: "+last);
	}
	
	public ModuleInstance(Module module, CompilationManager manager) throws CompilerException {
		this.type = module;
		this.manager = manager;
		
		for(ModuleItem item : type.getItems()){
			if (item instanceof Instance){
				Instance i = (Instance)item;
				Module m = manager.getModuleDef(i.getType());
				if (m == null) throw new CompilerException("Can't resolve module: "+MASMCompilerPlugin.qualIDtoString(i.getType()));
				ModuleInstance mi = manager.instantiate(m);
				mi.parent = this;
				mi.nameInParent = i.getName();
				instances.put(i.getName(), mi);
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



	@Override
	public Namespace getSubnamespace(String s) {
		return instances.get(s);
	}
	
}
