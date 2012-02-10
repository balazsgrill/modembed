/**
 * 
 */
package hu.e.compiler.internal.linking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

	/*
	 * Shortcut for: Base library -> highest level library that overrides base library
	 */
	private final Map<Library, Library> libraries = new HashMap<Library, Library>();
	
	private final Map<String, LinkedInstance> instances = new HashMap<String, LinkedInstance>();
	
	/**
	 * Returns the full path from the highest level library to the given interface library
	 * @param iface
	 * @return
	 */
	public Library[] getLibraryPath(Library iface){
		Library root = getLibToUse(iface);
		if (root == null) return new Library[]{iface};
		List<Library> libs = getPath(root, iface);
		if (libs != null){
			return libs.toArray(new Library[libs.size()]);
		}else{
			return new Library[]{iface};
		}
	}
	
	private List<Library> getPath(Library from, Library to){
		if (from.equals(to)) return Collections.singletonList(to);
		List<Library> ls = new ArrayList<Library>();
		ls.add(from);
		for(Library l : from.getOverrides()){
			List<Library> ls2 = getPath(l, to);
			if (ls2 != null){
				ls.addAll(ls2);
				return ls;
			}
		}
		return null;
	}
	
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
