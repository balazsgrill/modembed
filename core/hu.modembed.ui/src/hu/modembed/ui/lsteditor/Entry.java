/**
 * 
 */
package hu.modembed.ui.lsteditor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class Entry {

	public final List<Entry> subentries = new ArrayList<Entry>();
	
	private final String text;
	
	public Entry(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
}
