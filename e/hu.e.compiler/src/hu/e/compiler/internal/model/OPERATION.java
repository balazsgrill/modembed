/**
 * 
 */
package hu.e.compiler.internal.model;

/**
 * @author balazs.grill
 *
 */
public enum OPERATION {
	
	//Branch
	BRANCH,
	
	//MULTIPLICATIVE
	MUL,
	DIV,
	MOD,
	
	//ADDITIVE
	ADD,
	MINUS,
	
	//EQUALITY
	EQUALS,
	NOTEQUALS,
	GT,
	LT,
	GTE,
	LTE,
	
	//BOOLEAN
	AND,
	OR,
	
	//UNARY
	UNARYMINUS,
	NOT
	
}
