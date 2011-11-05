/**
 * 
 */
package hu.modembed.hexfile.persistence;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class InvalidFieldTypeDiagnostic implements Diagnostic {

	private final int line;
	
	private final int fieldType;
	
	public InvalidFieldTypeDiagnostic(int line, int fieldType) {
		this.line = line;
		this.fieldType = fieldType;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getMessage()
	 */
	@Override
	public String getMessage() {
		return "Invalid field type: 0x"+HexFileResource.byteToHex(fieldType);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLocation()
	 */
	@Override
	public String getLocation() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLine()
	 */
	@Override
	public int getLine() {
		return line;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getColumn()
	 */
	@Override
	public int getColumn() {
		return 8;
	}

}
