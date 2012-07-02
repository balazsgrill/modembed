/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.compiler.list.Severity;
import hu.e.compiler.list.StatusStep;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class ProgramListLogger {

	private final Set<?> values = EnumSet.of(Severity.ERROR, Severity.WARNING);
	
	private final List<StatusStep> statuses = new ArrayList<StatusStep>();
	
	public void add(StatusStep status){
		if (values.contains(status.getSeverity()))
			statuses.add(status);
	}
	
	public void print(){
		StringBuilder sb = new StringBuilder();
		for(StatusStep step : statuses){
			switch(step.getSeverity()){
			case ERROR: 	
				sb.append("[ERROR] ");
				break;
			case WARNING: 	
				sb.append("[WARNING] ");
				break;
			case INFO: 		
				sb.append("[INFO] ");
				break;
			case DEBUG: 	
				sb.append("[DEBUG] ");
				break;
			}
			sb.append(step.getMessage());
			sb.append("\n");
		}
		sb.append("Overall ");
		sb.append(statuses.size());
		sb.append(" messages.\n");
		System.out.println(sb.toString());
	}
	
}
