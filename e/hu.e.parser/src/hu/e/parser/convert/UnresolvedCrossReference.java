/**
 * 
 */
package hu.e.parser.convert;

import hu.modembed.model.modembed.infrastructure.traceability.TextOrigin;


/**
 * @author balazs.grill
 *
 */
public class UnresolvedCrossReference {

	public final String id;
	public final int line;
	public final int charStart;
	public final int charEnd;
	
	public UnresolvedCrossReference(String id, int line) {
		this.id = id;
		this.line = line;
		this.charStart = 0;
		this.charEnd = 1;
	}

	public UnresolvedCrossReference(String id, TextOrigin origin) {
		this.id = id;
		this.line = origin.getLine();
//		this.charStart = origin.getCharStart();
//		this.charEnd = origin.getCharEnd();
		this.charStart = 0;
		this.charEnd = 1;
	}
	
}
