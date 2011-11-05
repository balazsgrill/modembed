/**
 * 
 */
package hu.modembed.pic.device.persistence.tokens;

/**
 * @author balazs.grill
 *
 */
public interface ITokenHandler {

	public void handleToken(String token, Parser parser);
	
}
