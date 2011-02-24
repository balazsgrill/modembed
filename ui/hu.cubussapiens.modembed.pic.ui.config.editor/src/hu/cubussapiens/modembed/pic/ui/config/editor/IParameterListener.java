/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.config.editor;

import modembedconfig.Parameter;

/**
 * @author balage
 *
 */
public interface IParameterListener {

	public void parameterValueChanged(Parameter parameter, int newvalue);
	
}
