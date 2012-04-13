/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.IReferenceSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.InstructionStep;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.Reference;
import hu.e.parser.eSyntax.InstructionWord;
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
public class InstructionWordInstance{
	
	public static int getItemValue(int value, int shift, int start, int size){
		int v = value;
		v = v>>shift;
		v = v%(1<<size);
		v = v<<start;
		return v;
	}
	
	private final List<Reference> labelRefs = new ArrayList<Reference>();
	
	private int value;
	private int size;
	
	public InstructionWordInstance(InstructionWord word, ISymbolManager sm) throws ECompilerException {
		List<WordSection> sections = word.getSections();
		
		int s = 0;
		value = 0;
		this.size = 0;
		for(int i=sections.size()-1;i>=0;i--){
			WordSection ws = sections.get(i);
			
			int size = -1;
			int shift = -1;
			int v = 0;
			
			if (ws instanceof LiteralValue){
				size = ((LiteralValue) ws).getSize();
				shift = ((LiteralValue) ws).getShift();
				v = ECompiler.convertLiteral(((LiteralValue) ws).getValue());
				value += getItemValue(v, shift, s, size);
			}
			if (ws instanceof VariableReference){
				size = ((VariableReference) ws).getSize();
				shift = ((VariableReference) ws).getShift();
				Variable var = ((VariableReference)ws).getVar();


				ISymbol vs = sm.getSymbol(var);
				if (vs == null)
					throw new ECompilerException(ws, "Cannot resolve symbol: "+((VariableReference)ws).getVar());
				if (!vs.isLiteral())
					throw new ECompilerException(ws, "Instruction word can only contain compile-time variables!");

				if (vs instanceof IReferenceSymbol){
					Reference ref = ListFactory.eINSTANCE.createReference();
					ref.setShift(shift);
					ref.setSize(size);
					ref.setStart(s);
					ref.setValue(((IReferenceSymbol) vs).getReferableValue());
					ref.setOffset(((IReferenceSymbol) vs).getOffset());
					labelRefs.add(ref);
				} else{	
					v = ((ILiteralSymbol)vs).getValue();
					value += getItemValue(v, shift, s, size);
				}

			}
			
			s += size;
		}
		
		this.size = s;
	}
	
	public int getWidth(){
		return size;
	}
	
	public int getValue(){
		return value;
	}
	
	public InstructionStep create() throws ECompilerException{
		InstructionStep is = ListFactory.eINSTANCE.createInstructionStep();
		is.setCode(getValue());
		is.setWidth(getWidth());
		is.getRefs().addAll(labelRefs);
		return is;
	}
	
}
