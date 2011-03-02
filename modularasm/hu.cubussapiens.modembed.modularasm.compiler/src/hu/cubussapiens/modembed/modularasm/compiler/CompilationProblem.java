/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler;

import org.eclipse.core.runtime.IStatus;

/**
 * @author balage
 *
 */
public class CompilationProblem {

	private final String message;
	
	private final String module;
	
	private final int line;
	
	private final int column;

	private final int severity;
	
	public CompilationProblem(int severity, String message, String module, int line,
			int column) {
		this.message = message;
		this.module = module;
		this.line = line;
		this.column = column;
		this.severity = severity;
	}
	
	public CompilationProblem(String message, String module, int line,
			int column) {
		this(IStatus.ERROR, message, module, line, column);
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getModule() {
		return module;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getColumn() {
		return column;
	}
	
	public int getSeverity() {
		return severity;
	}
}
