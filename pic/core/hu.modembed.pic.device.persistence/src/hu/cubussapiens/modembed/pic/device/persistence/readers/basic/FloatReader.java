/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers.basic;

import hu.cubussapiens.modembed.pic.device.persistence.tokens.ITokenHandler;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;

/**
 * @author balazs.grill
 *
 */
public abstract class FloatReader implements ITokenHandler {

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, Parser parser) {

		float i = Float.parseFloat(token);
		handleFloat(i);
		parser.pop();

	}

	protected abstract void handleFloat(float value);
	
}
