/**
 * 
 */
package hu.e.compiler.internal.linking;

import java.util.ArrayList;
import java.util.List;

import hu.e.compiler.list.StatusStep;

/**
 * @author balazs.grill
 *
 */
public class ProgramListLogger {

	private final List<StatusStep> statuses = new ArrayList<StatusStep>();
	
	public void add(StatusStep status){
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
		System.out.println(sb.toString());
	}
	
}
