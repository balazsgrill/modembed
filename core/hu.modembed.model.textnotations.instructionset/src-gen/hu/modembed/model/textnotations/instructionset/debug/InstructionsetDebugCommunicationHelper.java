/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.debug;

public class InstructionsetDebugCommunicationHelper {
	
	public void sendEvent(hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage sendAndReceive(hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage receivedMessage = hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
