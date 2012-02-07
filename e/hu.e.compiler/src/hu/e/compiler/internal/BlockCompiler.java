/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.CompilationErrorEntry;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.internal.model.symbols.impl.CodeAddressSymbol;
import hu.e.compiler.list.LabelReference;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XIfExpression;

import java.util.HashMap;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class BlockCompiler {

	private final OperationBlock block;
	
	public BlockCompiler(OperationBlock block) {
		this.block = block;
	}
	
	public ProgramStep compile(ISymbolManager sm){
		SequenceStep result = ListFactory.eINSTANCE.createSequenceStep();
		
		Map<Label, LabelStep> labels = new HashMap<Label, LabelStep>();
		Map<LabelReference, Label> labeluses = new HashMap<LabelReference, Label>();
		
		sm.getVariableManager().startBlock();
		for(OperationStep step : block.getSteps()){
			if (step instanceof InstructionWord){
				try{
					InstructionWordInstance iwi = new InstructionWordInstance((InstructionWord)step, sm);
					result.getSteps().add(iwi.create());
					labeluses.putAll(iwi.getLabeluses());
				}catch(ECompilerException e){
					result.getSteps().add((CompilationErrorEntry.create(e)));
				}
			}
			if (step instanceof Variable){
				if (step instanceof Label){
					LabelStep ls = ListFactory.eINSTANCE.createLabelStep();
					labels.put((Label)step, ls);
					result.getSteps().add(ls);
				}else{
					try{
						sm.getVariableManager().define(sm, (Variable)step);
					}catch(ECompilerException e){
						result.getSteps().add(CompilationErrorEntry.create(e));
					}
				}
			}
			if (step instanceof XExpression){
				try {
					ISymbol s = sm.resolve((XExpression)step);
					result.getSteps().addAll(s.getSteps());
				} catch (ECompilerException e) {
					result.getSteps().add(CompilationErrorEntry.create(e));
				}
			}
			if (step instanceof XIfExpression){
				try{
					ISymbol symbol = sm.resolve(((XIfExpression) step).getIf());
					result.getSteps().addAll(symbol.getSteps());

					if (symbol.isLiteral()){
						//Literal condition, decide in compile time
						int v = ((ILiteralSymbol)symbol).getValue();
						OperationBlock ifblock = (v==0) ? ((XIfExpression) step).getElse() : ((XIfExpression) step).getThen();
						if (ifblock != null){
							BlockCompiler subBlock = new BlockCompiler(ifblock);
							result.getSteps().add(subBlock.compile(sm));
						}
					}else{
						//Runtime condition
						IVariableSymbol v = (IVariableSymbol)symbol;
						LabelStep trueLabel = ListFactory.eINSTANCE.createLabelStep();
						LabelStep falseLabel = ListFactory.eINSTANCE.createLabelStep();
						LabelStep endLabel = ListFactory.eINSTANCE.createLabelStep();

						OperationBlock trueBlock = ((XIfExpression) step).getThen();
						OperationBlock falseBlock = ((XIfExpression) step).getElse();

						if (falseBlock == null){
							result.getSteps().addAll(sm.executeOperator(OperationRole.BRANCH, step, v, 
									new CodeAddressSymbol(trueLabel), new CodeAddressSymbol(endLabel)).getSteps());
							result.getSteps().add(trueLabel);
							result.getSteps().add(new BlockCompiler(trueBlock).compile(sm));
							result.getSteps().add(endLabel);
						}else{
							result.getSteps().addAll(sm.executeOperator(OperationRole.BRANCH,step, v, 
									new CodeAddressSymbol(trueLabel), new CodeAddressSymbol(falseLabel)).getSteps());
							result.getSteps().add(trueLabel);
							result.getSteps().add(new BlockCompiler(trueBlock).compile(sm));
							result.getSteps().addAll(sm.executeOperator(OperationRole.UC_GOTO,step, new CodeAddressSymbol(endLabel)).getSteps());
							result.getSteps().add(falseLabel);
							result.getSteps().add(new BlockCompiler(falseBlock).compile(sm));
							result.getSteps().add(endLabel);
						}
					}
				}catch(ECompilerException e){
					result.getSteps().add(CompilationErrorEntry.create(e));
				}
			}
		}
		sm.getVariableManager().endBlock();
		
		for(LabelReference lref : labeluses.keySet()){
			lref.setLabel(labels.get(labeluses.get(lref)));
		}
		
		return result;
	}
	
}
