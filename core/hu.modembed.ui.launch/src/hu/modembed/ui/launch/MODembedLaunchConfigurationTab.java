/**
 * 
 */
package hu.modembed.ui.launch;

import hu.modembed.IProgrammerInstance;
import hu.modembed.IProgrammerType;
import hu.modembed.MODembedCore;
import hu.modembed.RegisteredProgrammer;
import hu.modembed.ui.launch.control.LaunchConfigControl;
import hu.modembed.ui.launch.control.ProgrammerConfiguration;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class MODembedLaunchConfigurationTab extends
		AbstractLaunchConfigurationTab implements ILaunchAttribs{
	
	private LaunchConfigControl control;

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		this.control = new LaunchConfigControl(parent, SWT.NONE);
		setControl(control);
		control.addListener(new Runnable() {
			@Override
			public void run() {
				scheduleUpdateJob();
			}
		});
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//Default is empty
	}

	public static List<ProgrammerConfiguration> readConfiguration(ILaunchConfiguration configuration){
		List<ProgrammerConfiguration> configs = new ArrayList<ProgrammerConfiguration>();
		try {
			List<?> list = configuration.getAttribute(DATA, Collections.emptyList());
			for(Object o : list){
				StringReader sr = new StringReader(o.toString());
				Properties prop = new Properties();
				try {
					prop.load(sr);
					String pid = prop.getProperty(PROGRAMMER_TYPE);
					RegisteredProgrammer rp = MODembedCore.getDefault().getProgrammerRegistry().getProgrammer(pid);
					if (rp != null){
						IProgrammerType pt = rp.getHandler();
						IProgrammerInstance pi = pt.createInstance(prop);
						configs.add(new ProgrammerConfiguration(pi, prop));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return configs;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		control.setConfigurations(readConfiguration(configuration));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		List<String> data = new ArrayList<String>();
		for(ProgrammerConfiguration pc : control.getConfigurations()){
			Properties p = new Properties();
			p.putAll(pc.getProperties());
			p.put(PROGRAMMER_TYPE, pc.getInstance().getType().getID());
			StringWriter sw = new StringWriter();
			try {
				p.store(sw, "");
				data.add(sw.getBuffer().toString());
				sw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		configuration.setAttribute(DATA, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	@Override
	public String getName() {
		return "Embedded";
	}
	
	@Override
	public Image getImage() {
		return LaunchPlugin.getDefault().getImageRegistry().get(LaunchPlugin.IMAGECPU);
	}

}
