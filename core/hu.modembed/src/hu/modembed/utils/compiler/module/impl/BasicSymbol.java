/**
 * 
 */
package hu.modembed.utils.compiler.module.impl;

import hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.modembed.utils.compiler.module.AbstractModuleCompilerPart;
import hu.modembed.utils.compiler.module.IBasicSymbol;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class BasicSymbol implements IBasicSymbol {

	private final String symbol;
	private final TypeDefinition type;
	
	public static IBasicSymbol getSymbol(VariableDeclaration vd){
		if (vd.isGlobal()){
			return new BasicSymbol(vd.getName(), vd.getType());
		}
		EObject eo = vd.eContainer();
		if (eo instanceof StructuredModule){
			String qid = ((StructuredModule) eo).getName()+".."+vd.getName();
			return new BasicSymbol(qid.replace('.', '_'), vd.getType());
		}
		//Parameter or local symbol
		return new BasicSymbol(vd.getName(), vd.getType());
	}
	
	public static IBasicSymbol getSymbol(SymbolAllocation sa) {
		return new BasicSymbol(sa.getSymbol(), sa.getType());
	}
	
	public static IBasicSymbol getSymbol(SymbolAssignment sa) {
		return new BasicSymbol(sa.getSymbol(), sa.getType());
	}
	
	/**
	 * 
	 */
	private BasicSymbol(String symbol, TypeDefinition type) {
		Assert.isNotNull(type, "Symbol '"+symbol+"' does not have a type definition!");
		this.symbol = symbol;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.compiler.module.ISymbol#getType()
	 */
	@Override
	public TypeDefinition getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.compiler.module.IBasicSymbol#getSymbolIdentifier()
	 */
	@Override
	public String getSymbolIdentifier() {
		return symbol;
	}

	@Override
	public IBasicSymbol get(AbstractModuleCompilerPart part) {
		return this;
	}

	@Override
	public void set(AbstractModuleCompilerPart part, IBasicSymbol value) {
		part.basicSet(this, value);
		
	}

}
