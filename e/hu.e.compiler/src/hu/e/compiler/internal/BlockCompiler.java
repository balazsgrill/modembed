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
import hu.e.compiler.internal.model.symbols.SymbolContext;
import hu.e.compiler.internal.model.symbols.impl.CodeAddressSymbol;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.compiler.internal.symbols.VariableOverrideSymbolManager;
import hu.e.compiler.list.AnnotationStep;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.Annotation;
import hu.e.parser.eSyntax.AnnotationDefinition;
import hu.e.parser.eSyntax.ErrorLevels;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.XErrorExpression;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XForExpression;
import hu.e.parser.eSyntax.XIfExpression;

import java.math.BigDecimal;
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
		if (block == null) return CompilationErrorEntry.error(block, "Null code block!");
		SequenceStep result = ListFactory.eINSTANCE.createSequenceStep();
		
		Map<Label, LabelStep> labels = new HashMap<Label, LabelStep>();
		Map<Variable, MemoryAssignment> memory = new HashMap<Variable, MemoryAssignment>();
		
		sm.getVariableManager().startBlock();
		for(OperationStep step : block.getSteps()){
			if (step instanceof Variable){
				if (step instanceof Label){
					LabelStep ls = ListFactory.eINSTANCE.createLabelStep();
					labels.put((Label)step, ls);
					sm.getVariableManager().defineLabel((Label)step, ls);
				}else{
					try {
						MemoryAssignment ma = ListFactory.eINSTANCE.createMemoryAssignment();
						ma.setName(((Variable) step).getName());
						ma.setSize(sm.getVariableManager().getTypeResolver().getSize(sm, ((Variable) step).getType()));
						result.getVariables().add(ma);
						sm.getVariableManager().define(sm, (Variable)step, ma);
						memory.put((Variable) step, ma);
					} catch (ECompilerException e) {
						result.getSteps().add(CompilationErrorEntry.create(e));
					}
					
				}
			}
			
		}
		
		for(OperationStep step : block.getSteps()){
			if (step instanceof Annotation){
				AnnotationStep as = ListFactory.eINSTANCE.createAnnotationStep();
				AnnotationDefinition adef = ((Annotation) step).getDefinition();
				Library lib = (Library)adef.eContainer();
				as.setKey(lib.getName()+"."+adef.getName());
				result.getSteps().add(as);
			}
			if (step instanceof InstructionWord){
				try{
					InstructionWordInstance iwi = new InstructionWordInstance((InstructionWord)step, sm);
					result.getSteps().add(iwi.create());
				}catch(ECompilerException e){
					result.getSteps().add((CompilationErrorEntry.create(e)));
				}
			}
			if (step instanceof Variable){
				if (step instanceof Label){
					result.getSteps().add(labels.get(step));
				}
			}
			if (step instanceof XExpression){
				try {
					ISymbol s = sm.resolve(result, (XExpression)step);
					s.addSteps(result);
				} catch (ECompilerException e) {
					result.getSteps().add(CompilationErrorEntry.create(e));
				}
			}
			if (step instanceof XErrorExpression){
				ErrorLevels level = ((XErrorExpression) step).getLevel();
				String msg = ((XErrorExpression) step).getMsg();
				switch(level){
				case ERROR: result.getSteps().add(CompilationErrorEntry.error(step, msg)); break;
				case WARNING: result.getSteps().add(CompilationErrorEntry.warning(step, msg)); break;
				case INFO: result.getSteps().add(CompilationErrorEntry.info(step, msg)); break;
				}
			}
			if (step instanceof XForExpression){
				Variable var = ((XForExpression) step).getVar();
				try{
					ISymbol from = sm.resolve(result, ((XForExpression) step).getFrom());
					ISymbol by = sm.resolve(result, ((XForExpression) step).getBy());
					ISymbol to = sm.resolve(result, ((XForExpression) step).getTo());
					
					if (!from.isAssignableAt(SymbolContext.COMPILETIME)) throw new ECompilerException(((XForExpression) step).getFrom(), "TODO: runtime for cycles are not supported!");
					if (!by.isAssignableAt(SymbolContext.COMPILETIME)) throw new ECompilerException(((XForExpression) step).getBy(), "TODO: runtime for cycles are not supported!");
					if (!to.isAssignableAt(SymbolContext.COMPILETIME)) throw new ECompilerException(((XForExpression) step).getTo(), "TODO: runtime for cycles are not supported!");
					
					BigDecimal fromv = ((ILiteralSymbol)from).getValue();
					BigDecimal byv = ((ILiteralSymbol)by).getValue();
					BigDecimal tov = ((ILiteralSymbol)to).getValue();
					
					OperationBlock block = ((XForExpression) step).getDo();
					VariableOverrideSymbolManager symbolman = new VariableOverrideSymbolManager(sm);
					BlockCompiler bc = new BlockCompiler(block);
					
					BigDecimal iter = fromv;
					BigDecimal diff = null;
					for(iter = fromv; !iter.equals(tov) ; iter = iter.add(byv)){
						symbolman.overrides.put(var, new LiteralSymbol(var.getType(), iter));
						
						result.getSteps().add(bc.compile(symbolman));
						
						BigDecimal newdiff = tov.subtract(iter);
						if (diff != null && newdiff.compareTo(diff) >= 0){
							throw new ECompilerException(step, "Infinite compile-time for cycle detected!");
						}
						diff = newdiff;
					}

				}catch(ECompilerException e){
					result.getSteps().add(CompilationErrorEntry.create(e));
				}
			}
			if (step instanceof XIfExpression){
				try{
					ISymbol symbol = sm.resolve(result, ((XIfExpression) step).getIf());
					symbol.addSteps(result);

					if (symbol.isAssignableAt(SymbolContext.COMPILETIME)){
						//Literal condition, decide in compile time
						long v = ((ILiteralSymbol)symbol).getValue().longValue();
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

						TypeDef addressType = sm.getCodePlatform().getAddressType();
						
						if (falseBlock == null){
							sm.executeOperator(OperationRole.BRANCH, step, result, v, 
									new CodeAddressSymbol(trueLabel, addressType), new CodeAddressSymbol(endLabel, addressType)).addSteps(result);
							result.getSteps().add(trueLabel);
							result.getSteps().add(new BlockCompiler(trueBlock).compile(sm));
							result.getSteps().add(endLabel);
						}else{
							sm.executeOperator(OperationRole.BRANCH,step, result, v, 
									new CodeAddressSymbol(trueLabel, addressType), new CodeAddressSymbol(falseLabel, addressType)).addSteps(result);
							result.getSteps().add(trueLabel);
							result.getSteps().add(new BlockCompiler(trueBlock).compile(sm));
							sm.executeOperator(OperationRole.UC_GOTO,step, result, new CodeAddressSymbol(endLabel, addressType)).addSteps(result);
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
		
		return result;
	}
	
}
