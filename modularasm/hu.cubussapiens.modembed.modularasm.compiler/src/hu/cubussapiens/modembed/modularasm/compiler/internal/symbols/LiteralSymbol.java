/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal.symbols;

/**
 * @author balazs.grill
 *
 */
public class LiteralSymbol implements ISymbol {

	private final int value;
	
	/**
	 * 
	 */
	public LiteralSymbol(int value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol#getValue()
	 */
	@Override
	public int getValue() {
		return value;
	}

}
