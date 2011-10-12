/**
 * 
 */
package hu.e.compiler;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * @author balazs.grill
 *
 */
public class ECompilerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8129502438522020242L;

	static int getLineNumber(EObject e){
		ICompositeNode cn = NodeModelUtils.findActualNodeFor(e);
		if (cn != null){
			return cn.getStartLine();
		}
		return -1;
	}
	
	/**
	 * 
	 */
	public ECompilerException(EObject parsermodel, String text) {
		super(text+" at line "+getLineNumber(parsermodel));
	}



}
