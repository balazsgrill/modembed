/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import hu.cubussapiens.modembed.modularasm.modularASM.Variable;

/**
 * @author balazs.grill
 *
 */
public class VariableInstance {

	public final ModuleInstance mi;
	public final Variable v;
	
	/**
	 * 
	 */
	public VariableInstance(ModuleInstance mi, Variable v) {
		this.mi = mi;
		this.v = v;
	}

	public int address = -1;
	
	public String getRootReference(){
		String r = mi.getRootReference(); 
		return (r.isEmpty() ? "" : r+".")+v.getName();
	}
	
}
