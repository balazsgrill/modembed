/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.internal.namespaces.Namespace;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodCall;

import java.util.HashMap;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class MethodContext extends Namespace{

	public final ModuleInstance namespace;
	
	private final MethodDescriptor md;
	public final MethodContext parent;
	
	public MethodContext(ModuleInstance namespace) {
		this.namespace = namespace;
		this.parent = null;
		this.md = null;
	}
	
	public MethodContext(MethodContext parent, MethodDescriptor md) throws CompilerException {
		this.namespace = md.namespace;
		this.md = md;
		this.parent = parent;
		/*
		 * Check for recursion 
		 */
		MethodContext mc = parent;
		while(mc != null){
			MethodDescriptor pmd = mc.md;
			if (md.equals(pmd)) throw new CompilerException("Recursive call of methods is not allowed!");
			mc = mc.parent;
		}
	}
	
	public final Map<String, Namespace> parameters = new HashMap<String, Namespace>();
	
	public final Map<String, ISymbol> labels = new HashMap<String, ISymbol>();
	
	public final Map<MethodCall, MethodContext> subcontexts = new HashMap<MethodCall, MethodContext>();

	@Override
	public Namespace getSubnamespace(String s) {
		Namespace mi = parameters.get(s);
		if (mi != null) return mi;
		return namespace.getSubnamespace(s);
	}

	@Override
	public ISymbol getSymbol(String name) throws CompilerException {
		ISymbol label = labels.get(name);
		if (label != null) return label;
		return namespace.getSymbol(name);
	}

	@Override
	public MethodDescriptor getMethod(String name) throws CompilerException {
		return namespace.getMethod(name);
	}
	
}
