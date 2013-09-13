/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.MODembedCore;
import hu.modembed.syntax.SyntaxModel;
import hu.modembed.syntax.persistence.build.IModelBuildStep;
import hu.modembed.syntax.persistence.build.ModelBuilder;
import hu.modembed.syntax.persistence.impl.DefaultFeatureResolver;
import hu.modembed.syntax.persistence.impl.StringInput;
import hu.modembed.syntax.persistence.impl.earley.EarleyParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
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
		
		//if (!Activator.getCache().load(this)){
			
		IParserContext context = new IParserContext() {
			
			@Override
			public void logError(Diagnostic diagnostic) {
				System.out.println(diagnostic);
				getErrors().add(diagnostic);
			}
			
			@Override
			public void logError(Exception e) {
				getErrors().add(new ParsingError(e.getMessage(), ""));
			}
			
			@Override
			public IProgressMonitor getMonitor() {
				return new NullProgressMonitor();
			}
		};
		
		IParser parser = new EarleyParser(syntax);
		//IParser parser = new GenericParser(syntax);
		IParserInput input = new StringInput(data, parser.getGrammar().terminals(), context);
		//IParserInput input = new TokenizedInput(data, parser.getGrammar().terminals(), context);

		List<IModelBuildStep> modelbuild = parser.parse(input, context, l+1);
		
		if (modelbuild != null){
			ModelBuilder builder = new ModelBuilder(new DefaultFeatureResolver(), input);
			getErrors().addAll(builder.buildModel(this, modelbuild));
		}
	}
	
	
	
}
