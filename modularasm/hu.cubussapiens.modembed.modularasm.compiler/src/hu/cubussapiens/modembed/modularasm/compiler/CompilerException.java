/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler;

/**
 * @author balage
 *
 */
public class CompilerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5538442539452431882L;

	private final CompilationProblem[] problems;


	public CompilerException(String message, CompilationProblem... problems) {
		super(message);
		this.problems = problems;
	}
	
	public CompilationProblem[] getProblems() {
		return problems;
	}
	
}
