/**
 * 
 */
package hu.modembed.application.codegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import application.ApplicationInterface;
import application.CompositeModuleImplementation;
import application.DelegatedImplementation;
import application.InterfaceImplementationMapping;
import application.InterfaceOfModule;
import application.MappedImplementation;

/**
 * @author balazs.grill
 *
 */
public class InterfaceMappingsManager {

	public static List<ApplicationInterface> toList(InterfaceOfModule iref){
		List<ApplicationInterface> ifs = iref.getInterface();
		List<ApplicationInterface> interfaces = new ArrayList<ApplicationInterface>(ifs.size()+1);
		interfaces.add(iref.getModule().getImplementation());
		interfaces.addAll(ifs);
		return interfaces;
	}
	
	/**
	 * Outer to inner
	 */
	private Map<InterfaceInstance, InterfaceInstance> delegations = new LinkedHashMap<InterfaceInstance, InterfaceInstance>();

	/**
	 * Expected to implemented
	 */
	private Map<InterfaceInstance, List<InterfaceInstance>> mappings = new LinkedHashMap<>();
	
	/**
	 * 
	 */
	public InterfaceMappingsManager() {
	}
	
	public void addMapping(InterfaceImplementationMapping mapping){
		if (mapping instanceof DelegatedImplementation){
			CompositeModuleImplementation module = (CompositeModuleImplementation) mapping.eContainer();
			
			InterfaceInstance outer = new InterfaceInstance(
					Arrays.asList(module,
					((DelegatedImplementation) mapping).getOuterInterface())
					);
			InterfaceInstance inner = new InterfaceInstance(((DelegatedImplementation) mapping).getInnerInterface());
			if (outer.isImplemented() != inner.isImplemented()){
				System.err.println("Incompatible delegation: "+inner+" = "+outer);
			}
			delegations.put(outer, inner);
		}
		if (mapping instanceof MappedImplementation){
			InterfaceInstance left = new InterfaceInstance(((MappedImplementation) mapping).getExpectedInterface());
			InterfaceInstance right = new InterfaceInstance(((MappedImplementation) mapping).getImplementedInterface());
			
			InterfaceInstance implemented = null;
			InterfaceInstance expected = null;
			
			if (left.isImplemented()){
				implemented = left;
			}else{
				expected = left;
			}
			if (right.isImplemented()){
				implemented = right;
			}else{
				expected = right;
			}
			
			if (implemented != null && expected != null && expected.type().equals(implemented.type())){
				addMapping(expected, implemented);
			}else{
				System.err.println("Incompatible mapping: "+left+" -> "+right);
			}
			
		}
	}
	
	private void addMapping(InterfaceInstance expected, InterfaceInstance implemented){
		if (expected.isAtomic()){
			addAtomicMapping(expected, implemented);
		}else{
			List<InterfaceInstance> ec = expected.children();
			List<InterfaceInstance> ic = implemented.children();
			for(int i=0;i<ec.size();i++){
				addMapping(ec.get(i), ic.get(i));
			}
		}
	}
	
	private void addAtomicMapping(InterfaceInstance expected, InterfaceInstance implemented){
		List<InterfaceInstance> list = mappings.get(expected);
		if (list == null){
			list = new LinkedList<InterfaceInstance>();
			mappings.put(expected, list);
		}
		list.add(implemented);
	}
	
	public Map<InterfaceInstance, List<InterfaceInstance>> getMappings() {
		return mappings;
	}
	
	public List<InterfaceInstance> getDelegation(InterfaceInstance delegated){
		List<InterfaceInstance> result = new LinkedList<>();
		
		for(Entry<InterfaceInstance, InterfaceInstance> entry : delegations.entrySet()){
			if (entry.getKey().matches(delegated.interfaces)){
				result.add(entry.getValue());
			}
		}
		
		return result;
	}

}
