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
public abstract class IntRangeReader implements ITokenHandler {

	private int start;
	
	int state = 0;
	
	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, final Parser parser) {
		switch(state){
		case 0:
			start = IntReader.parseInt(token);
			state++;
			return;
		case 1:
			if ("-".equals(token)){
				state++;
				return;
			}
			break;
		case 2:
			handleRange(start, IntReader.parseInt(token));
			parser.pop();
			return;
		}
		parser.throwBack(token);
	}

	protected abstract void handleRange(int start, int end);
	
}
