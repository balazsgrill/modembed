/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.infrastructure.RootElement;
import hu.modembed.syntax.SyntaxModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * @author balazs.grill
 *
 */
public class GenericSyntaxResource extends ResourceImpl {

	public GenericSyntaxResource() {
	}
	
	public GenericSyntaxResource(URI uri){
		super(uri);
	}
	
	private String inputStreamToString(InputStream inputStream) throws IOException{
		byte[] data = new byte[inputStream.available()];
		inputStream.read(data);
		
		return new String(data);
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		
		String data = inputStreamToString(inputStream);
		int l = data.indexOf('\n');
		if (l == -1) l = data.length();
		String firstLine = data.substring(0, l).trim();
		
		SyntaxModel syntax = null;
		
		if (firstLine.startsWith("#!")){
			String syntaxID = firstLine.substring(2);
			RootElement re = MODembedCore.getDefault().getModelIndex().findRootElement(this, syntaxID);
			if (re instanceof SyntaxModel){
				syntax = (SyntaxModel)re;
			}else{
				throw new RuntimeException("Cannot find syntax: "+syntaxID);
			}
		}else{
			throw new RuntimeException("Missing syntax specification!");
		}
		
		GenericParser parser = new GenericParser(syntax);
		
		ParserState startState = parser.getStartState(data, l+1);
		Deque<ParserState> states = new LinkedList<>();
		ParserState finishedState = null;
		states.add(startState);
		
		while(finishedState == null && !states.isEmpty()){
			ParserState current = states.pollFirst();
			
			/* Remove whitespaces */
			current = current.removeWhiteSpace();
			if (current.done()){
				finishedState = current;
			}else{

				/* Step */
				for(ParserState followup : current.getValidFollowingStates()){
					/* Deep-first search */
					states.addFirst(followup);
				}
			}
		}
		
		if (finishedState == null){
			throw new RuntimeException("Syntax error!");
		}
		
		finishedState.buildModel(this);
		
	}
	
	
	
}
