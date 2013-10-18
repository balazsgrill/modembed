/**
 * 
 */
package hu.modembed.utils;

import hu.modembed.MODembedCore;
import hu.modembed.ant.TaskUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;

/**
 * @author balazs.grill
 *
 */
public class XMIModelCache {
	
	private final BundleContext context;
	
	private final File dataFile;
	private final Properties data;
	
	/**
	 * 
	 */
	public XMIModelCache(BundleContext bundleContext) {
		this.context = bundleContext;
		dataFile = bundleContext.getDataFile("cache.resources.xml");
		data = new Properties();
		if (dataFile.exists()){
			try{
				FileInputStream is = new FileInputStream(dataFile);
				data.loadFromXML(is);
				is.close();
			}catch(IOException e){
				MODembedCore.getDefault().getLog().log(new Status(IStatus.ERROR, bundleContext.getBundle().getSymbolicName(), "Could not load cache descriptor",e));
			}
			
		}
	}

	private static String toKey(URI uri){
		return uri.toString();
	}
	
	private static URI toURI(File cacheFile){
		return URI.createURI(cacheFile.toURI().toString());
	}
	
	/**
	 * Loads content of given resource from cache. Return true in case of succeed.
	 * Returns false if cache is not available or is older than the given resource.
	 * @param resource
	 * @return
	 */
	public boolean load(Resource resource){
		URI uri = resource.getURI();
		long modificationTime = TaskUtils.getModificationTime(uri);
		String key = toKey(uri);
		if (data.get(key) != null){
			File cacheFile = context.getDataFile(data.getProperty(key));
			URI cacheURI = toURI(cacheFile);
			if (cacheFile.exists() && cacheFile.isFile()){
				long cacheTime = cacheFile.lastModified();
				if (modificationTime > cacheTime) return false;
				ResourceSet rs = new ResourceSetImpl();
				try{
					Resource cache = rs.getResource(cacheURI, true);
					if (cache != null && !cache.getContents().isEmpty()){
						resource.getContents().add(cache.getContents().get(0));
						return true;
					}
				}catch(Exception e){
					MODembedCore.getDefault().getLog().log(new Status(IStatus.ERROR, context.getBundle().getSymbolicName(), "Could not load cached resource",e));
				}
			}
		}
		return false;
	}
	
	public void save(Resource resource){
		URI uri = resource.getURI();
		String key = toKey(uri);
		String cacheFileName = null;
		if (data.contains(key)){
			cacheFileName = data.getProperty(key);
		}else{
			long i = 0;
			do{
				String fn = "cache"+i+".xmi";
				if (data.containsValue(fn)){
					i++;
				}else{
					cacheFileName = fn;
				}
			}while(cacheFileName == null);
			data.put(key, cacheFileName);
			try{
				FileOutputStream os = new FileOutputStream(dataFile);
				data.storeToXML(os, "Cached resources");
				os.close();
			}catch(Exception e){
				MODembedCore.getDefault().getLog().log(new Status(IStatus.ERROR, context.getBundle().getSymbolicName(), "Could not store cache descriptor",e));
			}
		}
		
		File cacheFile = context.getDataFile(cacheFileName);
		ResourceSet rs = new ResourceSetImpl();
		URI cacheURI = toURI(cacheFile);

		Resource r = rs.createResource(cacheURI);
		r.getContents().add(EcoreUtil.copy(resource.getContents().get(0)));
		try{
			r.save(null);
		}catch(Exception e){
			MODembedCore.getDefault().getLog().log(new Status(IStatus.ERROR, context.getBundle().getSymbolicName(), "Could not load store resource cache",e));
		}
	}
	
}
