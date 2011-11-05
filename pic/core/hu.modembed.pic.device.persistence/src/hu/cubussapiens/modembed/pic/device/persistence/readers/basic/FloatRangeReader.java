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
public abstract class FloatRangeReader implements ITokenHandler {

	private float start;
	
	int state = 0;
	
	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, final Parser parser) {
		switch(state){
		case 0:
			start = Float.parseFloat(token);
			state++;
			return;
		case 1:
			if ("-".equals(token)){
				state++;
				return;
			}
			break;
		case 2:
			handleRange(start, Float.parseFloat(token));
			parser.pop();
			return;
		}
		parser.throwBack(token);
	}

	protected abstract void handleRange(float start, float end);
	
}
