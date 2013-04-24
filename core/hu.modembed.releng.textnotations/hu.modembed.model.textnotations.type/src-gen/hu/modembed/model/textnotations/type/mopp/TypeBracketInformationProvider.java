/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class TypeBracketInformationProvider {
	
	public java.util.Collection<hu.modembed.model.textnotations.type.ITypeBracketPair> getBracketPairs() {
		java.util.Collection<hu.modembed.model.textnotations.type.ITypeBracketPair> result = new java.util.ArrayList<hu.modembed.model.textnotations.type.ITypeBracketPair>();
		result.add(new hu.modembed.model.textnotations.type.mopp.TypeBracketPair("(", ")", true, false));
		return result;
	}
	
}
