/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal.symbols;

import hu.cubussapiens.modembed.modularasm.builder.internal.FunctionInstance;
import hu.cubussapiens.modembed.modularasm.builder.internal.SymbolManager;

/**
 * @author balazs.grill
 *
 */
public class FunctionSymbol implements ISymbol {

	private final FunctionInstance f;
	//private final SymbolManager smanager;
	
	/**
	 * 
	 */
	public FunctionSymbol(FunctionInstance f, SymbolManager smanager) {
		this.f = f;
		//this.smanager = smanager;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol#getValue()
	 */
	@Override
	public int getValue() {
		return f.address;
	}

}
