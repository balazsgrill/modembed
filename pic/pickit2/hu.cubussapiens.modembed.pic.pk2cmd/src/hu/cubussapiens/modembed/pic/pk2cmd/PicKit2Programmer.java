/**
 * 
 */
package hu.cubussapiens.modembed.pic.pk2cmd;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.IProgrammerPropertiesPane;
import hu.cubussapiens.modembed.IProgrammerType;

/**
 * @author balazs.grill
 *
 */
public class PicKit2Programmer implements IProgrammerType {

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
	public IProgrammerInstance createInstance() {
		return new PicKit2ProgrammerInstance(null, this);
	}

	@Override
	public IProgrammerPropertiesPane createPropertiesPane() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getID() {
		return PROG_ID;
	}

}
