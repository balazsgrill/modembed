/**
 * 
 */
package hu.modembed.etrice.generator.e;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.etrice.generator.base.ILineOutput;
import org.eclipse.etrice.generator.launch.GeneratorLaunchConfigurationDelegate;

/**
 * @author balazs.grill
 *
 */
public class EGeneratorLaunchConfigDelegate extends
		GeneratorLaunchConfigurationDelegate {

	/* (non-Javadoc)
	 * @see org.eclipse.etrice.generator.launch.GeneratorLaunchConfigurationDelegate#addArguments(org.eclipse.debug.core.ILaunchConfiguration, java.lang.StringBuffer)
	 */
	@Override
	protected void addArguments(ILaunchConfiguration configuration,
			StringBuffer argString) throws CoreException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.etrice.generator.launch.GeneratorLaunchConfigurationDelegate#getConsoleName()
	 */
	@Override
	protected String getConsoleName() {
		return "eTrice e generator";
	}

	@Override
	protected void runGenerator(String[] args, ILineOutput out) {
		// TODO Auto-generated method stub
		
	}

}
