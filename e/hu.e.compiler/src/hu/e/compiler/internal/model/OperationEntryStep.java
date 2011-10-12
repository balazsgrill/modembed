/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.parser.eSyntax.Variable;

import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class OperationEntryStep implements IProgramStep {

	public final String operation;
	
	private final Map<Variable, ISymbol> params;
	
	public OperationEntryStep(String operation, Map<Variable, ISymbol> params) {
		this.operation = operation;
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
