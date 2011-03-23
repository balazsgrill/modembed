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
	
	public MethodContext(ModuleInstance namespace) {
		this.namespace = namespace;
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
