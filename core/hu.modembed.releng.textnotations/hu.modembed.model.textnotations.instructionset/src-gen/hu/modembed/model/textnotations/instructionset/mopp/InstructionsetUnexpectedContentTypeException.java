/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.RESOURCE_C
 * ONTENT_TYPE
 */
public class InstructionsetUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  InstructionsetUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
