/**
 * 
 */
package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.structured.StructuredFunction;
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
		ModuleCompilerPart initPart = new ModuleCompilerPart(this, initFunction);
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
					ISymbol initValue = initPart.compile(vd.getInitValue());
					initPart.compile("assign", BasicSymbol.getSymbol(vd), initValue);
				}
			}
			
			sa.setType(EcoreUtil.copy(vd.getType()));
			sa.setSymbol(BasicSymbol.getSymbol(vd).getSymbolIdentifier());
			result.getSymbolMappings().add(sa);
		}
		
		for(StructuredFunction func : module.getFunctions()){
			if (func.getImplementation() != null){
				SequentialBehaviorPart sbp = BehaviorFactory.eINSTANCE.createSequentialBehaviorPart();
				sbp.setName(getSymbol(func));
				
				ModuleCompilerPart part = new ModuleCompilerPart(this, sbp);
				part.compile(func);
				result.getBehaviorModels().add(sbp);
			}
		}
		
		return result;
	}
	
	public static String getSymbol(StructuredFunction function){
		StructuredModule module = (StructuredModule)function.eContainer();
		String name = function.getName();
		if (function.isGlobal()) return name;
		for(StructuredModule sm : module.getUses()){
			for(StructuredFunction sf : sm.getFunctions()){
				if (name.equals(sf.getName())){
					//TODO check signature?
					return getSymbol(sf);
				}
			}
		}
		
		String qid = module.getName()+".."+function.getName();
		return qid.replace('.', '_');
	}
	
}
