/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.readers;

import hu.cubussapiens.modembed.pic.device.persistence.tokens.ITokenHandler;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractModelReader<T> implements ITokenHandler {

	protected final T model;
	
	/**
	 * 
	 */
	public AbstractModelReader(T model) {
		this.model = model;
	}



}
