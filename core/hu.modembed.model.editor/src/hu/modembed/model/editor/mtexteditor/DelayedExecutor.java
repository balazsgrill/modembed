/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;

/**
 * @author balazs.grill
 *
 */
public abstract class DelayedExecutor{

	private class TriggerRunnable implements Runnable{

		private final long time;
		
		public TriggerRunnable(long time) {
			this.time = time;
		}
		
		@Override
		public void run() {
			synchronized (DelayedExecutor.this) {
				if (this.time == triggerTime) if (tryStart()){
					new Job(DelayedExecutor.this.toString()) {

						@Override
						protected IStatus run(IProgressMonitor monitor) {
							IStatus status = null;
							try{
								status = doExecute(monitor);
							}finally{
								finish();
							}
							return status; 
						}
					}.schedule();
				}

			}
		}
		
	}
	
	private synchronized boolean tryStart(){
		if (running) return false;
		running = true;
		return true;
	}
	
	private synchronized void finish(){
		running = false;
	}
	
	protected abstract IStatus doExecute(IProgressMonitor monitor);
	
	private volatile long triggerTime = System.currentTimeMillis();
	private volatile boolean running = false;
	
	public synchronized void trigger(){
		triggerTime = System.currentTimeMillis();
		Display.getDefault().timerExec(100, new TriggerRunnable(triggerTime));
	}

	
}
