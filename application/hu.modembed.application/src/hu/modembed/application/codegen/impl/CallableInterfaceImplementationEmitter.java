/**
 * 
 */
package hu.modembed.application.codegen.impl;

import java.util.List;

import hu.modembed.application.codegen.InterfaceImplementationEmitter;
import hu.modembed.application.codegen.InterfaceInstance;
import application.ApplicationInterface;
import application.ApplicationInterfaceType;
import application.Argument;
import application.BufferInterfaceType;
import application.CallableInterfaceType;

/**
 * @author balazs.grill
 *
 */
public class CallableInterfaceImplementationEmitter implements
		InterfaceImplementationEmitter<CallableInterfaceType> {

	private static String APIName(List<? extends ApplicationInterface> appIf){
		StringBuilder APIName = new StringBuilder();
		boolean first = true;
		for(ApplicationInterface ai : appIf){
			if (first) {
				first = false;
			}else{
				APIName.append("_");
			}
			APIName.append(ai.getName());
		}
		return APIName.toString();
	}
	
	private static String signature(List<? extends ApplicationInterface> appIf){
		ApplicationInterface leaf = appIf.get(appIf.size()-1);
		ApplicationInterfaceType type = leaf.getType();
		
		String APIName = APIName(appIf);
		
		if (type instanceof CallableInterfaceType){
			StringBuilder sb = new StringBuilder();
			sb.append("void ");
			sb.append(APIName.toString());
			sb.append("(");
			boolean first = true;
			for(Argument arg : ((CallableInterfaceType) type).getArguments()){
				if (first){
					first = false;
				}else{
					sb.append(", ");
				}
				sb.append(arg.getType().getName());
				if (arg.isOutput()){
					sb.append("*");
				}
				sb.append(" ");
				sb.append(arg.getName());
			}
			sb.append(")");
			return sb.toString();
		}
		
		if (type instanceof BufferInterfaceType){
			return ((BufferInterfaceType) type).getType().getName()+" "+APIName.toString();
		}
		
		return APIName.toString();
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.application.codegen.InterfaceImplementationEmitter#emitDeclaration(hu.modembed.application.codegen.InterfaceInstance, java.lang.StringBuilder)
	 */
	@Override
	public void emitDeclaration(InterfaceInstance instance, StringBuilder header) {
		header.append("\nextern ");
		header.append(signature(instance.interfaces));
		header.append(";\n");

	}

	/* (non-Javadoc)
	 * @see hu.modembed.application.codegen.InterfaceImplementationEmitter#emitImplementation(hu.modembed.application.codegen.InterfaceInstance, java.lang.StringBuilder, java.lang.StringBuilder, java.util.List)
	 */
	@Override
	public void emitImplementation(InterfaceInstance instance,
			StringBuilder header, StringBuilder impl,
			List<InterfaceInstance> mappedImplementations) {
		impl.append("\n");
		impl.append(signature(instance.interfaces));
		impl.append("{\n");
		for(InterfaceInstance delegate : mappedImplementations){
			impl.append("\t");
			impl.append(APIName(delegate.interfaces));
			impl.append("(");
			boolean first = true;
			for(Argument arg : ((CallableInterfaceType) instance.type()).getArguments()){
				if (first){
					first = false;
				}else{
					impl.append(", ");
				}
				impl.append(arg.getName());
			}
			impl.append(");\n");
		}

		impl.append("}\n");

	}

}
