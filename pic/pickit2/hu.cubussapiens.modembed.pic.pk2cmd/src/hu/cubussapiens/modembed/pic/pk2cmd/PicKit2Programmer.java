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

	private final PK2CMDExecutable executable;
	
	private final List<PicKit2ProgrammerInstance> instances = new ArrayList<PicKit2ProgrammerInstance>();
	
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

	private PicKit2ProgrammerInstance findInstance(String id, List<PicKit2ProgrammerInstance> instances){
		if (id == null && instances.size()==1)
		{
			PicKit2ProgrammerInstance in = instances.get(0);
			if (in.getID() == null) return in;
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.IProgrammerType#detectInstances()
	 */
	@Override
	public IProgrammerInstance[] detectInstances() {
		String[] ids = executable.detectPicKits();
		List<PicKit2ProgrammerInstance> disconnect = new ArrayList<PicKit2ProgrammerInstance>(instances);
		instances.clear();
		if (ids != null){
			for(String nid : ids){
				PicKit2ProgrammerInstance pk2 = null;
				if ("-".equals(nid)){
					pk2 = findInstance(null, disconnect);
				}else{
					pk2 = findInstance(nid, disconnect);
				}
				if (pk2 == null){
					// new instance connected
					String id = null;
					if (!"-".equals(nid)) id = nid;
					instances.add(new PicKit2ProgrammerInstance(id, this));
				}else{
					// instance still connected
					instances.add(pk2);
				}
			}
		}
		for(PicKit2ProgrammerInstance i : disconnect){
			i.disconnect();
		}
		return instances.toArray(new IProgrammerInstance[instances.size()]);
	}

	@Override
	public IProgrammerInstance findInstance(String id) {
		detectInstances();
		for(PicKit2ProgrammerInstance pi : instances){
			if (id == null) return pi;
			if (id.equals(pi.getID())) return pi;
		}
		return null;
	}

	@Override
	public IProgrammerPropertiesPane createPropertiesPane() {
		// TODO Auto-generated method stub
		return null;
	}

}
