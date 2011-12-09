/**
 * 
 */
package hu.modembed.model.graph;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.graphiti.mm.MmFactory;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.pictograms.Diagram;

/**
 * @author balazs.grill
 *
 */
public class DiagramProperties implements Map<String, String>{

	public static String ModelLink = "hu.modembed.model.graph.domain.uri"; 
	
	private final Diagram diagram;
	
	public DiagramProperties(Diagram diagram) {
		this.diagram = diagram;
	}

	@Override
	public void clear() {
		diagram.getProperties().clear();
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(Object arg0) {
		for(Property p : diagram.getProperties()){
			if (p.getKey().equals(arg0)){
				return p.getValue();
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return diagram.getProperties().isEmpty();
	}

	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String put(String arg0, String arg1) {
		for(Property p : diagram.getProperties()){
			if (p.getKey().equals(arg0)){
				String v = p.getValue();
				p.setValue(arg1);
				return v;
			}
		}
		Property p = MmFactory.eINSTANCE.createProperty();
		p.setKey(arg0);
		p.setValue(arg1);
		diagram.getProperties().add(p);
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends String> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return diagram.getProperties().size();
	}

	@Override
	public Collection<String> values() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
