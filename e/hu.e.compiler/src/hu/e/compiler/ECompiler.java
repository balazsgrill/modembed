/**
 * 
 */
package hu.e.compiler;

import hu.e.compiler.internal.HexFileCompiler;
import hu.e.compiler.internal.linking.ProgramListDiagnoser;
import hu.e.compiler.internal.linking.ProgramListDiagnoser.UncontainedEntry;
import hu.e.compiler.list.ProgramList;
import hu.e.parser.eSyntax.BinaryType;
import hu.e.parser.eSyntax.LinkedBinary;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;



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
	
	private IFile getHexFileSibling(IFile f, String name) throws CoreException{
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
	
	public void compile(Resource r, IFile f) throws CoreException{
		
		ResourceSet resourceset = r.getResourceSet();

		for(EObject eo : r.getContents()){
			if (eo instanceof LinkedBinary){
				LinkedBinary b = (LinkedBinary)eo;
				if (BinaryType.INTELHEXFILE == b.getType()){
					
					IFile hf = getHexFileSibling(f, b.getName()+".hex");
					Resource hr = resourceset.createResource(URI.createPlatformResourceURI(hf.getFullPath().toString(),true));
					HexFileCompiler hfc = new HexFileCompiler(b);
					hr.getContents().clear();
					hr.getContents().add(hfc.create());
					try {
						hr.save(null);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					//Produce lst files.
					for(ProgramList pl : hfc.getLists()){
						IFile lf = getHexFileSibling(f, b.getName()+"."+pl.getName()+".lst");
						Resource lr = resourceset.createResource(URI.createPlatformResourceURI(lf.getFullPath().toString(),true));
						lr.getContents().clear();
						lr.getContents().add(pl);
						for(UncontainedEntry entry : ProgramListDiagnoser.getUncontainedEntries(pl)){
							System.err.println("Uncontained entry: "+entry);
							entry.parent.eSet(entry.ref, null);
						}
						try {
							lr.save(null);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		
	}
	
}
