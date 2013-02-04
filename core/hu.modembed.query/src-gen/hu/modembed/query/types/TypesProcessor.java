package hu.modembed.query.types;

import hu.modembed.model.emodel.Type;
import hu.modembed.query.types.TypesMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.modembed.query.types pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TypesProcessor implements IMatchProcessor<TypesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match 
   * 
   */
  public abstract void process(final Type T);
  
  @Override
  public void process(final TypesMatch match) {
    process(match.getT());  				
    
  }
}
