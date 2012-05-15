/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.PointerTypeDef;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

/**
 * @author balazs.grill
 *
 */
public class TypeDefinitionResolver {

	private final int memwidth;
	
	private final int pointerwidth;
	
	public TypeDefinitionResolver(int memwidth, int pointerwidth) {
		this.memwidth = memwidth;
		this.pointerwidth = pointerwidth;
	}
	
	public int getSize(ISymbolManager sm, TypeDef td) throws ECompilerException{
		if (td instanceof DataTypeDef){
			boolean full = ((((DataTypeDef) td).getBits()%memwidth) == 0);
			return (((DataTypeDef) td).getBits()/memwidth) + (full?0:1);
		}
		if (td instanceof ArrayTypeDef){
			int baseSize = getSize(sm, ((ArrayTypeDef) td).getDef());
			ILiteralSymbol length = (ILiteralSymbol)sm.resolve(((ArrayTypeDef)td).getSize());
			return baseSize*(int)length.getValue();
		}
		if (td instanceof StructTypeDef){
			int size = 0;
			for(Variable m : ((StructTypeDef) td).getMembers()){
				size+=getSize(sm,m.getType());
			}
			return size;
		}
		if (td instanceof PointerTypeDef){
			return pointerwidth;
		}
		if (td instanceof RefTypeDef){
			return getSize(sm, ((RefTypeDef) td).getType().getDef());
		}
		return 0;
	}
	
	public static String getTypeDefString(TypeDef td){
		if (td == null) return "null";
		
		if (td instanceof DataTypeDef){
			return ((DataTypeDef) td).getKind()+"("+((DataTypeDef) td).getBits()+" bits)";
		}
		
		if (td instanceof PointerTypeDef){
			return "&"+getTypeDefString(((PointerTypeDef) td).getDef());
		}
		
		if (td instanceof RefTypeDef){
			Type t = ((RefTypeDef) td).getType();
			Library l = (Library)t.eContainer();
			
			return l.getName()+"."+t.getName();
		}
		
		return td.toString();
	}
	
}
