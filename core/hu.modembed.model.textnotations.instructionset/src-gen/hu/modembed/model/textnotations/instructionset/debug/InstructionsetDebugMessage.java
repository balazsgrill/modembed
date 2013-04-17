/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class InstructionsetDebugMessage {
	
	private static final char DELIMITER = ':';
	private hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes messageType;
	private String[] arguments;
	
	public InstructionsetDebugMessage(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public InstructionsetDebugMessage(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.encode(DELIMITER, parts);
	}
	
	public static InstructionsetDebugMessage deserialize(String response) {
		java.util.List<String> parts = hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes type = hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes.valueOf(messageType);
		InstructionsetDebugMessage message = new InstructionsetDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(hu.modembed.model.textnotations.instructionset.debug.EInstructionsetDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.explode(arguments, ", ") + "]";
	}
	
}
