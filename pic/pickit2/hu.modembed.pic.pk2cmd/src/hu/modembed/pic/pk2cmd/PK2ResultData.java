/**
 * 
 */
package hu.modembed.pic.pk2cmd;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public class PK2ResultData {

	private final IProgressMonitor monitor;
	
	public PK2ResultData(IProgressMonitor monitor) {
		this.monitor = monitor;
	}
	
	boolean success = false;
	
	String devicename = null;
	
	public boolean isSuccess() {
		return success;
	}
	
	public String getDevicename() {
		return devicename;
	}
	
	private static final String DEVNAMEpx = "Device Name = ";
	private static final String OPERATIONpx = "Operation:";
	
	private static final String DETECTLine = "Unit #     Unit ID";
	
	private IProgressMonitor submonitor = null;
	private int lasttick = 0;
	private boolean detecting = false;
	
	private String[] detected = new String[0];
	
	public String[] getDetected() {
		return detected;
	}
	
	private void addDetected(int order, String id){
		if (detected.length <= order){
			String[] news = new String[order+1];
			System.arraycopy(detected, 0, news, 0, detected.length);
			detected = news;
		}
		detected[order] = id;
	}
	
	public void addLine(String string){
		if (string == null) return;
		string = string.trim();
		
		if (detecting){
			if (string.isEmpty()){
				detecting = false;
				return;
			}
			
			int i = 0;
			while(Character.isDigit(string.charAt(i))){
				i++;
			}
			if (i > 0){
				String num = string.substring(0,i);
				try {
					int w = Integer.parseInt(num);
					String id = string.substring(num.length()).trim();
					addDetected(w, id);
				}catch(NumberFormatException e){
					// Nothing, expected error
				}
			}
		}
		
		if ("Operation Succeeded".equals(string)){
			success = true;
			return;
		}
		if (DETECTLine.equals(string)){
			detecting = true;
			return;
		}
		if (string.startsWith(DEVNAMEpx)){
			devicename = string.substring(DEVNAMEpx.length()).trim();
			return;
		}
		if (monitor != null){
			if (string.startsWith(OPERATIONpx)){
				String operation = string.substring(OPERATIONpx.length()).trim();
				if (submonitor != null){
					submonitor.done();
				}
				submonitor = new SubProgressMonitor(monitor, 100);
				lasttick = 0;
				submonitor.beginTask(operation, 100);
				monitor.setTaskName(operation);
				return;
			}
			if (string.endsWith("%")){
				if (submonitor != null){
					String number = string.substring(0, string.length()-1);
					try {
						int w = Integer.parseInt(number);
						submonitor.worked(w-lasttick);
						lasttick = w;
						if (w >= 100){
							submonitor.done();
							submonitor = null;
						}
					}catch(NumberFormatException e){
						// Nothing, expected error
					}
				}
			}
		}
	}
	
}
