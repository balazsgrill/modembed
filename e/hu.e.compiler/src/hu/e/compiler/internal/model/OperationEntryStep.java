/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.Package;
import hu.e.parser.eSyntax.Variable;

import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class OperationEntryStep implements IProgramStep {

	public final String operation;
	
	private final Map<Variable, ISymbol> params;
	
	public OperationEntryStep(Operation operation, Map<Variable, ISymbol> params) throws ECompilerException {
		Package pack = (Package)operation.eContainer();
		if (pack == null){
			throw new ECompilerException(operation, "Invalid operation call, no package for "+operation.getName());
		}
		this.operation = pack.getName()+"::"+operation.getName();
		this.params = params;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		boolean f = true;
		for(Variable v : params.keySet()){
			if (f) f = false;
			else sb.append(",");
			sb.append(" ");sb.append(v.getName());
			sb.append(" = ");sb.append(params.get(v));
		}
		return operation+"("+sb.toString()+")";
	}
	
}
