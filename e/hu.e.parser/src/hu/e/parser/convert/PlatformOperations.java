/**
 * 
 */
package hu.e.parser.convert;

/**
 * @author balazs.grill
 *
 */
public enum PlatformOperations {

	ASSIGN,
	ASSIGNADD,
	ASSIGNSUBTRACT,
	
	AND,
	OR,
	
	DIV,
	MOD,
	MUL,
	
	REFERENCE,
	DEREFERENCE,
	NOT,
	UNARY_MINUS, 
	
	EQUALS, 
	GT, GTE, 
	LT, LTE, 
	NOTEQUALS, 
	
	ADD, MINUS,
	;
	
	public static final String PLATFORM = "e.platform";
	
	public String qid(){
		return PLATFORM+"::"+name();
	}
}
