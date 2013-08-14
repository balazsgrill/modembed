/**
 * 
 */
package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

/**
 * @author balazs.grill
 *
 */
public interface ISymbol {

	public TypeDefinition getType();
	
	public IBasicSymbol get(AbstractModuleCompilerPart part);
	
	public void set(AbstractModuleCompilerPart part, IBasicSymbol value); 
	
}
