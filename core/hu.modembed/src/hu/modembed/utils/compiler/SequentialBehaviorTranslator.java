/**
 * 
 */
package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMap;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.types.TypesFactory;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.InstructionCallParameter;
import hu.modembed.model.modembed.core.object.ObjectFactory;
import hu.modembed.model.modembed.infrastructure.AttributeDefinition;
import hu.modembed.model.modembed.infrastructure.AttributeValue;
import hu.modembed.model.modembed.infrastructure.AttributeValueContainer;
import hu.modembed.model.modembed.infrastructure.expressions.Expression;
import hu.modembed.utils.expressions.ExpressionResolveException;
import hu.modembed.utils.expressions.ExpressionResolver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.Assert;

/**
 * @author balazs.grill
 *
 */
public class SequentialBehaviorTranslator {

	protected class SymbolAddressExpressionResolver extends ExpressionResolver{
	
		private final SymbolAddressAssignment addressAssignment;
		
		public SymbolAddressExpressionResolver(SymbolAddressAssignment addressAssignment) {
			this.addressAssignment = addressAssignment;
		}
		
		public Object compute(InstructionParameterMapping ipm){
			AttributeDefinition attr = ipm.getAttribute(); 
			if (attr != null){
				MemoryInstance memi = addressAssignment.getMemoryInstance();
				Assert.isNotNull(memi);
				return getAttributeValue(memi.getAttributes(), attr);
			}else{
				return addressAssignment.getAddress();
			}
		}
		
	}
	
	private class OperationRegistry{
		
		private final Map<OperationDefinition, OperationSignature> operations = new LinkedHashMap<OperationDefinition, OperationSignature>();
		
		private void add(DeviceAbstraction device) {
			if (device.getAncestor() != null){
				add(device.getAncestor());
			}
			for(OperationDefinition od : device.getOperation()){
				operations.put(od, OperationSignature.create(od));
			}
		}
		
		public OperationRegistry(DeviceAbstraction device) {
			add(device);
		}
		
		public OperationDefinition find(OperationSignature osign){
			OperationDefinition result = null;
			for(Entry<OperationDefinition, OperationSignature> e : operations.entrySet()){
				if (OperationSignature.isCompatible(osign, e.getValue())){
					result = e.getKey();
				}
			}
			return result;
		}
		
	}
	
	private class SymbolValue{
		public final String symbol;
		public final Expression param;
		
