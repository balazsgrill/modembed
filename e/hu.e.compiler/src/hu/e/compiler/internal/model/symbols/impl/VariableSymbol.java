/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class VariableSymbol implements IVariableSymbol{

	private final ISymbol address;

	private final Type type;

	public static IVariableSymbol create(ISymbol address, Type type){
		TypeDef td = type.getDef();
		if (td instanceof ArrayTypeDef){
			return new ArrayVariableSymbol(address, type);
		}
		if (td instanceof StructTypeDef){
			return new StructVariableSymbol(address, type);
		}
		return new VariableSymbol(address, type);
	}
	
	protected VariableSymbol(ISymbol address, Type type) {
		this.address = address;
		this.type = type;
	}

	@Override
	public boolean isLiteral() {
		return false;
	}

	@Override
	public List<IProgramStep> getSteps() {
		return getAddressSymbol().getSteps();
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public ISymbol getAddressSymbol() {
		return address;
	}
	
	@Override
	public String toString() {
		return type.getName()+"@"+address.toString();
	}
	
}
