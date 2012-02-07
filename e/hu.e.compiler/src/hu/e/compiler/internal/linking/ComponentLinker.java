/**
 * 
 */
package hu.e.compiler.internal.linking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.LinkedInstance;
import hu.e.parser.eSyntax.Variable;

/**
 * @author balazs.grill
 *
 */
public class ComponentLinker {

	private final Map<Library, Library> libraries = new HashMap<Library, Library>();
	
	private final Map<String, LinkedInstance> instances = new HashMap<String, LinkedInstance>();
	
	public Library getLibToUse(Library iface){
		return libraries.get(iface);
	}
	
	private void putLib(Library lib, Library overrides){
		libraries.put(overrides, lib);
		for(Library o : overrides.getOverrides()){
			putLib(lib, o);
		}
	}
	
	public ComponentLinker(FunctionBinarySection section) {
		for(Library l : section.getLib()){
			putLib(l, l);
		}
		
		for(LinkedInstance li : section.getInstances()){
			instances.put(li.getName(), li);
		}
	}

	public Collection<Variable> getGlobals() {
		List<Variable> result = new ArrayList<Variable>();
		for(Library l : libraries.keySet()){
			for(LibraryItem item : l.getItems()){
				if (item instanceof Variable) {
					result.add((Variable)item);
				}
			}
		}
		return result;
	}
	
}
