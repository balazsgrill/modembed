/**
 * 
 */
package hu.modembed.pic.pk2cmd;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * @author balazs.grill
 *
 */
public class PK2CMDExecutable {

	private final String executable;
	private final String deviceFile;
	
	PK2CMDExecutable(URL executable, URL deviceFile) throws CoreException {
		try {
			executable = FileLocator.toFileURL(executable);
			deviceFile = FileLocator.toFileURL(deviceFile);
			this.executable = new File(executable.toURI()).getCanonicalPath();
			this.deviceFile = new File(deviceFile.toURI()).getParentFile().getCanonicalPath();
		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR,PK2Plugin.PLUGIN_ID, 
					"Could not load pk2cmd executable! ("+executable+", "+deviceFile+")",e));
		}
	}
	
	public String detectDevice(String pk2id){
		try {
			PK2ResultData rd = run(null,pk2id, "-I","-P");
			if (rd.success){
				return rd.devicename;
			}
		} catch (IOException e) {
		}
		return null;
	}
	
	public String[] detectPicKits(){
		try {
			PK2ResultData rd = run(null,null, "-S");
			if (rd.success){
				return rd.getDetected();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean programDevice(String device, String pk2id, String hexfile, IProgressMonitor monitor){
		if (device == null) device="";
		monitor.beginTask("Programming device..", 400);
		try {
			PK2ResultData rd = run(monitor,pk2id, "-P"+device, "-F"+hexfile, "-E", "-M", "-JN");
			monitor.done();
			return rd.success;
		} catch (IOException e) {
		}
		return false;
	}
	
	public boolean startDevice(String device, String pk2id){
		if (device == null) device="";
		try {
			PK2ResultData rd = run(null,pk2id, "-P"+device, "-T");
			return rd.success;
		} catch (IOException e) {
		}
		return false;
	}
	
	public boolean stopDevice(String device, String pk2id){
		if (device == null) device="";
		try {
			PK2ResultData rd = run(null,pk2id, "-P"+device);
			return rd.success;
		} catch (IOException e) {
		}
		return false;
	}
	
	private PK2ResultData run(IProgressMonitor monitor, String pk2id, String...params) throws IOException{
		PK2ResultData rd = new PK2ResultData(monitor);
		String line;
		List<String> cmd = new ArrayList<String>(params.length+3);
		cmd.add(executable);
		cmd.add("-B"+deviceFile);
		if (pk2id != null && !pk2id.isEmpty()){
			cmd.add("-S"+pk2id);
		}
		cmd.addAll(Arrays.asList(params));
		Process p = Runtime.getRuntime().exec(cmd.toArray(new String[cmd.size()]));
		BufferedReader input =
			new BufferedReader
			(new InputStreamReader(p.getInputStream()));
		while ((line = input.readLine()) != null) {
			rd.addLine(line);
		}
		input.close();
	     return rd;
	}
	
}
