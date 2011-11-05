/**
 * 
 */
package hu.cubussapiens.modembed.pic.pk2cmd;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.pic.pk2cmd.props.IPK2Propertes;
import hu.cubussapiens.modembed.pic.pk2cmd.props.PK2ConfigurationPane;
import hu.cubussapiens.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane;
import hu.cubussapiens.modembed.ui.launch.core.IUIProgrammerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class PicKit2Programmer implements IUIProgrammerType, IPK2Propertes {

	public static final String PROG_ID = "hu.cubussapiens.modembed.pic.pk2cmd.programmer";
	
	private final PK2CMDExecutable executable;
	
	public PK2CMDExecutable getExecutable() {
		return executable;
	}
	
	/**
	 * @throws CoreException 
	 * 
	 */
	public PicKit2Programmer() throws CoreException {
		this.executable = PK2Plugin.getDefault().createExecutable();
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerType#detectInstances()
	 */
	@Override
	public IProgrammerInstance[] detectInstances() {
		String[] ids = executable.detectPicKits();
		List<PicKit2ProgrammerInstance> instances = new ArrayList<PicKit2ProgrammerInstance>();

		if (ids != null){
			for(String nid : ids){
				String id = null;
				if (!"-".equals(nid)) id = nid;
				instances.add(new PicKit2ProgrammerInstance(id, this));
			}
		}
		return instances.toArray(new IProgrammerInstance[instances.size()]);
	}

	@Override
	public IProgrammerInstance createInstance(Properties props) {
		String id = props != null ? props.getProperty(PK2ID) : null;
		return new PicKit2ProgrammerInstance(id, this);
	}

	@Override
	public String getID() {
		return PROG_ID;
	}

	@Override
	public IProgrammerInstanceConfigurationPane createConfigurationPane(
			Composite parent) {
		return new PK2ConfigurationPane(parent, SWT.NONE);
	}

}
