/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.Severity;
import hu.e.compiler.list.StatusStep;
import hu.e.parser.eSyntax.CompilationUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * @author balazs.grill
 *
 */
public class CompilationErrorEntry{

	public static ProgramStep create(ECompilerException e){
		return new CompilationErrorEntry(Severity.ERROR, e.getItem(), e.getMessage()).createStep();
	}
	
	public static ProgramStep error(EObject item, String msg){
		return new CompilationErrorEntry(Severity.ERROR, item, msg).createStep();
	}
	
	public static ProgramStep warning(EObject item, String msg){
		return new CompilationErrorEntry(Severity.WARNING, item, msg).createStep();
	}
	
	public static ProgramStep info(EObject item, String msg){
		return new CompilationErrorEntry(Severity.INFO, item, msg).createStep();
	}
	
	private ProgramStep createStep(){
		StatusStep ss = ListFactory.eINSTANCE.createStatusStep();
		ss.setMessage(getMsg() + getLocation(getItem()));
		ss.setSeverity(getType());
		return ss;
	}
	
	private final Severity type;
	private final EObject item;
	private final String msg;
	
	public CompilationErrorEntry(Severity type, EObject item, String msg) {
		this.type = type;
		this.item = item;
		this.msg = msg;
	}
	
	public Severity getType() {
		return type;
	}
	
	public EObject getItem() {
		return item;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public String getLocation(EObject element){
		ICompositeNode cn = NodeModelUtils.findActualNodeFor(element);
		CompilationUnit p = null;
		EObject eo = element;
		while(!(eo instanceof CompilationUnit) && (eo != null)){
			eo = eo.eContainer();
			if (eo instanceof CompilationUnit)
				p = (CompilationUnit)eo;
		}
		if (cn != null && p != null){
			return " at "+p.getName()+" line "+cn.getStartLine();
		}
		return " (unknown source)";
	}
	
	
}
