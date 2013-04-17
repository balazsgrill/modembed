/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class InstructionsetDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugTarget debugTarget;
	
	private hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugCommunicationHelper communicationHelper = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugCommunicationHelper();
	
	public InstructionsetDebugProxy(hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.EXIT);
	}
	
	public hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage getStack() {
		return sendCommandAndRead(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage message = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage message = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage response = sendCommandAndRead(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage response = sendCommandAndRead(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugVariable[] variables  = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugVariable variable = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes command, String... parameters) {
		hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage message = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage sendCommandAndRead(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes command, String... parameters) {
		hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage message = new hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
