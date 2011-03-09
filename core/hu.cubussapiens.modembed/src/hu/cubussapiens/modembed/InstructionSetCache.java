/**
 * 
 */
package hu.cubussapiens.modembed;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import embedded.assembly.InstructionSet;

/**
 * @author balazs.grill
 *
 */
public class InstructionSetCache {

	private final ResourceSet rs;
	
	private final Map<URL, InstructionSet> cache = new HashMap<URL, InstructionSet>();
	
	InstructionSetCache() {
		this.rs = new ResourceSetImpl();
	}
	
	public InstructionSet getCachedInstructionSet(List<String> id){
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for(String s : id){
			if (!first){
				sb.append(".");
			}else{
				first = false;
			}
			sb.append(s);
		}
		return getCachedInstructionSet(sb.toString());
	}
	
	public InstructionSet getCachedInstructionSet(String id){
		URL url = MODembedCore.getDefault().getInstructionSetModel(id);
		InstructionSet is = cache.get(url);
		if (is == null){
			URI uri = URI.createURI(url.toString());
			Resource r = rs.getResource(uri, true);
			for(EObject eo : r.getContents()){
				if (eo instanceof InstructionSet){
					is = (InstructionSet)eo;
					cache.put(url, is);
				}
			}
		}
		return is;
	}
	
}
