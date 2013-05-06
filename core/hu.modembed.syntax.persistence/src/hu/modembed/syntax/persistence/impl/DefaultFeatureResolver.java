/**
 * 
 */
package hu.modembed.syntax.persistence.impl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
import hu.modembed.model.modembed.infrastructure.NamedElement;
import hu.modembed.syntax.persistence.IFeatureResolver;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public class DefaultFeatureResolver implements IFeatureResolver{

	private final EClass RootElementClass;
	
	public DefaultFeatureResolver() {
		this.RootElementClass = InfrastructurePackage.eINSTANCE.getRootElement();
	}
	
	private boolean isGlobal(EClass eclass){
		return RootElementClass.isSuperTypeOf(eclass);
	}
	
	private EObject findObjectByName(EObject context, String name){
		Queue<NamedElement> queue = new LinkedList<>();
		Set<Object> visited = new HashSet<>();
		if (context instanceof NamedElement){
			queue.add((NamedElement)context);
		}
		
		while(!queue.isEmpty()){
			
			NamedElement ne = queue.poll();
			if (name.equals(ne.getName())){
				return ne;
			}
			
			visited.add(ne);
			
			for(EObject eo : ne.eContents()){
				if ((!visited.contains(eo)) && eo instanceof NamedElement){
					queue.add((NamedElement)eo);
				}
			}
			EObject container = ne.eContainer();
			if (container instanceof NamedElement){
				queue.add((NamedElement)container);
			}
			
			
		}
		
		return null;
	}
	
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			String terminalName, String value) {
		if (feature instanceof EReference){
			EClass eclass = ((EReference) feature).getEReferenceType();
			if (isGlobal(eclass)){
				return MODembedCore.getDefault().getModelIndex().findRootElement(context.eResource(), value);
			}else{
				return findObjectByName(context, value);
			}
		}
		if (feature instanceof EAttribute){
			Class<?> type = feature.getEType().getInstanceClass();
			if (String.class.equals(type)) return value;
			if (int.class.equals(type) || Integer.class.equals(type)) return Integer.valueOf((int)parseNumber(value));
			if (long.class.equals(type) || Long.class.equals(type)) return Long.valueOf(parseNumber(value));
			if (boolean.class.equals(type) || Boolean.class.equals(type)) return Boolean.TRUE;
		}
		return null;
	}

	private static long parseNumber(String value){
		value = value.toLowerCase();
		if (value.startsWith("0x")){
			//Hexadecimal
			return Long.parseLong(value.substring(2), 16);
		}
		if (value.startsWith("0b")){
			//Binary
			return Long.parseLong(value.substring(2), 2);
		}
		return Long.parseLong(value);
	}
	
}
