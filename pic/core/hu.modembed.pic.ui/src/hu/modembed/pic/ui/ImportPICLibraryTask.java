/**
 * 
 */
package hu.modembed.pic.ui;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;

/**
 * @author balazs.grill
 *
 */
public class ImportPICLibraryTask implements IRunnableWithProgress {

	private final URL url;
	private final IContainer container;
	
	public ImportPICLibraryTask(String pic, IContainer container){
		this(PicUIPlugin.getAvailablePICs().get(pic), container);
	}
	
	public ImportPICLibraryTask(URL url, IContainer container) {
		this.url = url;
		this.container = container;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		String filename = PicUIPlugin.getNameOfURL(url)+".e";
		final IFile file = container.getFile(new Path(filename));
		
		try {
			file.create(url.openStream(), true, monitor);
		} catch (Exception e) {
			throw new InvocationTargetException(e);
		}

	}

}
