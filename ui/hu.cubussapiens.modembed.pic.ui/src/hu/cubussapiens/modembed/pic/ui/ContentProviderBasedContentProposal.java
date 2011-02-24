/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;

/**
 * @author balazs.grill
 *
 */
public class ContentProviderBasedContentProposal extends SimpleContentProposalProvider {

	private IStructuredContentProvider contentProvider;
	
	private ILabelProvider labelProvider;
	
	private Object input;
	
	private final Map<String, Object> nametoobject = new HashMap<String, Object>();
	
	/**
	 * @param proposals
	 */
	public ContentProviderBasedContentProposal() {
		super(new String[0]);
		setFiltering(true);
	}

	public void refresh(){
		Object[] elements = contentProvider.getElements(input);
		List<String> names = new ArrayList<String>(elements.length);
		for(int i=0;i<elements.length;i++){
			String name = labelProvider.getText(elements[i]);
			names.add(name);
			nametoobject.put(name.toLowerCase(), elements[i]);
		}
		Collections.sort(names);
		setProposals(names.toArray(new String[names.size()]));
	}
	
	public void setContentProvider(IStructuredContentProvider contentProvider) {
		this.contentProvider = contentProvider;
	}
	
	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}
	
	public void setInput(Object input) {
		this.input = input;
		refresh();
	}
	
	public Object getElement(String value){
		return nametoobject.get(value.toLowerCase());
	}
	
}
