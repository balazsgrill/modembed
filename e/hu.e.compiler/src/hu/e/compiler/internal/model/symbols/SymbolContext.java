/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

/**
 * @author balage
 *
 */
public enum SymbolContext {

	COMPILETIME,
	LINKTIME,
	RUNTIME;
	
	public boolean isAssignableAt(SymbolContext context){
		switch(this){
		case COMPILETIME:
			return true;
		case LINKTIME:
			return RUNTIME == context || LINKTIME == context;
		case RUNTIME:
			return RUNTIME == context;
		default:
			return false;
		}
	}
	
}