		public SymbolValue(String symbol, Expression param) {
			this.symbol = symbol;
			this.param = param;
		}
		
	}
	
	
	public AssemblerObject translate(RootSequentialBehavior sequentialBehavior, SymbolMap map, long startAddress) throws ExpressionResolveException{
		
		Assert.isNotNull(sequentialBehavior.getDevice());
		OperationRegistry registry = new OperationRegistry(sequentialBehavior.getDevice());
		
		Map<String, SymbolAssignment> values = new HashMap<String, SymbolAssignment>();
		Map<String, Long> labels = new HashMap<String, Long>(); 
		Map<InstructionCallParameter, SymbolValue> instructionCallParameterValues = new LinkedHashMap<InstructionCallParameter, SequentialBehaviorTranslator.SymbolValue>();
		
		for(SymbolAssignment sa : sequentialBehavior.getLocalSymbols()){
			values.put(sa.getSymbol(), sa);
		}
		if (map != null){
			for(SymbolAddressAssignment saa : map.getSymbolMappings()){
				values.put(saa.getSymbol(), saa);
			}
		}
		
		for(SequentialAction action : sequentialBehavior.getActions()){
			if (action instanceof CodeSymbolPlacement){
				SymbolAllocation labelAlloc = BehaviorFactory.eINSTANCE.createSymbolAllocation();
				labelAlloc.setType(TypesFactory.eINSTANCE.createCodeLabelTypeDefinition());
				values.put(((CodeSymbolPlacement) action).getSymbol(), labelAlloc);
			}
		}
		
		AssemblerObject asm = ObjectFactory.eINSTANCE.createAssemblerObject();
		asm.setStartAddress(startAddress); 
		
		for(SequentialAction action : sequentialBehavior.getActions()){
			if (action instanceof CodeSymbolPlacement){
				String symbol = ((CodeSymbolPlacement) action).getSymbol();
				labels.put(symbol, startAddress + asm.getInstructions().size());
			}
			if (action instanceof OperationExecution){
				/* Calculate operatin signature */
				OperationExecution op = (OperationExecution)action;
				String operation = op.getOperation();
				TypeSignature[] arguments = new TypeSignature[op.getArguments().size()];
				for(int i=0;i<arguments.length;i++){
					SymbolAssignment argSymbol = values.get(op.getArguments().get(i));
					arguments[i] = TypeSignature.create(argSymbol);
				}
				
				/* Find operation */
				OperationSignature signature = new OperationSignature(operation, arguments);
				OperationDefinition opdef = registry.find(signature);
				Assert.isNotNull(opdef, "Could not find operation implementation for: "+signature);
				
				/* Calculate argument values */
				Map<OperationArgument, String> argumentSymbols = new HashMap<OperationArgument, String>();
				for(int i=0;i<opdef.getArguments().size();i++){
					OperationArgument oa = opdef.getArguments().get(i);
					String asymbol = op.getArguments().get(i);
					argumentSymbols.put(oa,asymbol);
				}
				
				/* Insert operation implementation into code */
				for(OperationStep step : opdef.getSteps()){
					if (step instanceof InstructionCallOperationStep){
						InstructionCallOperationStep icstep = (InstructionCallOperationStep)step;
						InstructionCall ic = ObjectFactory.eINSTANCE.createInstructionCall();
						ic.setInstruction(icstep.getInstruction());
						asm.getInstructions().add(ic);
						int i=0;
						for(Expression ipv : ((InstructionCallOperationStep) step).getArguments()){
							InstructionCallParameter icp = ObjectFactory.eINSTANCE.createInstructionCallParameter();
							icp.setDefinition(ic.getInstruction().getParameters().get(i));
							i++;
							ic.getParameters().add(icp);
							//if (ipv instanceof InstructionParameterMapping){
								InstructionParameterMapping ipm = (InstructionParameterMapping)ipv;
								String symbol = argumentSymbols.get(ipm.getValue());
								instructionCallParameterValues.put(icp, new SymbolValue(symbol, ipv));
							//}
//							if (ipv instanceof InstructionParameterConstantValue){
//								icp.setValue(((InstructionParameterConstantValue) ipv).getValue());
//							}
						}
					}
				}
				
			}
		}
		
		/* Resolve instruction parameter values */
		for(Entry<InstructionCallParameter, SymbolValue> entry : instructionCallParameterValues.entrySet()){
			SymbolValue value = entry.getValue();
			boolean islabel = false;
			long raw = -1;
			if (labels.containsKey(value.symbol)){
				raw = labels.get(value.symbol);
				islabel = true;
			}
			if (values.containsKey(value.symbol)){
				SymbolAssignment sa = values.get(value.symbol);
				if (sa instanceof SymbolValueAssignment){
					raw = ((SymbolValueAssignment) sa).getValue();
				}
				if (sa instanceof SymbolAddressAssignment){
					ExpressionResolver resolver = new SymbolAddressExpressionResolver((SymbolAddressAssignment)sa);
					raw = (Long)resolver.computeValue(value.param);
				}
			}
			
			entry.getKey().setValue(raw);
			entry.getKey().setLabel(islabel);
		}
		
		return asm;
	}
	
	private Long getAttributeValue(AttributeValueContainer value, AttributeDefinition adef){
		if (value == null) return null;
		for(AttributeValue v : value.getValues()){
			if (v.getDefinition().equals(adef)) return v.getValue();
		}
		return null;
	}
	
}
