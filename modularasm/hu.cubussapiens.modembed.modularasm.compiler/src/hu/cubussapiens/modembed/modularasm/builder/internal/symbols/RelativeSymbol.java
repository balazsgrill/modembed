/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal.symbols;

/**
 * @author balage
 *
 */
public class RelativeSymbol implements ISymbol {

	public final ISymbol base;
	
	public final int add;
	
	/**
	 * 
	 */
	public RelativeSymbol(ISymbol base, int add) {
		this.base = base;
		this.add = add;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol#getValue()
	 */
	@Override
	public int getValue() {
		return base.getValue()+add;
	}

}
