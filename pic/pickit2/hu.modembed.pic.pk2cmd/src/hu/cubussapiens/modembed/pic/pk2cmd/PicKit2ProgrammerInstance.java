/**
 * 
 */
package hu.cubussapiens.modembed.pic.pk2cmd;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.IProgrammerType;
import hu.cubussapiens.modembed.pic.pk2cmd.props.IPK2Propertes;

import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;

/**
 * @author balazs.grill
 *
 */
public class PicKit2ProgrammerInstance implements IProgrammerInstance, IPK2Propertes {

	private final String id;
	private final PicKit2Programmer prog;
	
	public PicKit2ProgrammerInstance(String id, PicKit2Programmer prog) {
		this.id = id;
		this.prog = prog;
	}
	
	String device = null;
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerInstance#getDeviceType()
	 */
	private String getDeviceType() {
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
		sb.append("[");
		String devtype = getDeviceType();
		sb.append(devtype==null ? "disconnected" : devtype);
		sb.append("]");
		return sb.toString();
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerInstance#isConnected()
	 */
	@Override
	public boolean isConnected() {
		return getDeviceType() != null;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerInstance#getID()
	 */
	public String getID() {
		return id;
	}

	private void program(String hexfile, IProgressMonitor monitor) {
		prog.getExecutable().programDevice(getDeviceType(), id, hexfile, monitor);
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
	public void initialize(Properties props, IProgressMonitor monitor) throws CoreException {
		String hexfile = props.getProperty(HEXFILEPATH);
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(hexfile));
			program(file.getLocation().toString(), monitor);
		} catch (Exception e) {
			throw new CoreException(
					new Status(IStatus.ERROR, PK2Plugin.PLUGIN_ID, "Could not find hexfile: "+hexfile,e));
		}
	}

	@Override
	public void fillDefaults(Properties props) {
		if (id != null)	props.put(PK2ID, id);
	}
	
	@Override
	public IProgrammerType getType() {
		return prog;
	}

}
