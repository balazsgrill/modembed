/**
 * 
 */
package hu.e.compiler;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import hu.e.compiler.internal.HexFileCompiler;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.internal.model.LabelStep;
import hu.e.compiler.internal.model.OperationEntryStep;
import hu.e.compiler.internal.model.OperationExitStep;
import hu.e.parser.eSyntax.BinaryType;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.Package;
import hu.e.parser.eSyntax.TopLevelItem;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResourceSet;



/**
 * @author balazs.grill
 *
 */
public class ECompiler {

	public static void throwError(EObject element, String text){
		ICompositeNode cn = NodeModelUtils.findActualNodeFor(element);
		Package p = null;
		EObject eo = element;
		while(!(eo instanceof Package) && (eo != null)){
			eo = eo.eContainer();
			if (eo instanceof Package)
				p = (Package)eo;
		}
		String msg = text;
		if (cn != null && p != null){
			msg = text + " at "+p.getName()+" line "+cn.getStartLine();
		}
		throw new RuntimeException(msg);
	}
	
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
	
	private static String produceLST(List<IProgramStep> steps){
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int r = 0;
		for(IProgramStep s : steps){
			for(int j =0;j<r;j++) sb.append(" ");
			if (s instanceof InstructionWordInstance){
				sb.append(i);sb.append(": ");
				sb.append(Integer.toBinaryString(((InstructionWordInstance) s).getValue()));
				i++;
			}
			if (s instanceof LabelStep){
				sb.append("label ");
				sb.append(((LabelStep) s).label.getName());
			}
			if (s instanceof OperationEntryStep){
				sb.append(s);sb.append("{");
				r++;
			}
			if (s instanceof OperationExitStep){
				sb.append("}");
				r--;
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void compile(IFile f){
		XtextResourceSet resourceset = new XtextResourceSet();
		Resource r = resourceset.getResource(URI.createPlatformResourceURI(f.getFullPath().toString(), true), true);

		for(EObject eo : r.getContents()){
			if (eo instanceof Package){
				System.out.println("Processing namespace "+((Package) eo).getName());
				
				
				for(TopLevelItem tli : ((Package) eo).getItems()){
					if (tli instanceof LinkedBinary){
						LinkedBinary b = (LinkedBinary)tli;
						if (BinaryType.HEXFILE == b.getType()){
							System.out.println("Creating "+b.getName());
							IFile hf = getHexFileSibling(f, b.getName()+".hex");
							Resource hr = resourceset.createResource(URI.createPlatformResourceURI(hf.getFullPath().toString(),true));
							HexFileCompiler hfc = new HexFileCompiler(b);
							hr.getContents().add(hfc.create());
							try {
								hr.save(null);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							//Produce lst files.
							for(FunctionBinarySection fbs : hfc.getSteps().keySet()){
								List<IProgramStep> steps = hfc.getSteps().get(fbs);
								IFile lf = getHexFileSibling(f, fbs.getOperation().getName()+".lst");
								String content = produceLST(steps);
								try {
									if (lf.exists()){
										lf.setContents(new ByteArrayInputStream(content.getBytes()), true, true, new NullProgressMonitor());
									}else{
										lf.create(new ByteArrayInputStream(content.getBytes()),true, new NullProgressMonitor());
									}
								}catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		
	}
	
}
