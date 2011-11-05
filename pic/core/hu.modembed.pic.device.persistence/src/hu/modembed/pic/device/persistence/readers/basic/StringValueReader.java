/**
 * 
 */
package hu.modembed.pic.device.persistence.readers.basic;

import hu.modembed.pic.device.persistence.tokens.ITokenHandler;
import hu.modembed.pic.device.persistence.tokens.Parser;

/**
 * @author balazs.grill
 *
 */
public abstract class StringValueReader implements ITokenHandler {

	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, Parser parser) {
		if (token.startsWith("\'") || token.startsWith("\""))
			token = token.substring(1, token.length()-1);

		handleString(token);
		parser.pop();
	}

	protected abstract void handleString(String value);
	
}
