/**
 * 
 */
package hu.e.compiler;

import hu.e.compiler.internal.HexFileCompiler;
import hu.e.compiler.list.ProgramList;
import hu.e.parser.eSyntax.BinaryType;
import hu.e.parser.eSyntax.LinkedBinary;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
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
	
	private IFile getHexFileSibling(IFile f, String name){
		String filename = name;
		IContainer c = f.getParent();
		if (c instanceof IProject){
			return ((IProject)c).getFile(filename);
		}
		if (c instanceof IFolder){
			return ((IFolder)c).getFile(filename);
		}
		return null;
	}

	
	public void compile(Resource r, IFile f){
		
		ResourceSet resourceset = r.getResourceSet();

		for(EObject eo : r.getContents()){
			if (eo instanceof LinkedBinary){
				LinkedBinary b = (LinkedBinary)eo;
				if (BinaryType.HEXFILE == b.getType()){
					System.out.println("Creating "+b.getName());
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
						IFile lf = getHexFileSibling(f, pl.getName()+".lst");
						Resource lr = resourceset.createResource(URI.createPlatformResourceURI(lf.getFullPath().toString(),true));
						lr.getContents().clear();
						lr.getContents().add(pl);
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
