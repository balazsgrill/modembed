/**
 * 
 */
package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.types.PointerTypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.utils.compiler.module.TypeUtils;

/**
 * @author balazs.grill
 *
 */
public class DeviceSpecificTypeAdvisor {

	private final long pointerSize; 
	
	private static long getPointerSize(DeviceAbstraction device){
		if (device.getSizeOfPointer() == 0){
			if (device.getAncestor() != null){
				try{
					return getPointerSize(device.getAncestor());
				}catch(Exception e){
					/* Swallow exception, exception on top-level device will not be caught */
				}
			}
		}else{
			return device.getSizeOfPointer();
		}
		throw new IllegalArgumentException("Could not resolve size of pointer in "+device.getName());
	}
	
	/**
	 * 
	 */
	public DeviceSpecificTypeAdvisor(DeviceAbstraction device) {
		this.pointerSize = getPointerSize(device);
	}

	public TypeDefinition transform(TypeDefinition td){
		if (td instanceof PointerTypeDefinition){
			return TypeUtils.createUnsignedTypeDef((int)pointerSize*8);
		}
		return td;
	}
	
}
