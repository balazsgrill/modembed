/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.modularASM.Method;

/**
 * @author balazs.grill
 *
 */
public class MethodDescriptor {

	public final Method method;
	public final ModuleInstance namespace;
	
	public MethodDescriptor(ModuleInstance namespace, Method method) {
		this.method = method;
		this.namespace = namespace;
	}
	
}
