/**
 * 
 */
package hu.modembed.hexfile.persistence;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class InvalidDataDiagnostic implements Diagnostic {

	private final int line;
	
	private final int column;
	
	public InvalidDataDiagnostic(int line, int column) {
		this.line = line;
		this.column = column;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getMessage()
	 */
	@Override
	public String getMessage() {
		return "Invalid data";
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
		return column;
	}

}
