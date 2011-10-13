/**
 * 
 */
package hu.e.parser.ui;

import hu.cubussapiens.modembed.MODembedCore;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ui.containers.AbstractAllContainersState;

/**
 * @author balazs.grill
 *
 */
public class PluginsAllContainerState extends AbstractAllContainersState {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.containers.AbstractAllContainersState#doInitHandle(org.eclipse.emf.common.util.URI)
	 */
	@Override
	protected String doInitHandle(URI uri) {
		if (!uri.isPlatform())
			return null;
		final IFile file = getWorkspaceRoot().getFile(new Path(uri.toPlatformString(true)));
		if (file == null) {
			return null;
		}
		final IProject project = file.getProject();
		return project.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.containers.AbstractAllContainersState#doInitContainedURIs(java.lang.String)
	 */
	@Override
	protected Collection<URI> doInitContainedURIs(String containerHandle) {
		return MODembedCore.getVisibleResources(containerHandle);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.containers.AbstractAllContainersState#doInitVisibleHandles(java.lang.String)
	 */
	@Override
	protected List<String> doInitVisibleHandles(String handle) {
		return MODembedCore.collectAllDependencies(handle);
	}

}
