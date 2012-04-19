package hu.modembed.etrice.generator.e;

import org.eclipse.core.resources.IResource;
import org.eclipse.etrice.generator.launch.GeneratorMainTab;

public class EGeneratorMainTab extends GeneratorMainTab {

	/* (non-Javadoc)
	 * @see org.eclipse.etrice.generator.launch.GeneratorMainTab#isValidModelFile(org.eclipse.core.resources.IResource)
	 */
	@Override
	protected boolean isValidModelFile(IResource resource) {
		return resource.getName().endsWith(".room");
	}

}
