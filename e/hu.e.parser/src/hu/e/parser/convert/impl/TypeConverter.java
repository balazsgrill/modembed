/**
 * 
 */
package hu.e.parser.convert.impl;


import hu.e.parser.convert.ICrossReferenceScope;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.FixedDataTypeDef;
import hu.e.parser.eSyntax.IntegerDataTypeDef;
import hu.e.parser.eSyntax.LabelDataTypeDef;
import hu.e.parser.eSyntax.PointerTypeDef;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.UnspecifiedTypeDef;
import hu.modembed.model.abstraction.types.ArrayDefinition;
import hu.modembed.model.abstraction.types.CodeLabelTypeDefinition;
import hu.modembed.model.abstraction.types.PointerTypeDefinition;
import hu.modembed.model.abstraction.types.ReferenceTypeDefinition;
import hu.modembed.model.abstraction.types.TypeDefinition;
import hu.modembed.model.abstraction.types.TypesFactory;
import hu.modembed.model.abstraction.types.TypesPackage;
import hu.modembed.model.abstraction.types.UnsignedTypeDefinition;

/**
 * @author balazs.grill
 *
 */
public class TypeConverter {

	public static TypeDefinition convertTypeDef(TypeDef tdef, ICrossReferenceScope scope){
		if (tdef instanceof UnspecifiedTypeDef){
			//void is intentionally null type
			return null;
		}
		
		if (tdef instanceof ArrayTypeDef){
			ArrayDefinition at = TypesFactory.eINSTANCE.createArrayDefinition();
			at.setPointerType(convertTypeDef(((ArrayTypeDef) tdef).getDef(), scope));
			//TODO size
			return at;
		}
		
		if (tdef instanceof PointerTypeDef){
			PointerTypeDefinition pt = TypesFactory.eINSTANCE.createPointerTypeDefinition();
			pt.setPointerType(convertTypeDef(((PointerTypeDef) tdef).getDef(), scope));
			return pt;
		}
		
		if (tdef instanceof RefTypeDef){
			ReferenceTypeDefinition rtd = TypesFactory.eINSTANCE.createReferenceTypeDefinition();
			scope.addCrossReference(rtd, TypesPackage.eINSTANCE.getReferenceTypeDefinition_Type(), ((RefTypeDef) tdef).getType());
			return rtd;
		}
		
		if (tdef instanceof StructTypeDef){
			//TODO
		}
		
		if (tdef instanceof FixedDataTypeDef){
			//TODO
		}
		
		if (tdef instanceof LabelDataTypeDef){
			CodeLabelTypeDefinition cldt = TypesFactory.eINSTANCE.createCodeLabelTypeDefinition();
			return cldt;
		}
		
		if (tdef instanceof IntegerDataTypeDef){
			IntegerDataTypeDef it = (IntegerDataTypeDef)tdef;
			switch(it.getKind()){
			case UNSIGNED:
				UnsignedTypeDefinition ut = TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
				ut.setBits(it.getBits());
				return ut;
			case SIGNED:
				//TODO
			}
		}
		
		return null;
	}
	
}
