/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler;

import org.eclipse.core.runtime.IProgressMonitor;

import hexfile.HexFile;

/**
 * Task, which can be executed at the end of the compilation process
 * 
 * @author balazs.grill
 *
 */
public interface IPostBuildProcess {

	/**
	 * Executes the post-build process
	 * 
	 * @param hexfile
	 * @param monitor
	 */
	public void execute(HexFile hexfile, IProgressMonitor monitor);
	
}
