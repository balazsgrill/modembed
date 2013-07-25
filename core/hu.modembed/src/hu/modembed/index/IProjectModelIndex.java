/**
 * 
 */
package hu.modembed.index;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

/**
 * @author balazs.grill
 *
 */
public interface IProjectModelIndex extends IModelIndex, IResourceDeltaVisitor{
	
	public IProject getProject();
	
	public void initialize() throws CoreException;
	
	public boolean isDisposed();
}
