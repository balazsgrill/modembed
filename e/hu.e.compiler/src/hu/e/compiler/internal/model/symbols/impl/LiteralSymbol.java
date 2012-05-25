/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

import java.math.BigDecimal;

/**
 * @author balazs.grill
 *
 */
public class LiteralSymbol implements ILiteralSymbol {

	private final BigDecimal value;
	
	private final TypeDef td;
	
	public LiteralSymbol(TypeDef td, long value){
		this(td, new BigDecimal(value));
	}
	
	public LiteralSymbol(TypeDef td, BigDecimal value) {
		if (td == null){
//			DataTypeDef dtd = ESyntaxFactory.eINSTANCE.createDataTypeDef();
//			int bits = 0;
//			long v = 1;
//			while(v <= Math.abs(value)){
//				bits++;
//				v = v<<1;
//			}
//			dtd.setBits(bits);
//			dtd.setKind((value >= 0) ? PrimitiveKind.UNSIGNED : PrimitiveKind.SIGNED);
//			this.td = dtd;
			this.td = null;
		}else{
			this.td = td;
		}
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbol#getValue()
	 */
	@Override
	public BigDecimal getValue() {
		return value;
	}

	@Override
	public boolean isLiteral() {
		return true;
	}

	@Override
	public void addSteps(SequenceStep sequence) {

	}

	@Override
	public TypeDef getType() {
		return td;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	@Override
	public ISymbol getElement(ISymbolManager sm, int index)
			throws ECompilerException {
		return null;
	}

	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member)
			throws ECompilerException {
		return null;
	}
	
}
