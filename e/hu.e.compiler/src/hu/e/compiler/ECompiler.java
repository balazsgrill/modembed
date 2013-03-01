/**
 * 
 */
package hu.e.compiler;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;



/**
 * @author balazs.grill
 *
 */
public class ECompiler {
	
	public static int convertLiteral(String lit){
		if (lit.toLowerCase().startsWith("b")){
			return Integer.parseInt(lit.substring(1), 2);
		}
		if (lit.toLowerCase().startsWith("0x")){
			return Integer.parseInt(lit.substring(2), 16);
		}
		return Integer.parseInt(lit);
	}
	
	public static String convertScriptLiteral(String lit){
		String r = lit;
		if (r.startsWith("$$")) r = r.substring(2);
		if (r.endsWith("$$")) r = r.substring(0, r.length()-2);
		return r.trim();
	}
	
	protected IFile getHexFileSibling(IFile f, String name) throws CoreException{
		String filename = name;
		IFolder c = f.getProject().getFolder("out");
		if (!c.exists()){
			c.create(true, true, new NullProgressMonitor());
		}
//		if (c instanceof IProject){
//			return ((IProject)c).getFile(filename);
//		}
		if (c instanceof IFolder){
			return ((IFolder)c).getFile(filename);
		}
		return null;
	}
	
}
