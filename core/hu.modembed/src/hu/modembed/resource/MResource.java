/**
 * 
 */
package hu.modembed.resource;

import hu.modembed.resource.scope.MFeatureResolver;
import hu.textualmodeler.ast.WhitespaceNode;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.parser.IFeatureResolver;
import hu.textualmodeler.parser.errors.ParsingError;
import hu.textualmodeler.parser.grammar.GrammarRegistry;
import hu.textualmodeler.parser.impl.StringInput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public class MResource extends AbstractTextualResource {

	private static final Map<String, String> keywordToGrammar = new HashMap<String, String>();
	
	static{
		keywordToGrammar.put("type", "modembed.type");
		keywordToGrammar.put("device", "modembed.device");
		keywordToGrammar.put("instructionset", "modembed.instructionSet");
		keywordToGrammar.put("module", "modembed.module");
		keywordToGrammar.put("sequence", "modembed.sequential");
		keywordToGrammar.put("seqmodule", "modembed.sequential");
		keywordToGrammar.put("rules", "modembed.mappingrules");
	}
	
	private String currentMode = null;
	
	/**
	 * @param uri
	 */
	public MResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.AbstractTextualResource#createFeatureResolver()
	 */
	@Override
	protected IFeatureResolver createFeatureResolver() {
		return new MFeatureResolver(this, getGrammar());
	}

	@Override
	protected GrammarModel loadGrammar() {
		return GrammarRegistry.getInstance().getGrammar(currentMode);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		
		GrammarModel basic = GrammarRegistry.getInstance().getGrammar("basics");
		
		if (basic == null){
			getErrors().add(new ParsingError("Internal error: could not load base grammar", "", 0, 0));
			return;
		}
		
		final String data = inputStreamToString(inputStream);
		
		StringInput input = new StringInput(data, basic.getTerminals(), this);
		int index = 0;
		for(WhitespaceNode ws : input.bypassHidden(0)){
			index += ws.getLength();
		}
		
		String mode = null;
		for(Entry<String, String> entry : keywordToGrammar.entrySet()){
			String kw = entry.getKey();
			if (data.regionMatches(index, kw, 0, kw.length())){
				mode = entry.getValue();
			}
		}
		
		if (mode == null){
			getErrors().add(new ParsingError("File shall start with one of the following keywords: "+keywordToGrammar.keySet(), "", 0, 0));
		}else{
			currentMode = mode;
			super.doLoad(new ByteArrayInputStream(data.getBytes()), options);
		}
	}
	
}
