package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypesFactory;
import hu.modembed.utils.compiler.TypeSignature;
import hu.modembed.utils.compiler.module.impl.BasicSymbol;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class AbstractModuleCompilerPart {

	private final SequentialBehaviorPart part;
	
	public AbstractModuleCompilerPart(SequentialBehaviorPart part) {
		this.part = part;
	}

	public static SequentialAction label(String labelSymbol){
		CodeSymbolPlacement label = BehaviorFactory.eINSTANCE.createCodeSymbolPlacement();
		label.setSymbol(labelSymbol);
		return label;
	}
	
	public static SequentialAction op(String operation, String...arguments){
		OperationExecution op = BehaviorFactory.eINSTANCE.createOperationExecution();
		op.setOperation(operation);
		for(String arg : arguments){
			op.getArguments().add(arg);
		}
		return op;
	}
	
	protected IBasicSymbol createLabelSymbol() {
		return allocateSymbol(TypesFactory.eINSTANCE.createCodeLabelTypeDefinition(), LABEL);
	}
	
	public void add(SequentialAction action){
		part.getActions().add(action);
	}
	
	protected void addParameter(String param){
		part.getParameters().add(param);
	}
	
	protected void add(SymbolAssignment sa) {
		part.getLocalSymbols().add(sa);
	}
	
	protected static final String CONSTANT = "__CONSTANT__";
	protected static final String LABEL = "__LABEL__";
	protected static final String BUFFER = "__BUFFER__";
	
	protected ISymbol getConstantSymbol(long constant){
		String symbol = CONSTANT+constant;
		TypeDefinition type = TypeUtils.createTypeForConstant(constant);
		for(SymbolAssignment sa : part.getLocalSymbols()){
			if (symbol.equals(sa.getSymbol())) return BasicSymbol.getSymbol(sa);
		}
		SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
		sva.setSymbol(symbol);
		sva.setValue(constant);
		sva.setType(type);
		part.getLocalSymbols().add(sva);
		return BasicSymbol.getSymbol(sva);
	}

	protected ISymbol extendSymbol(ISymbol symbol, TypeDefinition to){
		TypeDefinition td = TypeUtils.extend(symbol.getType(), to);
		if (TypeSignature.isCompatible(td, symbol.getType())){
			return symbol;
		}
		IBasicSymbol buffer = allocateSymbol(td, BUFFER);
		buffer.set(this, symbol.get(this));
		return buffer;
	}
	
	protected static String getUniqueSymbol(List<SymbolAssignment> assignments, String prefix){
		int i=0;
		boolean done = false;
		while(!done){
			i++;
			done = true;
			for(SymbolAssignment sa : assignments) if (done){
				if (sa.getSymbol().equals(prefix+i)){
					done = false;
				}
			}
		}
		
		return prefix+i;
	}
	
	public IBasicSymbol allocateSymbol(TypeDefinition type, String prefix){
		Assert.isNotNull(type);
		String symbol = getUniqueSymbol(part.getLocalSymbols(), prefix);
		
		SymbolAllocation sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
		sa.setType(EcoreUtil.copy(type));
		sa.setSymbol(symbol);
		part.getLocalSymbols().add(sa);
		return BasicSymbol.getSymbol(sa);
	}
	
	public abstract void basicSet(IBasicSymbol destination, IBasicSymbol source);
	
}
