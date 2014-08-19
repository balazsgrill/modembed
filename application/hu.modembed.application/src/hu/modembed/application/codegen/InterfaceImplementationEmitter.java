/**
 * 
 */
package hu.modembed.application.codegen;

import java.util.List;

import application.ApplicationInterfaceType;

/**
 * @author balazs.grill
 *
 */
public interface InterfaceImplementationEmitter<T extends ApplicationInterfaceType> {

	public void emitDeclaration(InterfaceInstance instance, StringBuilder header);
	
	public void emitImplementation(InterfaceInstance instance, StringBuilder header, StringBuilder impl, List<InterfaceInstance> mappedImplementations);
	
}
