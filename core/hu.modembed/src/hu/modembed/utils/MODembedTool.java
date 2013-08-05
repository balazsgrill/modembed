/**
 * 
 */
package hu.modembed.utils;

import hu.modembed.MODembedCore;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.index.IGlobalModelIndex;
import hu.modembed.model.modembed.core.instructionset.InstructionSet;
import hu.modembed.utils.disassembler.Disassembler;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class MODembedTool {

	public Object createDisassembler(InstructionSet instructionSet){
		return new Disassembler(instructionSet);
	}

	public Object findGlobal(Object context, String qualifiedID){
		if (context instanceof EObject){
			Resource resource = ((EObject) context).eResource();
			IGlobalModelIndex index = MODembedCore.getDefault().getModelIndex();
			return index.find(resource, qualifiedID);
		}
		return null;
	}
	
	public byte[] numberListToByteArray(List<?> list){
		byte[] data = new byte[list.size()];
		for(int i = 0;i<data.length;i++){
			Object o = list.get(i);
			if (o instanceof Number){
				int v = ((Number) o).intValue();
				data[i] = HexFileResource.intToByte(v);
			}
		}
		return data;
	}

}
