/**
 * 
 */
package hu.modembed.utils.compiler.module.impl;

import hu.modembed.model.modembed.abstraction.types.ArrayTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.PrimitiveTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.utils.compiler.module.AbstractModuleCompilerPart;
import hu.modembed.utils.compiler.module.IBasicSymbol;
import hu.modembed.utils.compiler.module.ISymbol;
import hu.modembed.utils.compiler.module.TypeUtils;

/**
 * @author balazs.grill
 *
 */
public class IndexedSymbol implements ISymbol {

	public static ISymbol create(ISymbol data, ISymbol index){
		return new IndexedSymbol(data, index);
	}
	
	private final ISymbol data;
	private final ISymbol index;
	private final TypeDefinition type;
	
	private final boolean bit;
	
	/**
	 * 
	 */
	private IndexedSymbol(ISymbol data, ISymbol index) {
		this.data = data;
		this.index = index;
		
		TypeDefinition baseType = TypeUtils.getBaseType(data.getType());
		if (baseType instanceof PrimitiveTypeDefinition){
			type = TypeUtils.createUnsignedTypeDef(1); // a bit
			bit = true;
		}else if (baseType instanceof ArrayTypeDefinition){
			
			TypeDefinition elementType = ((ArrayTypeDefinition) baseType).getElementType(); 
			type = TypeUtils.getBaseType(elementType);
			bit = false;
			
		}else{
			
			throw new IllegalArgumentException("Type "+data.getType()+" cannot be indexed!");
//			type = null;
//			bit = false;
		}
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.utils.compiler.module.ISymbol#getType()
	 */
	@Override
	public TypeDefinition getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.compiler.module.ISymbol#get(hu.modembed.utils.compiler.module.AbstractModuleCompilerPart)
	 */
	@Override
	public IBasicSymbol get(AbstractModuleCompilerPart part) {
		if (bit){
			IBasicSymbol value = part.allocateSymbol(getType(), "ELEMENT");
			part.add(AbstractModuleCompilerPart.op("getbit", data.get(part).getSymbolIdentifier(), index.get(part).getSymbolIdentifier(), value.getSymbolIdentifier()));
			return value;
		}else{
			throw new UnsupportedOperationException("Array element get is not yet implemented");
		}
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.compiler.module.ISymbol#set(hu.modembed.utils.compiler.module.AbstractModuleCompilerPart, hu.modembed.utils.compiler.module.IBasicSymbol)
	 */
	@Override
	public void set(AbstractModuleCompilerPart part, IBasicSymbol value) {
		if (bit){
			part.add(AbstractModuleCompilerPart.op("setbit", data.get(part).getSymbolIdentifier(), index.get(part).getSymbolIdentifier(), value.getSymbolIdentifier()));
		}else{
			throw new UnsupportedOperationException("Array element set is not yet implemented");
		}

	}

}
