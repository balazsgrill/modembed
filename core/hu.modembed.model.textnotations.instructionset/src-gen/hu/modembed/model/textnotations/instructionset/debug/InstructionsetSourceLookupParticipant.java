/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.debug;

public class InstructionsetSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof hu.modembed.model.textnotations.instructionset.debug.InstructionsetStackFrame) {
			hu.modembed.model.textnotations.instructionset.debug.InstructionsetStackFrame frame = (hu.modembed.model.textnotations.instructionset.debug.InstructionsetStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
