/**
 * 
 */
package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;
import hu.modembed.model.modembed.abstraction.types.ArrayTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.CodeLabelTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.PointerTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class TypeSignature {

	private final TypeDefinition type;
	private final MemoryType memoryType;
	private final DeviceSpecificTypeAdvisor advisor;
	
	/**
	 * 
	 */
	public TypeSignature(TypeDefinition type, MemoryType memoryType, DeviceSpecificTypeAdvisor advisor) {
		this.type = type;
		this.memoryType = memoryType;
		this.advisor = advisor;
	}

	public TypeDefinition getType() {
		return type;
	}
	
	public MemoryType getMemoryType() {
		return memoryType;
	}
	
	public TypeDefinition getRawType(){
		return advisor.transform(raw(type));
	}
	
	public boolean isCompatible(TypeSignature other){
		TypeDefinition td1 = getRawType();
		TypeDefinition td2 = other.getRawType();
		
		if (memoryType == null && other.memoryType == null){
			return isConstCompatible(td1, td2);
		}
		
		if (!isCompatible(td1, td2)) return false;
		
		if (memoryType == null)
			return other.memoryType == null;
		else
			return memoryType.equals(other.memoryType);
	}
	
	public static TypeDefinition raw(TypeDefinition td){
		if (td instanceof ReferenceTypeDefinition){
			return raw(EcoreUtil.copy(((ReferenceTypeDefinition) td).getType().getDefinition()));
		}
		return td;
	}
	
	public static boolean isConstCompatible(TypeDefinition td1, TypeDefinition td2){
		if (td1 instanceof ReferenceTypeDefinition) 
			return isConstCompatible(((ReferenceTypeDefinition) td1).getType().getDefinition(), td2);
		if (td2 instanceof ReferenceTypeDefinition)
			return isConstCompatible(td1, ((ReferenceTypeDefinition) td2).getType().getDefinition());
		
		if (td1 instanceof CodeLabelTypeDefinition)
			return td2 instanceof CodeLabelTypeDefinition;
		
		if (td1 instanceof UnsignedTypeDefinition && td2 instanceof UnsignedTypeDefinition){
			UnsignedTypeDefinition utd1 = (UnsignedTypeDefinition)td1;
			UnsignedTypeDefinition utd2 = (UnsignedTypeDefinition)td2;
			return utd1.getBits() <= utd2.getBits();
		}
		
		return false;
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
	
	public static TypeSignature create(SymbolAssignment sa, DeviceSpecificTypeAdvisor advisor){
		if (sa instanceof SymbolAddressAssignment){
			return new TypeSignature(sa.getType(), ((SymbolAddressAssignment) sa).getMemoryInstance().getType(), advisor);
		}
		return new TypeSignature(sa.getType(), null, advisor);
	}
	
	public static TypeSignature create(OperationArgument arg, DeviceSpecificTypeAdvisor advisor){
		return new TypeSignature(arg.getType(), arg.getMemType(), advisor);
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
		if (type instanceof PointerTypeDefinition){
			sb.append("pointer");
		}
		if (type instanceof ArrayTypeDefinition){
			sb.append("array");
		}
		if(memoryType != null){
			sb.append("@");
			sb.append(memoryType.getName());
		}
		return sb.toString();
	}
	
}
