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
		for(int i=0;i<segments.size()-1;i++){
			if (i > 0) sb.append(".");
			sb.append(segments.get(i));
		}
		if (segments.size() > 1) sb.append("::");
		sb.append(segments.get(segments.size()-1));
		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.naming.IQualifiedNameConverter#toQualifiedName(java.lang.String)
	 */
	@Override
	public QualifiedName toQualifiedName(String qualifiedNameAsText) {
		String[] d = qualifiedNameAsText.split("::");
		String[] result = new String[0];
		for(String s : d){
			String[] h = s.split("\\.");
			String[] newres = new String[result.length+h.length];
			System.arraycopy(result, 0, newres, 0, result.length);
			System.arraycopy(h, 0, newres, result.length, h.length);
			result = newres;
		}
		return QualifiedName.create(result);
	}

}
