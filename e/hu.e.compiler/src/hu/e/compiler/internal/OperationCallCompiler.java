/**
 * 
 */
package hu.e.compiler.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.CompilationErrorEntry;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.LabelSymbol;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.parser.eSyntax.LabelReference;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationCallParameter;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.XExpression;

/**
 * @author balazs.grill
 *
 */
public class OperationCallCompiler {
	
	private final OperationCompiler oc;
	
	private final ISymbolManager sm;
	
	private final List<IProgramStep> before = new ArrayList<IProgramStep>();
	
	private final List<LabelSymbol> labeluses = new ArrayList<LabelSymbol>();
	
	public List<LabelSymbol> getLabeluses() {
		return labeluses;
	}
	
	public OperationCallCompiler(OperationCall call, ISymbolManager sm) {
		this.sm = sm;
		this.oc = new OperationCompiler(call.getOperation());
		Iterator<OperationCallParameter> pexs = call.getParams().iterator();
		for(ParameterVariable p : call.getOperation().getParams()){
			Variable pvar = p.getVar();
			OperationCallParameter ocp = pexs.hasNext() ? pexs.next() : null;
			
			if (ocp == null){
				//default value
				if (p.getDefault() == null || "".equals(p.getDefault())){
					throw new RuntimeException("Invalid number of parameters for "+call.getOperation().getName());
				}
				oc.addParameter(pvar, new LiteralSymbol(ECompiler.convertLiteral(p.getDefault())));
			}else{
				
				if (ocp instanceof LabelReference){
					LabelSymbol ls = new LabelSymbol(((LabelReference) ocp).getLabel());
					labeluses.add(ls);
					sm.addLabelSymbol(ls);
					oc.addParameter(pvar, ls);
				}
				
				if (ocp instanceof XExpression){
					try{
						ISymbol s = sm.resolve((XExpression)ocp);
						oc.addParameter(pvar, s);
						before.addAll(s.getSteps());
					}catch(ECompilerException e){
						before.add(CompilationErrorEntry.create(e));
					}
				}
			}
		}
	}
	
	public List<IProgramStep> compile(){
		List<IProgramStep> ps = new ArrayList<IProgramStep>(before);
		ps.addAll(oc.compile(sm));
		return ps;
	}
	
	public ISymbol getReturns() throws ECompilerException{
		return oc.getReturns(sm);
	}
	
}
