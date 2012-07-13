/**
 * 
 */
package hu.modembed.ui.disassemble;

import hu.modembed.ui.MODembedUI;

/**
 * @author balazs.grill
 *
 */
public interface IDisassembleLaunchAttributes {

	public static final String prefix = MODembedUI.PLUGIN_ID+".disassembler";
	
	public static final String HEXFILE = prefix+".hexfile";
	
	public static final String INSTRUCTIONSET = prefix+".instructionSet";
	
	public static final String RESULTFILE = prefix+".resultfile";
	
}
