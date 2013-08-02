/**
 * 
 */
package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.structured.StructuredModule;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompiler2 {
	
	public SequentialBehaviorModule compile(StructuredModule module){
		SequentialBehaviorModule result = BehaviorFactory.eINSTANCE.createSequentialBehaviorModule();
		result.setName(module.getName()+".sb");
		
		SequentialBehaviorPart initFunction = BehaviorFactory.eINSTANCE.createSequentialBehaviorPart();
		initFunction.setName("__INIT__"+module.getName().replace('.', '_'));
		result.setInitSequence(initFunction);
		
//		for(VariableDeclaration vd : module.getVariables()){
//			SymbolAssignment sa = null;
//			if (vd.isConst()){
//				SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
//				sva.setValue(computeConstant(vd.getInitValue()));
//				sa = sva;
//				sva.setType(createTypeForConstant(sva.getValue()));
//			}else{
//				sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
//				if (vd.getInitValue() != null){
//					TypedSymbol initValue = compile(initFunction, vd.getInitValue());
//					compile(initFunction, "assign", Arrays.asList(getSymbol(vd), initValue));
//				}
//			}
//			
//			sa.setType(EcoreUtil.copy(vd.getType()));
//			sa.setSymbol(getSymbol(vd).getSymbol());
//			result.getSymbolMappings().add(sa);
//		}
		
		return result;
	}
}
