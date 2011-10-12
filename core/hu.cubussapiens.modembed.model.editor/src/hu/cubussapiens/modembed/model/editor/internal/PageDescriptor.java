/**
 * 
 */
package hu.cubussapiens.modembed.model.editor.internal;

import hu.cubussapiens.modembed.model.editor.IModelEditorPage;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * @author balazs.grill
 *
 */
public class PageDescriptor {

	private final Class<?> pageclass;
	private final Class<?> modelclass;
	
	private Class<?> loadClass(Bundle b, String qn){
		try {
			return b.loadClass(qn);
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
	
	public Class<?> getModelclass() {
		return modelclass;
	}
	
	public IModelEditorPage createPage(){
		if (pageclass != null){
			try {
				Object o = pageclass.newInstance();
				if (o instanceof IModelEditorPage){
					return (IModelEditorPage)o;
				}
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}
		return null;
	}
	
	public PageDescriptor(IConfigurationElement ce) {
		Bundle b = Platform.getBundle(ce.getContributor().getName());
		
		pageclass = loadClass(b, ce.getAttribute("pageclass"));
		modelclass = loadClass(b, ce.getAttribute("modelclass"));
	}
	
}
