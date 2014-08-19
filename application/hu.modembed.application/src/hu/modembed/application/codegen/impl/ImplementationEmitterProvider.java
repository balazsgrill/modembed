/**
 * 
 */
package hu.modembed.application.codegen.impl;

import hu.modembed.application.codegen.InterfaceImplementationEmitter;
import application.ApplicationInterfaceType;
import application.BufferInterfaceType;
import application.CallableInterfaceType;

/**
 * @author balazs.grill
 *
 */
public class ImplementationEmitterProvider {

	public static InterfaceImplementationEmitter<?> getEmitter(ApplicationInterfaceType appif){
		
		if (appif instanceof CallableInterfaceType){
			return new CallableInterfaceImplementationEmitter();
		}
		if (appif instanceof BufferInterfaceType){
			return new BufferImplementationEmitter();
		}
		
		return null;
	}
	
}
