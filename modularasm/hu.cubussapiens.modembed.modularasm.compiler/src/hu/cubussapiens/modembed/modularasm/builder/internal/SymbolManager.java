/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.FunctionSymbol;
import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.VariableSymbol;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class SymbolManager {

	public final List<VariableInstance> variables = new ArrayList<VariableInstance>();
	
	public final List<FunctionInstance> functions = new ArrayList<FunctionInstance>();
	
	public ISymbol createVariableSymbol(VariableInstance var){
		variables.add(var);
		return new VariableSymbol(var, this);
	}
	
	public ISymbol createFunctionSymbol(FunctionInstance finstance){
		functions.add(finstance);
		ISymbol fs = new FunctionSymbol(finstance, this);
		finstance.rootSymbol = fs;
		return fs;
	}
	
}
