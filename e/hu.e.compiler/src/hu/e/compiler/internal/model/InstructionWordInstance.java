/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.LabelSymbol;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.LiteralValue;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.WordSection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class InstructionWordInstance implements IProgramStep{

	private class IncludeSymbol{
		public final ILiteralSymbol symbol;
		public final int start;
		public final int size;
		public final int shift;
		public IncludeSymbol(ILiteralSymbol symbol, int start, int size, int shift) {
			super();
			this.symbol = symbol;
			this.start = start;
			this.size = size;
			this.shift = shift;
		}
		
		public int getValue() throws ECompilerException{
			int v = (symbol != null) ? symbol.getValue() : 0;
			v = v>>shift;
			v = v%(1<<size);
			v = v<<start;
			return v;
		}
	}
	
	private final List<IncludeSymbol> symbols = new ArrayList<InstructionWordInstance.IncludeSymbol>();
	
	private final List<LabelSymbol> labeluses = new ArrayList<LabelSymbol>();
	
	public List<LabelSymbol> getLabeluses() {
		return labeluses;
	}
	
	public InstructionWordInstance(InstructionWord word, ISymbolManager sm) throws ECompilerException {
		List<WordSection> sections = word.getSections();
		
		int s = 0;
		for(int i=sections.size()-1;i>=0;i--){
			WordSection ws = sections.get(i);
			
			int size = -1;
			int shift = -1;
			ILiteralSymbol symbol = null;
			
			if (ws instanceof LiteralValue){
				size = ((LiteralValue) ws).getSize();
				shift = ((LiteralValue) ws).getShift();
				symbol = new LiteralSymbol(ECompiler.convertLiteral(((LiteralValue) ws).getValue()));
			}
			if (ws instanceof VariableReference){
				size = ((VariableReference) ws).getSize();
				shift = ((VariableReference) ws).getShift();
				Variable var = ((VariableReference)ws).getVar();
				if (var instanceof Label){
					LabelSymbol ls = new LabelSymbol((Label)var);
					sm.addLabelSymbol(ls);
					labeluses.add(ls);
					symbol = ls;
				}else{
					ISymbol vs = sm.getSymbol(var);
					if (vs == null)
						throw new ECompilerException(ws, "Cannot resolve symbol: "+((VariableReference)ws).getVar());
					if (!vs.isLiteral())
						throw new ECompilerException(ws, "Instruction word can only contain compile-time variables!");
					symbol = (ILiteralSymbol)vs;
				}
			}
			
			symbols.add(new IncludeSymbol(symbol, s, size, shift));
			s += size;
		}
	}
	
	public int getWidth(){
		int r = 0;
		for(IncludeSymbol is : symbols){
			r += is.size;
		}
		return r/8 + ((r%8==0)?0:1);
	}
	
	public int getValue() throws ECompilerException{
		int r = 0;
		for(IncludeSymbol is : symbols){
			r += is.getValue();
		}
		return r;
	}
	
}
