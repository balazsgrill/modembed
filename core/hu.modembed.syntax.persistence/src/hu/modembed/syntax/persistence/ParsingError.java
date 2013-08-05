/**
 * 
 */
package hu.modembed.syntax.persistence;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class ParsingError implements Diagnostic {

	private final String message;
	private final String location;
	private final int line;
	private final int column;
	
	public ParsingError(String message, String location, int line, int column) {
		this.message = message;
		this.location = location;
		this.line = line;
		this.column = column;
	}
	
	public ParsingError(String message, String location) {
		this(message, location, 0, 0);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getMessage()
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLocation()
	 */
	@Override
	public String getLocation() {
		return location;
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

	@Override
	public String toString() {
		return message+" at "+location+" "+line+":"+column;
	}
	
}
