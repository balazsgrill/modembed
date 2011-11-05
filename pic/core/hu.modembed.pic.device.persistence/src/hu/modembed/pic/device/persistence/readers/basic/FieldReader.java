/**
 * 
 */
package hu.modembed.pic.device.persistence.readers.basic;

import hu.modembed.pic.device.persistence.tokens.IHandlerPopListener;
import hu.modembed.pic.device.persistence.tokens.ITokenHandler;
import hu.modembed.pic.device.persistence.tokens.Parser;

/**
 * @author balazs.grill
 *
 */
public class FieldReader implements ITokenHandler {

	private final ITokenHandler valuereader;
	
	public FieldReader(ITokenHandler valuereader) {
		this.valuereader = valuereader;
	}
	
	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, final Parser parser) {
		if ("=".equals(token)){
			parser.push(new ITokenHandler() {
				
				@Override
				public void handleToken(String token, Parser parser) {
					get().handleToken(token, parser);
				}
			}, new IHandlerPopListener() {
				
				@Override
				public void handlerPopped() {
					parser.pop();
				}
			});
		}else{
			parser.throwBack(token);
		}
		
	}

	protected ITokenHandler get(){
		return valuereader;
	}
	
}
