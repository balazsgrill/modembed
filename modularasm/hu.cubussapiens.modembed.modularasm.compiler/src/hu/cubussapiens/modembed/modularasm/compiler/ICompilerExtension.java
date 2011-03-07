/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler;

/**
 * Extensions for the compiler
 * 
 * @author balazs.grill
 */
public interface ICompilerExtension {

	/**
	 * Configures the compiler according to this extension
	 * @param compiler
	 */
	public void configure(ICompiler compiler);
	
}
