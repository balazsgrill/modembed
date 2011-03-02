/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal.symbols;

import hu.cubussapiens.modembed.modularasm.builder.internal.SymbolManager;
import hu.cubussapiens.modembed.modularasm.builder.internal.VariableInstance;

/**
 * @author balazs.grill
 *
 */
public class VariableSymbol implements ISymbol {

	private final VariableInstance v;
	//private final SymbolManager smanager;
	
	/**
	 * 
	 */
	public VariableSymbol(VariableInstance v, SymbolManager smanager) {
		this.v = v;
		//this.smanager = smanager;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol#getValue()
	 */
	@Override
	public int getValue() {
		return v.address;
	}

}
