/**
 * 
 */
package hu.modembed.application.codegen.impl;

import java.util.List;

import hu.modembed.application.codegen.InterfaceImplementationEmitter;
import hu.modembed.application.codegen.InterfaceInstance;
import application.ApplicationInterface;
import application.BufferInterfaceType;

/**
 * @author balazs.grill
 *
 */
public class BufferImplementationEmitter implements
		InterfaceImplementationEmitter<BufferInterfaceType> {

	private String name(InterfaceInstance instance){
		StringBuilder APIName = new StringBuilder();
		boolean first = true;
		for(ApplicationInterface ai : instance.interfaces){
			if (first) {
				first = false;
			}else{
				APIName.append("_");
			}
			APIName.append(ai.getName());
		}
		return APIName.toString();
	}
	
	private String type(InterfaceInstance instance){
		return ((BufferInterfaceType)instance.type()).getType().getName();
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.application.codegen.InterfaceImplementationEmitter#emitDeclaration(hu.modembed.application.codegen.InterfaceInstance, java.lang.StringBuilder)
	 */
	@Override
	public void emitDeclaration(InterfaceInstance instance, StringBuilder header) {
		
		header.append("\nextern ");
		header.append(type(instance));header.append(" ");
		header.append(name(instance));
		header.append("_GET();\n");
		
		header.append("\nextern void ");
		header.append(name(instance));
		header.append("_SET(");
		header.append(type(instance));
		header.append(" data);\n");

	}

	/* (non-Javadoc)
	 * @see hu.modembed.application.codegen.InterfaceImplementationEmitter#emitImplementation(hu.modembed.application.codegen.InterfaceInstance, java.lang.StringBuilder, java.lang.StringBuilder, java.util.List)
	 */
	@Override
	public void emitImplementation(InterfaceInstance instance,
			StringBuilder header, StringBuilder impl,
			List<InterfaceInstance> mappedImplementations) {
		String bufferName = name(instance)+"_BUFFER";
		boolean mapped = !mappedImplementations.isEmpty();
		if (!mapped){
			impl.append("\n static ");impl.append(bufferName);impl.append(";\n");
		}
		
		impl.append("\nextern ");
		impl.append(type(instance));impl.append(" ");
		impl.append(name(instance));
		impl.append("_GET(){return ");
		if (mapped){
			impl.append(name(mappedImplementations.get(0)));impl.append("_GET()");
		}else{
			impl.append(bufferName);
		}
		impl.append(";}\n"); 
		
		impl.append("\nextern void ");
		impl.append(name(instance));
		impl.append("_SET(");
		impl.append(type(instance));
		impl.append(" data){\n");
		if (mapped){
			for(InterfaceInstance ii : mappedImplementations){
				impl.append("\t");
				impl.append(name(ii));
				impl.append("_SET(data);\n");
			}
		}else{
			impl.append("\t");
			impl.append(bufferName);impl.append(" = data;\n");
		}
		impl.append("}\n");
		

	}

}
