/**
 * 
 */
package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMap;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRules;
import hu.modembed.model.modembed.abstraction.types.ArrayDefinition;
import hu.modembed.model.modembed.abstraction.types.CodeLabelTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.PointerTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition;
import hu.modembed.utils.expressions.ExpressionResolveException;
import hu.modembed.utils.expressions.ExpressionResolver;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class SimpleVariableMapper extends ExpressionResolver{

	private DeviceSpecificTypeAdvisor typeAdvisor;
	
	private long getSize(TypeDefinition type) throws ExpressionResolveException{
		if (type instanceof ReferenceTypeDefinition){
			return getSize(((ReferenceTypeDefinition) type).getType().getDefinition());
		}
		if (type instanceof UnsignedTypeDefinition){
			int bits = ((UnsignedTypeDefinition) type).getBits(); 
			return ((bits-1)/8)+1;
		}
		if (type instanceof ArrayDefinition){
			Object o = computeValue(((ArrayDefinition) type).getSize());
			if (o instanceof Number){
				long size = ((Number) o).longValue();
				long baseSize = getSize(((ArrayDefinition) type).getElementType());
				return size*baseSize;
			}else{
				throw new IllegalArgumentException("Invalid size: "+o);
			}
		}
		
		if (type instanceof PointerTypeDefinition){
			return getSize(typeAdvisor.transform(type));
		}
		
		throw new IllegalArgumentException("Cannot calculate the size of "+type);
	}
	
	public SymbolMap mapVariables(RootSequentialBehavior sequence, SymbolMappingRules rules) throws ExpressionResolveException{
		SymbolMap result = BehaviorFactory.eINSTANCE.createSymbolMap();
		
		typeAdvisor = new DeviceSpecificTypeAdvisor(sequence.getDevice());
		
		List<SymbolMappingRule> ruleList = rules.getRules();
		int currentRule = 0;
		long currentAddress = ruleList.get(currentRule).getStartAddress();
		long currentEnd = ruleList.get(currentRule).getEndAddress();
		
		for(SymbolAssignment sa : sequence.getLocalSymbols()){
			if (sa instanceof SymbolAllocation){
				TypeDefinition td = sa.getType();
				
				if (!(td instanceof CodeLabelTypeDefinition)){
					long size = getSize(td);

					if (currentAddress + size > currentEnd){
						currentRule++;
						if (ruleList.size() >= currentRule){
							throw new RuntimeException("Symbols do not fit in memory!");
						}else{
							currentAddress = ruleList.get(currentRule).getStartAddress();
							currentEnd = ruleList.get(currentRule).getEndAddress();
						}
					}

					SymbolAddressAssignment saa = BehaviorFactory.eINSTANCE.createSymbolAddressAssignment();
					saa.setAddress(currentAddress);
					currentAddress += size;
					saa.setSymbol(sa.getSymbol());
					saa.setType(EcoreUtil.copy(td));
					saa.setMemoryInstance(ruleList.get(currentRule).getMemInstance());
					result.getSymbolMappings().add(saa);
				}
			}
		}
		
		return result;
	}
	
}
