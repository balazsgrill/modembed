/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.model.CompilationErrorEntry;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.SymbolContext;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.compiler.internal.model.symbols.impl.TypeCastedLiteralSymbol;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationCallParameter;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.XExpression;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class OperationCallCompiler {
	
	private final OperationCompiler oc;
	
	private final ISymbolManager sm;
	
	private final SequenceStep callstep = ListFactory.eINSTANCE.createSequenceStep();
	
	public OperationCallCompiler(CodePlatform platform, OperationCall call, ISymbolManager sm) {
		this.sm = sm;
		Operation op = call.getOperation();
		op = platform.getOperationFinder().findOverride(op);
//		for(int i=0;i<op.getParams().size();i++){
//			Variable oldvar = op.getParams().get(i);
//			Variable newvar = operation.getParams().get(i);
//			parameters.put(newvar, parameters.get(oldvar));
//		}
		callstep.setName("Call "+call.getOperation().getName());
		this.oc = new OperationCompiler(platform, op);
		Iterator<OperationCallParameter> pexs = call.getParams().iterator();
		for(Variable pvar : op.getParams()){
			//Variable pvar = p.getVar();
			ParameterVariable p = (ParameterVariable)pvar;
			OperationCallParameter ocp = pexs.hasNext() ? pexs.next() : null;
			
			if (ocp == null){
				//default value
				if (p.getDefault() == null || "".equals(p.getDefault())){
					callstep.getSteps().add(CompilationErrorEntry.error(call, "Invalid number of parameters for "+call.getOperation().getName()));
				}
				oc.addParameter(pvar, new LiteralSymbol(null, ECompiler.convertLiteral(p.getDefault())));
			}else{
				
				if (ocp instanceof XExpression){
					try{
						ISymbol s = sm.resolve(callstep, (XExpression)ocp);
						if (s.isAssignableAt(SymbolContext.COMPILETIME) && s instanceof ILiteralSymbol){
							s = new TypeCastedLiteralSymbol(p.getType(), (ILiteralSymbol)s);
						}
						oc.addParameter(pvar, s);
						s.addSteps(callstep);
					}catch(ECompilerException e){
						callstep.getSteps().add(CompilationErrorEntry.create(e));
					}
				}
			}
		}
	}
	
	public List<ProgramStep> compile(SequenceStep parent){
		callstep.getSteps().add(oc.compile(sm, oc.createResultBuffer(parent)));
		return Collections.singletonList((ProgramStep)callstep);
	}
	
	public ISymbol getReturns() throws ECompilerException{
		return oc.getReturns(callstep, sm);
	}
	
}
