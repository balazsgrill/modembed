/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.AddressedStep;
import hu.e.compiler.internal.model.CompilationErrorEntry;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.internal.model.LabelStep;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.internal.model.symbols.impl.CodeAddressSymbol;
import hu.e.compiler.internal.model.symbols.impl.LabelSymbol;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XIfExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	
//	private OperationFinder opfinder = null;
	
//	private OperationFinder getOpfinder() {
//		if (opfinder == null)
//			opfinder = new OperationFinder(block);
//		return opfinder;
//	}
	
	public List<IProgramStep> compile(ISymbolManager sm){
		List<IProgramStep> result = new ArrayList<IProgramStep>();
		
		Map<Label, LabelStep> labels = new HashMap<Label, LabelStep>();
		List<LabelSymbol> labeluses = new ArrayList<LabelSymbol>();
		
		sm.getVariableManager().startBlock();
		for(OperationStep step : block.getSteps()){
			if (step instanceof InstructionWord){
				try{
					InstructionWordInstance iwi = new InstructionWordInstance((InstructionWord)step, sm);
					labeluses.addAll(iwi.getLabeluses());
					result.add(iwi);
				}catch(ECompilerException e){
					result.add(CompilationErrorEntry.create(e));
				}
			}
			if (step instanceof Variable){
				if (step instanceof Label){
					LabelStep ls = new LabelStep((Label)step);
					labels.put((Label)step, ls);
					result.add(ls);
				}else{
					try{
						sm.getVariableManager().define(sm, (Variable)step);
					}catch(ECompilerException e){
						result.add(CompilationErrorEntry.create(e));
					}
				}
			}
//			if (step instanceof OperationCall){
//				OperationCall call = (OperationCall)step;
//				OperationCallCompiler oc = new OperationCallCompiler(call, sm);
//				labeluses.addAll(oc.getLabeluses());
//				result.addAll(oc.compile());
//			}
			if (step instanceof XExpression){
				try {
					ISymbol s = sm.resolve((XExpression)step);
					result.addAll(s.getSteps());
				} catch (ECompilerException e) {
					result.add(CompilationErrorEntry.create(e));
				}
			}
//			if (step instanceof XAssignment){
//				if (((XAssignment) step).getRef().getVar() instanceof CompileContextVariable){
//					// assignment to compiler context
//					XAssignment a = (XAssignment)step;
//					try {
//						sm.contextAssign(a.getRef(), ((ILiteralSymbol)sm.resolve(a.getValue())).getValue());
//					} catch (ECompilerException e) {
//						result.add(CompilationErrorEntry.create(e));
//					}
//				}else{
//					try{
//						XAssignment xa = (XAssignment)step;
//						ISymbol ts = sm.resolveVarRef(xa.getRef());
//						ISymbol vs = sm.resolve(xa.getValue());
//						result.addAll(ts.getSteps());
//						result.addAll(vs.getSteps());
//
//						OperationCompiler op = getOpfinder().getOperationCompiler(OperationRole.SET, ts, vs);
//						if (op != null){
//							result.addAll(op.compile(sm));
//						}else{
//							result.add(CompilationErrorEntry.error(step, "Could not find assignment operator!"));
//						}
//					}catch(ECompilerException e){
//						result.add(CompilationErrorEntry.create(e));
//					}
//				}
//			}
			if (step instanceof XIfExpression){
				try{
					ISymbol symbol = sm.resolve(((XIfExpression) step).getIf());
					result.addAll(symbol.getSteps());

					if (symbol.isLiteral()){
						//Literal condition, decide in compile time
						int v = ((ILiteralSymbol)symbol).getValue();
						OperationBlock ifblock = (v==0) ? ((XIfExpression) step).getElse() : ((XIfExpression) step).getThen();
						if (ifblock != null){
							BlockCompiler subBlock = new BlockCompiler(ifblock);
							result.addAll(subBlock.compile(sm));
						}
					}else{
						//Runtime condition
						IVariableSymbol v = (IVariableSymbol)symbol;
						AddressedStep trueLabel = new AddressedStep();
						AddressedStep falseLabel = new AddressedStep();
						AddressedStep endLabel = new AddressedStep();

						OperationBlock trueBlock = ((XIfExpression) step).getThen();
						OperationBlock falseBlock = ((XIfExpression) step).getElse();

						if (falseBlock == null){
							result.addAll(sm.executeOperator(OperationRole.BRANCH, step, v, 
									new CodeAddressSymbol(trueLabel), new CodeAddressSymbol(endLabel)).getSteps());
							result.add(trueLabel);
							result.addAll(new BlockCompiler(trueBlock).compile(sm));
							result.add(endLabel);
						}else{
							result.addAll(sm.executeOperator(OperationRole.BRANCH,step, v, 
									new CodeAddressSymbol(trueLabel), new CodeAddressSymbol(falseLabel)).getSteps());
							result.add(trueLabel);
							result.addAll(new BlockCompiler(trueBlock).compile(sm));
							result.addAll(sm.executeOperator(OperationRole.UC_GOTO,step, new CodeAddressSymbol(endLabel)).getSteps());
							result.add(falseLabel);
							result.addAll(new BlockCompiler(falseBlock).compile(sm));
							result.add(endLabel);
						}
					}
				}catch(ECompilerException e){
					result.add(CompilationErrorEntry.create(e));
				}
			}
		}
		sm.getVariableManager().endBlock();
		
		for(LabelSymbol ls : labeluses){
			ls.step = labels.get(ls.label);
		}
		
		return result;
	}
	
}
