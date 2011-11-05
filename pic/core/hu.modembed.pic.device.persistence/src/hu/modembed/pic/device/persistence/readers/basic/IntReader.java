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
public abstract class IntReader implements ITokenHandler {

	public static int parseInt(String token){
		if (token.startsWith("0x")){
			/*
			 * Parse hexadecimal
			 */
			return Integer.parseInt(token.substring(2), 16);
		}else{
			return Integer.parseInt(token);
		}
	}
	
	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, Parser parser) {
			handleInt(parseInt(token));
			parser.pop();
	}

	protected abstract void handleInt(int value);
	
}
