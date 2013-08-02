/**
 * 
 */
package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.modembed.utils.compiler.module.impl.BasicSymbol;
import hu.modembed.utils.expressions.ExpressionResolveException;
import hu.modembed.utils.expressions.ExpressionResolver;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompiler2 extends ExpressionResolver{
	
	public SequentialBehaviorModule compile(StructuredModule module) throws ExpressionResolveException{
		SequentialBehaviorModule result = BehaviorFactory.eINSTANCE.createSequentialBehaviorModule();
		result.setName(module.getName()+".sb");
		
		SequentialBehaviorPart initFunction = BehaviorFactory.eINSTANCE.createSequentialBehaviorPart();
		initFunction.setName("__INIT__"+module.getName().replace('.', '_'));
		result.setInitSequence(initFunction);
		
		for(VariableDeclaration vd : module.getVariables()){
			SymbolAssignment sa = null;
			if (vd.isConst()){
				SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
				sva.setValue((Long)computeValue(vd.getInitValue()));
				sa = sva;
				sva.setType(TypeUtils.createTypeForConstant(sva.getValue()));
			}else{
				sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
				if (vd.getInitValue() != null){
					//TODO
//					TypedSymbol initValue = compile(initFunction, vd.getInitValue());
//					compile(initFunction, "assign", Arrays.asList(getSymbol(vd), initValue));
				}
			}
			
			sa.setType(EcoreUtil.copy(vd.getType()));
			sa.setSymbol(BasicSymbol.getSymbol(vd).getSymbolIdentifier());
			result.getSymbolMappings().add(sa);
		}
		
		return result;
	}
}
