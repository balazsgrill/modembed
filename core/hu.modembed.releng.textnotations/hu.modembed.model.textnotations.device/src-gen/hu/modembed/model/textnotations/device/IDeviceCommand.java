/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IDeviceCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
