/**
 * 
 */
package hu.e.compiler.tasks;

import hexfile.HexFile;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.modembed.model.architecture.Architecture;
import hu.modembed.model.core.assembler.InstructionSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class DisassembleHexFileTask implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String ARCH = "arch";
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor, java.util.Map)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		System.out.println("Disassembling...");

		//Read input hex:
		String inputfile = context.getParameterValue(INPUT).get(0);
		URI hexfileuri = context.getFileURI(inputfile);
		Resource hexres = context.getInput(hexfileuri);
		HexFile hfile = (HexFile)hexres.getContents().get(0);
		
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		
		String archmodel = context.getParameterValue(ARCH).get(0);
		Resource archres = context.getInput(context.getModelURI(archmodel));
		Architecture arch = (Architecture)archres.getContents().get(0);
		
		
	}


}
