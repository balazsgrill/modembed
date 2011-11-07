/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.MemoryManager;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.OPERATION;
import hu.e.compiler.internal.model.symbols.IArraySymbol;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.Type;

/**
 * @author balazs.grill
 *
 */
public class ArrayVariableSymbol extends VariableSymbol implements IArraySymbol {
	
	/**
	 * @param address
	 * @param type
	 */
	public ArrayVariableSymbol(ISymbol address, Type type) {
		super(address, type);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.IArraySymbol#getElement(int)
	 */
	@Override
	public ISymbol getElement(ISymbolManager sm, int index) throws ECompilerException {
		MemoryManager memman = sm.getVariableManager().getMemoryManager();
		ArrayTypeDef atd = (ArrayTypeDef)getType().getDef();
		int length = ((ILiteralSymbol)sm.resolve(atd.getLength())).getValue();

		if (index < 0)
			return null;
		if (index >= length)
			return null;
		int asize = memman.getSize(sm, atd.getType());
		Type t = atd.getType();
		return VariableSymbol.create(new OperationSymbol(null, getAddressSymbol(), OPERATION.ADD, new LiteralSymbol(index*asize), sm), t);
	}

}
