/**
 * 
 */
package hu.modembed.includedcode;

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * @author balazs.grill
 *
 */
public class CategoryElement {

	private final String id;
	private final String name;
	private final String parent;
	
	/**
	 * 
	 */
	public CategoryElement(IConfigurationElement ce) {
		this.id = ce.getAttribute("id");
		this.name = ce.getAttribute("name");
		this.parent = ce.getAttribute("parent");
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getParent() {
		return parent;
	}
	
	@Override
	public String toString() {
		return name+" (CATEGORY)";
	}
	
}
