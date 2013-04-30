/**
 * 
 */
package hu.modembed.syntax.persistence.impl;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
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
	
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			String terminalName, String value) {
		if (feature instanceof EReference){
			EClass eclass = ((EReference) feature).getEReferenceType();
			if (isGlobal(eclass)){
				return MODembedCore.getDefault().getModelIndex().findRootElement(context.eResource(), value);
			}else{
				// TODO heuristic visit of contained model
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
