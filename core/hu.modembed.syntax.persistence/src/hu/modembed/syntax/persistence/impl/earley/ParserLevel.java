/**
 * 
 */
package hu.modembed.syntax.persistence.impl.earley;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class ParserLevel {

	private final Set<EarleyState> states = new LinkedHashSet<EarleyState>();
	private Queue<EarleyState> queue = null;
	
	public boolean add(EarleyState state){
		if (!states.contains(state)){
			states.add(state);
			if (queue != null){
				queue.add(state);
			}
			return true;
		}
		return false;
	}

	public Queue<EarleyState> getQueue(){
		if (queue == null) {
			queue = new LinkedList<EarleyState>(states);
		}
		return queue;
	}
	
	public void queueFinished(){
		queue = null;
	}
	
	public Set<EarleyState> getStates() {
		return states;
	}
	
}
