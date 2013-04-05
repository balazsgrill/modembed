/**
 * 
 */
package hu.e.compiler.tasks.internal;

import hu.e.compiler.TaskUtils;
import hu.modembed.model.emodel.VariableParameterKind;
import hu.modembed.model.emodel.types.TypeDefinition;

/**
 * @author balazs.grill
 *
 */
public class TypeSignature {

	private final TypeDefinition type;
	private final VariableParameterKind kind;
	
	public TypeSignature(TypeDefinition type, VariableParameterKind kind) {
		this.kind = kind;
		this.type = type;
	}
	
	public TypeDefinition getType() {
		return type;
	}
	
	public VariableParameterKind getKind() {
		return kind;
	}
	
	@Override
	public String toString() {
		return kind+" "+TaskUtils.printType(type);
	}
	
}
