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
import hu.modembed.model.modembed.abstraction.behavior.SymbolIndirection;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMap;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping;
import hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationLocalLabel;
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

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.Assert;

/**
 * @author balazs.grill
 *
 */
public class SequentialBehaviorTranslator {

	protected class SymbolAddressExpressionResolver extends ExpressionResolver{
	
		public final Map<String, SymbolAssignment> values = new HashMap<String, SymbolAssignment>();
		public final Map<String, Long> labels = new HashMap<String, Long>(); 
		
		private Map<OperationArgument, String> context = Collections.emptyMap();
		public boolean isLabel = false;
		
		public void setContext(Map<OperationArgument, String> context) {
			this.context = context;
		}
		
		
		public SymbolAddressExpressionResolver() {
			
		}
		
		public Object compute(LabelParameterValue lbl) throws ExpressionResolveException{
			String symbol = lbl.getLabel().getName();
			isLabel = true;
			if (labels.containsKey(symbol)){
				return labels.get(symbol);
			}
			throw new ExpressionResolveException("Could not find local label: "+symbol);
		}
		
		public Object compute(InstructionParameterMapping ipm) throws ExpressionResolveException{
			String symbol = context.get(ipm.getValue());
			
			if (labels.containsKey(symbol)){
				isLabel = true;
				return labels.get(symbol);
			}
			if (values.containsKey(symbol)){
				SymbolAssignment sa = values.get(symbol);
				if (sa instanceof SymbolValueAssignment){
					return ((SymbolValueAssignment) sa).getValue();
				}
				if (sa instanceof SymbolIndirection){
					String s = ((SymbolIndirection) sa).getReference();
					SymbolAssignment r = values.get(s);
					if (r instanceof SymbolAddressAssignment){
						AttributeDefinition attr = ipm.getAttribute(); 
						if (attr != null){
							MemoryInstance memi = ((SymbolAddressAssignment)r).getMemoryInstance();
							Assert.isNotNull(memi);
							return getAttributeValue(memi.getAttributes(), attr);
						}else{
							return ((SymbolAddressAssignment) r).getAddress();
						}
					}else{
						throw new ExpressionResolveException("Symbol "+s+" cannot be referenced by address!");
					}
				}
				if (sa instanceof SymbolAddressAssignment){
					AttributeDefinition attr = ipm.getAttribute(); 
					if (attr != null){
						MemoryInstance memi = ((SymbolAddressAssignment)sa).getMemoryInstance();
						Assert.isNotNull(memi);
						return getAttributeValue(memi.getAttributes(), attr);
					}else{
						return ((SymbolAddressAssignment)sa).getAddress();
					}
				}
			}
			
			throw new ExpressionResolveException("Could not resolve "+symbol+" ("+ipm.getValue().getName()+")");
			
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
	
	class ValueInContext{
		
		public final Expression value;
		public final InstructionCallParameter holder;
		public final Map<OperationArgument, String> context;
		
		public ValueInContext(Expression value,
				InstructionCallParameter holder,
				Map<OperationArgument, String> context) {
			super();
			this.value = value;
			this.holder = holder;
			this.context = context;
		}
		
		
	}
	
	public AssemblerObject translate(RootSequentialBehavior sequentialBehavior, SymbolMap map, long startAddress) throws ExpressionResolveException{
		
		SymbolAddressExpressionResolver resolver = new SymbolAddressExpressionResolver();
		
		Assert.isNotNull(sequentialBehavior.getDevice());
		OperationRegistry registry = new OperationRegistry(sequentialBehavior.getDevice());
		
		
		List<ValueInContext> instructionCallParameterValues = new LinkedList<SequentialBehaviorTranslator.ValueInContext>();
		
		for(SymbolAssignment sa : sequentialBehavior.getLocalSymbols()){
			resolver.values.put(sa.getSymbol(), sa);
		}
		if (map != null){
			for(SymbolAddressAssignment saa : map.getSymbolMappings()){
				resolver.values.put(saa.getSymbol(), saa);
			}
		}
		
		for(SequentialAction action : sequentialBehavior.getActions()){
			if (action instanceof CodeSymbolPlacement){
				SymbolAllocation labelAlloc = BehaviorFactory.eINSTANCE.createSymbolAllocation();
				labelAlloc.setType(TypesFactory.eINSTANCE.createCodeLabelTypeDefinition());
				resolver.values.put(((CodeSymbolPlacement) action).getSymbol(), labelAlloc);
			}
		}
		
		AssemblerObject asm = ObjectFactory.eINSTANCE.createAssemblerObject();
		asm.setStartAddress(startAddress); 
		
		for(SequentialAction action : sequentialBehavior.getActions()){
			if (action instanceof CodeSymbolPlacement){
				String symbol = ((CodeSymbolPlacement) action).getSymbol();
				resolver.labels.put(symbol, startAddress + asm.getInstructions().size());
			}
			if (action instanceof OperationExecution){
				/* Calculate operation signature */
				OperationExecution op = (OperationExecution)action;
				String operation = op.getOperation();
				TypeSignature[] arguments = new TypeSignature[op.getArguments().size()];
				for(int i=0;i<arguments.length;i++){
					SymbolAssignment argSymbol = resolver.values.get(op.getArguments().get(i));
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
				putOperations(asm, resolver, opdef.getSteps(), startAddress, instructionCallParameterValues, argumentSymbols);
				
			}
		}
		
		/* Resolve instruction parameter values */
		for(ValueInContext value : instructionCallParameterValues){
			
			resolver.setContext(value.context);
			resolver.isLabel = false;
			
			Object o = resolver.computeValue(value.value);
			long raw = -1;
			if (o instanceof Number){
				raw = ((Number) o).longValue();
			}
			
			
			value.holder.setValue(raw);
			value.holder.setLabel(resolver.isLabel);
		}
		
		return asm;
	}
	
	private void putOperations(AssemblerObject asm, SymbolAddressExpressionResolver resolver, 
			List<OperationStep> steps, long startAddress, List<ValueInContext> instructionCallParameterValues, 
			Map<OperationArgument, String> argumentSymbols) throws ExpressionResolveException{
		for(OperationStep step : steps){
			if (step instanceof OperationLocalLabel){
				String symbol = ((OperationLocalLabel) step).getName();
				resolver.labels.put(symbol, startAddress + asm.getInstructions().size());
			}
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
				
					instructionCallParameterValues.add(new ValueInContext(ipv, icp, argumentSymbols));
				}
			}
			if (step instanceof ConditionalOperation){
				Expression e = ((ConditionalOperation) step).getCondition();
				resolver.setContext(argumentSymbols);
				long v = (Long) resolver.computeValue(e);
				if (v > 0){
					putOperations(asm, resolver, ((ConditionalOperation) step).getSteps(), startAddress, instructionCallParameterValues, argumentSymbols);
				}
			}
		}
	}
	
	private Long getAttributeValue(AttributeValueContainer value, AttributeDefinition adef){
		if (value == null) return null;
		for(AttributeValue v : value.getValues()){
			if (v.getDefinition().equals(adef)) return v.getValue();
		}
		return null;
	}
	
}
