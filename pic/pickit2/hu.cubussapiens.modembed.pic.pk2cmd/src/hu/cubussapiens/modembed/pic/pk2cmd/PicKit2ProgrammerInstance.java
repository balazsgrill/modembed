/**
 * 
 */
package hu.cubussapiens.modembed.pic.pk2cmd;

import hu.cubussapiens.modembed.IProgrammerInstance;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public class PicKit2ProgrammerInstance implements IProgrammerInstance {

	private final String id;
	private final PicKit2Programmer prog;
	
	private File lastFile = null;
	private long lastmodified = 0;
	
	public PicKit2ProgrammerInstance(String id, PicKit2Programmer prog) {
		this.id = id;
		this.prog = prog;
	}
	
	String device = null;
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerInstance#getDeviceType()
	 */
	@Override
	public String getDeviceType() {
		if (device == null){
			device = prog.getExecutable().detectDevice(id);
		}
		return device;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PicKit2 ");
		if (id != null){
			sb.append("\"");
			sb.append(id);
			sb.append("\" ");
		}
		sb.append("-> ");
		sb.append(getDeviceType());
		return sb.toString();
	}
	
	private boolean connected = true;
	
	public void disconnect(){
		connected = false;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerInstance#isConnected()
	 */
	@Override
	public boolean isConnected() {
		return connected;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerInstance#getID()
	 */
	@Override
	public String getID() {
		return id;
	}

	@Override
	public void program(File hexfile, IProgressMonitor monitor) {
		lastFile = hexfile;
		lastmodified = lastFile.lastModified();
		prog.getExecutable().programDevice(getDeviceType(), id, hexfile.getAbsolutePath(), monitor);
	}

	@Override
	public void start() {
		prog.getExecutable().startDevice(getDeviceType(), id);
	}

	@Override
	public void stop() {
		prog.getExecutable().stopDevice(getDeviceType(), id);
	}

	@Override
	public File getLastProgrammedFile() {
		return lastFile;
	}
	
	@Override
	public long getLastProgrammedFileModifiedTime() {
		return lastmodified;
	}

}
