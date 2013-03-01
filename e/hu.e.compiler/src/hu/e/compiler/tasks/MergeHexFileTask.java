/**
 * 
 */
package hu.e.compiler.tasks;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;

/**
 * @author balazs.grill
 *
 */
public class MergeHexFileTask implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		List<Entry> entries = new LinkedList<Entry>();
		
		for(String inputfile : context.getParameterValue(INPUT)){
			Resource hexinput = context.getInput(context.getFileURI(inputfile));
			HexFile hf = EcoreUtil.copy((HexFile) hexinput.getContents().get(0));
			entries.addAll(hf.getEntries());
		}

		Resource outputRes = context.getOutput(context.getFileURI(context.getParameterValue(OUTPUT).get(0)));
		HexFile output = HexfileFactory.eINSTANCE.createHexFile();
		outputRes.getContents().add(output);
		
		Collections.sort(entries, new Comparator<Entry>() {

			@Override
			public int compare(Entry o1, Entry o2) {
				Integer a1 = o1.getAddress();
				Integer a2 = o2.getAddress();
				return a1.compareTo(a2);
			}
		});
		
		output.setAddressType(AddressType.EXTENDED_LINEAR);
		output.getEntries().addAll(entries);
	}

}
