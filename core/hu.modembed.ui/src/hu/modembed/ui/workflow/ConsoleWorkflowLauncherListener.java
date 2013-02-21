/**
 * 
 */
package hu.modembed.ui.workflow;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import hu.e.compiler.IWorkflowLauncherListener;
import hu.modembed.model.core.workflow.Task;
import hu.modembed.model.core.workflow.WorkflowTask;

/**
 * @author balazs.grill
 *
 */
public class ConsoleWorkflowLauncherListener implements
		IWorkflowLauncherListener {

	private MessageConsole findConsole(String name){
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i<existing.length; i++){
			if (name.equals(existing[i].getName())){
				return (MessageConsole)existing[i];
			}
		}
		//no console found -> create new one
		MessageConsole newConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{newConsole});
		return newConsole;
	}
	
	private final MessageConsole console;
	private final MessageConsoleStream stream;
	
	private long start;
	
	private long time(){
		return System.currentTimeMillis() - start;
	}
	
	/**
	 * 
	 */
	public ConsoleWorkflowLauncherListener() {
		this.console = findConsole("MODembed workflow");
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
		this.stream = this.console.newMessageStream();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.IWorkflowLauncherListener#started()
	 */
	@Override
	public void started() {
		start = System.currentTimeMillis();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.IWorkflowLauncherListener#taskStarted(hu.modembed.model.core.workflow.WorkflowTask)
	 */
	@Override
	public void taskStarted(WorkflowTask task) {
		String name = ((Task)task).getType();
		stream.println("["+time()+"] - "+name);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.IWorkflowLauncherListener#outputSaving(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public void outputSaving(URI document) {
		stream.println("["+time()+"] - Saving "+document);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.IWorkflowLauncherListener#log(org.eclipse.core.runtime.IStatus)
	 */
	@Override
	public void log(IStatus status) {
		stream.println("["+time()+"] - "+status.toString());

	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.IWorkflowLauncherListener#ended()
	 */
	@Override
	public void ended() {
		stream.println("["+time()+"] - Workflow finished.");
		try {
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
