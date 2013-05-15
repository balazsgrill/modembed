/**
 * 
 */
package hu.modembed.utils.compiler;

import java.util.Arrays;
import java.util.List;

import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;
import hu.modembed.model.modembed.abstraction.types.CodeLabelTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition;

/**
 * @author balazs.grill
 *
 */
public class TypeSignature {

	private final TypeDefinition type;
	private final MemoryType[] indirections;
	
	/**
	 * 
	 */
	public TypeSignature(TypeDefinition type, MemoryType[] indirections) {
		this.type = type;
		this.indirections = indirections;
	}

	public TypeDefinition getType() {
		return type;
	}
	
	public MemoryType[] getIndirections() {
		return indirections;
	}
	
	public boolean isCompatible(TypeSignature other){
		if (!isCompatible(type, other.type)) return false;
		
		return Arrays.equals(indirections, other.indirections);
	}
	
	public static boolean isCompatible(TypeDefinition td1, TypeDefinition td2){
		if (td1 instanceof ReferenceTypeDefinition) 
			return isCompatible(((ReferenceTypeDefinition) td1).getType().getDefinition(), td2);
		if (td2 instanceof ReferenceTypeDefinition)
			return isCompatible(td1, ((ReferenceTypeDefinition) td2).getType().getDefinition());
		
		if (td1 instanceof CodeLabelTypeDefinition)
			return td2 instanceof CodeLabelTypeDefinition;
		
		if (td1 instanceof UnsignedTypeDefinition && td2 instanceof UnsignedTypeDefinition){
			UnsignedTypeDefinition utd1 = (UnsignedTypeDefinition)td1;
			UnsignedTypeDefinition utd2 = (UnsignedTypeDefinition)td2;
			return utd1.getBits() == utd2.getBits();
		}
		
		return false;
	}
	
	public static TypeSignature create(OperationArgument arg){
		List<MemoryType> indirection = arg.getIndirection();
		return new TypeSignature(arg.getType(), indirection.toArray(new MemoryType[indirection.size()]));
	}
	
	public static TypeSignature create(SymbolValueAssignment sv){
		TypeDefinition typedef = sv.getType();
		List<MemoryInstance> mems = sv.getIndirection();
		MemoryType[] mts = new MemoryType[mems.size()];
		for(int i=0;i<mts.length;i++){
			mts[i] = mems.get(i).getType();
		}
		return new TypeSignature(typedef, mts);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(type instanceof UnsignedTypeDefinition){
			sb.append("unsigned(");
			sb.append(((UnsignedTypeDefinition) type).getBits());
			sb.append(")");
		}
		if (type instanceof ReferenceTypeDefinition){
			sb.append(((ReferenceTypeDefinition) type).getType().getName());
		}
		if (type instanceof CodeLabelTypeDefinition){
			sb.append("label");
		}
		for(MemoryType mt : indirections){
			sb.append("@");
			sb.append(mt.getName());
		}
		return sb.toString();
	}
	
}
