/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.MemoryManager;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.OPERATION;
import hu.e.compiler.internal.model.symbols.IStructSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public class StructVariableSymbol extends VariableSymbol implements IStructSymbol{
	
	public StructVariableSymbol(ISymbol address, Type type) {
		super(address, type);
	}

	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member) throws ECompilerException {
		MemoryManager memman = sm.getVariableManager().getMemoryManager();
		TypeDef td = getType().getDef();
		if (td instanceof StructTypeDef){
			StructTypeDef std = (StructTypeDef)td;
			if (std.getMembers().contains(member)){
				int size = 0;
				for(StructTypeDefMember m : std.getMembers()){
					if (member.equals(m)){
						Type t = member.getType();
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
