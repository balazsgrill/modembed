/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see hu.modembed.model.textnotations.type.ITypeOptions.RESOURCE_CONTENT_TYPE
 */
public class TypeUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  TypeUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
