/**
 * 
 */
package hu.e.compiler;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class ECompilerException extends Exception {

	private final EObject item;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8129502438522020242L;

	public EObject getItem() {
		return item;
	}
	
	/**
	 * 
	 */
	public ECompilerException(EObject parsermodel, String text) {
		super(text);
		this.item = parsermodel;
	}



}
