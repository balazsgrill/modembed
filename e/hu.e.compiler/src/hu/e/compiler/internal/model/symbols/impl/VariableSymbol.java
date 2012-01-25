/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.MemoryManager;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.OPERATION;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class VariableSymbol implements IVariableSymbol{

	private final ISymbol address;

	private final TypeDef type;

	public static IVariableSymbol create(ISymbol address, TypeDef type){
//		if (td instanceof ArrayTypeDef){
//			return new ArrayVariableSymbol(address, type);
//		}
//		if (td instanceof StructTypeDef){
//			return new StructVariableSymbol(address, type);
//		}
		return new VariableSymbol(address, type);
	}
	
	protected VariableSymbol(ISymbol address, TypeDef type) {
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
	public TypeDef getType() {
		return type;
	}

	@Override
	public ISymbol getAddressSymbol() {
		return address;
	}
	
	@Override
	public String toString() {
		return type.toString()+"@"+address.toString();
	}
	
	private ArrayTypeDef getArrayTypeDef(TypeDef td){
		if (td instanceof ArrayTypeDef) return (ArrayTypeDef)td;
		if (td instanceof RefTypeDef) return getArrayTypeDef(((RefTypeDef) td).getType().getDef());
		return null;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.IArraySymbol#getElement(int)
	 */
	@Override
	public ISymbol getElement(ISymbolManager sm, int index) throws ECompilerException {
		MemoryManager memman = sm.getVariableManager().getMemoryManager();
		ArrayTypeDef atd = getArrayTypeDef(getType());
		
		if (atd == null) return null;
		int length = ((ILiteralSymbol)sm.resolve(atd.getSize())).getValue();

		if (index < 0)
			return null;
		if (index >= length)
			return null;
		int asize = memman.getSize(sm, atd.getDef());
		TypeDef t = atd.getDef();
		return VariableSymbol.create(new OperationSymbol(null, getAddressSymbol(), OPERATION.ADD, new LiteralSymbol(index*asize), sm), t);
	}
	
	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member) throws ECompilerException {
		MemoryManager memman = sm.getVariableManager().getMemoryManager();
		TypeDef td = getType();
		if (td instanceof StructTypeDef){
			StructTypeDef std = (StructTypeDef)td;
			if (std.getMembers().contains(member)){
				int size = 0;
				for(Variable m : std.getMembers()){
					if (member.equals(m)){
						TypeDef t = member.getType();
						return VariableSymbol.create(new OperationSymbol(null, getAddressSymbol(), OPERATION.ADD, new LiteralSymbol(size), sm), t);
					}else{
						size += memman.getSize(sm, m.getType());
					}
				}
			}else{
				return null;
			}
		}
		return null;
	}
	
}
