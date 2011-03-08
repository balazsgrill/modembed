/**
 * 
 */
package hu.cubussapiens.modembed.ui.project;

import project.MainModule;

/**
 * @author balazs.grill
 *
 */
public class MainModuleTemplate {

	public static StringBuilder createFile(MainModule module){
		StringBuilder sb = new StringBuilder();
		
		String qid = module.getQualifiedID();
		int i = qid.lastIndexOf('.');
		if (i != -1){
			qid = qid.substring(i+1);
		}
		sb.append("module ");
		sb.append(qid);
		sb.append(" target ");
		sb.append(module.getTarget());
		sb.append("{\n\n");
		sb.append("\t/*\n");
		sb.append("\t * Main function\n");
		sb.append("\t */\n");
		sb.append("\tfunc main{\n");
		sb.append("\t};\n");
		sb.append("}\n");
		
		return sb;
	}
	
}
