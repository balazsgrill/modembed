/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence.tokens;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @author balazs.grill
 *
 */
public class Parser {

	private final Stack<ITokenHandler> tokenHandlers = new Stack<ITokenHandler>();
	
	private final LinkedList<String> peekedTokens = new LinkedList<String>();
	
	private final Map<ITokenHandler, IHandlerPopListener> listeners = new HashMap<ITokenHandler, IHandlerPopListener>();
	
	private final TokenProvider tprov;
	
	private boolean badtoken = false;
	
	public Parser(ITokenHandler roothandler, BufferedReader reader) {
		tprov = new TokenProvider(reader);
		tokenHandlers.push(roothandler);
	}
	
	public void parse(){
		while(!peekedTokens.isEmpty() || tprov.hasNext()){
			
			String token = null;
			if (!peekedTokens.isEmpty()){
				token = peekedTokens.poll();
			}else{
				token = tprov.next();
			}
			
			if (badtoken){
				/*
				 * Throw away token
				 */
				System.err.println("Bad token: \""+token+"\"");
				badtoken = false;
			}else{
				tokenHandlers.peek().handleToken(token, this);
			}
			
		}
	}
	
	public void push(ITokenHandler handler){
		tokenHandlers.push(handler);
	}
	
	public void push(ITokenHandler handler, IHandlerPopListener listener){
		push(handler);
		listeners.put(handler, listener);
	}
	
	public void pop(){
		ITokenHandler handler = tokenHandlers.pop();
		if (listeners.containsKey(handler)){
			listeners.get(handler).handlerPopped();
			listeners.remove(handler);
		}
		badtoken = false;
	}
	
	public void throwBack(String token){
		peekedTokens.addFirst(token);
		badtoken = true;
	}
	
	public String peek(int i){
		while(peekedTokens.size() < i+1){
			String t = tprov.next();
			if (t == null){
				return null;
			}
			peekedTokens.add(t);
		}
		return peekedTokens.get(i);
	}
	
}
