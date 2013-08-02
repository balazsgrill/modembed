/**
 * 
 */
package hu.modembed.utils.compiler.module.impl;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.modembed.utils.compiler.module.IBasicSymbol;
import hu.modembed.utils.compiler.module.ModuleCompilerPart;

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
	public IBasicSymbol get(ModuleCompilerPart part) {
		return this;
	}

	@Override
	public void set(ModuleCompilerPart part, IBasicSymbol value) {
		// TODO Auto-generated method stub
		
	}

}
