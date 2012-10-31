/**
 * 
 */
package hu.e.parser.convert.impl;

/**
 * @author balazs.grill
 *
 */
public enum PlatformOperations {

	SET
	;
	
	public static final String PLATFORM = "e.platform";
	
	public String qid(){
		return PLATFORM+"::"+name();
	}
}
