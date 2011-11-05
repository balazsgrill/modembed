/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers;

import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;

/**
 * @author balazs.grill
 *
 */
public abstract class BracketedReader<T> extends AbstractModelReader<T> {

	/**
	 * @param model
	 */
	public BracketedReader(T model) {
		super(model);
	}

	private boolean in = false;
	
	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, Parser parser) {
		if (in){

			if (")".equals(token)){
				parser.pop();
				return;
			}
			
			doHandlerToken(token, parser);
			
		}else{
			if ("(".equalsIgnoreCase(token)){
				in = true;
			}else{
				parser.throwBack(token);
			}
		}
	}

	protected abstract void doHandlerToken(String token, Parser parser);
	
}
