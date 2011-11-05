/**
 * 
 */
package hu.modembed;

import java.net.URL;

/**
 * @author balazs.grill
 *
 */
public class RegisteredProgrammer {

	String name = null;
	String id = null;
	URL image = null;
	IProgrammerType handler = null;
	
	RegisteredProgrammer() {
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public IProgrammerType getHandler() {
		return handler;
	}
	
	public URL getImage() {
		return image;
	}
	
}
