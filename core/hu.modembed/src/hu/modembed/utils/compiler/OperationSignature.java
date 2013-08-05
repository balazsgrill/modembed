/**
 * 
 */
package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;


/**
 * @author balazs.grill
 *
 */
public class OperationSignature {

	private final String identifier;
	private final TypeSignature[] arguments;
	
	public OperationSignature(String identifier, TypeSignature[] arguments) {
		this.identifier = identifier;
		this.arguments = arguments;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public TypeSignature[] getArguments() {
		return arguments;
	}
	
	public static OperationSignature create(OperationDefinition odef){
		String id = odef.getOperation();
		TypeSignature[] args = new TypeSignature[odef.getArguments().size()];
		for(int i=0;i<args.length;i++){
			args[i] = TypeSignature.create(odef.getArguments().get(i));
		}
		return new OperationSignature(id, args);
	}
	
	public static boolean isCompatible(OperationSignature os1, OperationSignature os2){
		if (os1.identifier.equals(os2.identifier)){
			if (os1.arguments.length == os2.arguments.length){
				for(int i=0;i<os1.arguments.length;i++){
					if (!os1.arguments[i].isCompatible(os2.arguments[i])) return false;
				}
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(identifier);
		sb.append("(");
		boolean first = true;
		for(TypeSignature ts: arguments){
			if (first) first = false;
			else sb.append(", ");
			sb.append(ts);
		}
		sb.append(")");
		return sb.toString();
	}
	
}
