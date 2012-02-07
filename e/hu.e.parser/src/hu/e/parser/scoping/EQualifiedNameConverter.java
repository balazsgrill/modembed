/**
 * 
 */
package hu.e.parser.scoping;

import java.util.List;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * @author balazs.grill
 *
 */
public class EQualifiedNameConverter implements IQualifiedNameConverter {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.naming.IQualifiedNameConverter#toString(org.eclipse.xtext.naming.QualifiedName)
	 */
	@Override
	public String toString(QualifiedName name) {
		List<String> segments = name.getSegments();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<segments.size();i++){
			if (i > 0) sb.append(".");
			sb.append(segments.get(i));
		}
		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.naming.IQualifiedNameConverter#toQualifiedName(java.lang.String)
	 */
	@Override
	public QualifiedName toQualifiedName(String qualifiedNameAsText) {
		return QualifiedName.create(qualifiedNameAsText.split("\\."));
	}

}
