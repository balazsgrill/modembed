package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypesFactory;
import hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition;

public final class TypeUtils {

	private TypeUtils() {}

	public static TypeDefinition createTypeForConstant(long constant){
		int bits = 1;
		int maxv = 1;
		while(constant > maxv){
			bits++;
			maxv *= 2;
		}
		return createUnsignedTypeDef(bits);
	}
	
	public static TypeDefinition createUnsignedTypeDef(int bits){
		UnsignedTypeDefinition utd = TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
		utd.setBits(bits);
		return utd;
	}
	
}
