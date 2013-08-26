/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.MODembedCore;
import hu.modembed.syntax.SyntaxModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
	
	private void error(String message){
		getErrors().add(new ParsingError(message, getURI().lastSegment()));
	}
	
	private void error(String message, String data, int index){
		int line = 0;
		int last = 0;
		Pattern p = Pattern.compile("\n");
		Matcher m = p.matcher(data);
		while(m.find()){
			int pos = m.start();
			if (pos <= index){
				line++;
				last = pos;
			}
		}
		int column = index-last;
		getErrors().add(new ParsingError(message, getURI().lastSegment(), line, column));
	}
	
	private SyntaxModel loadSyntax(String syntaxID){
		
		if (syntaxID.startsWith("platform:")){

			URI uri = URI.createURI(syntaxID);
			try{
				Resource syntaxRes = getResourceSet().getResource(uri, true);
				EObject re = null;
				if (syntaxRes != null && !syntaxRes.getContents().isEmpty()){
					re = syntaxRes.getContents().get(0);
				}
				return (re instanceof SyntaxModel) ? (SyntaxModel)re : null;
			}catch(Exception e){
				error(e.getMessage());
				return null;
			}
		}else{
			EObject eo = MODembedCore.getDefault().getModelIndex().find(this, syntaxID);
			if (eo instanceof SyntaxModel){
				return (SyntaxModel)eo;
			}
			return null;
		}
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
			syntax = loadSyntax(syntaxID);

			if (syntax == null){
				error("Cannot find syntax: "+syntaxID);
				return;
			}
		}else{
			error("Missing syntax specification!");
			return;
		}
		
		if (!Activator.getCache().load(this)){
			
			GenericParser parser = new GenericParser(syntax);
			getErrors().addAll(parser.errors);

			ParserState startState = parser.getStartState(data, l+1);
			LinkedList<ParserState> states = new LinkedList<ParserState>();
			ParserState finishedState = null;
			ParserState bestState = null;
			states.add(startState);

			while(finishedState == null && !states.isEmpty()){
				ParserState current = states.pollFirst();

				/* Remove whitespaces */
				current = current.removeWhiteSpace();
				if (current.done()){
					finishedState = current;
				}else{

					if (bestState == null || bestState.getIndex() <= current.getIndex()){
						bestState = current;
					}

					/* Step */
					for(ParserState followup : current.getValidFollowingStates()){
						/* Deep-first search */
						if (!followup.shouldBeCut()){
							states.addFirst(followup);
						}
					}
				}
			}

			if (finishedState == null){
				if (bestState != null){
					error("Syntax error: expected "+bestState.expectedItem()+" here: \""+bestState.followupText(20)+"...\"", data, bestState.getIndex());
				}else{
					error("Syntax error!");
				}
				return;
			}

			finishedState.buildModel(this);
			Activator.getCache().save(this);
		}
	}
	
	
	
}
