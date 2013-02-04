package hu.modembed.query.proba;

import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.code.AssemblerObject;
import hu.modembed.query.proba.ProbaMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.modembed.query.proba pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ProbaProcessor implements IMatchProcessor<ProbaMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAo the value of pattern parameter ao in the currently processed match 
   * @param pI the value of pattern parameter i in the currently processed match 
   * 
   */
  public abstract void process(final AssemblerObject ao, final Instruction i);
  
  @Override
  public void process(final ProbaMatch match) {
    process(match.getAo(), match.getI());  				
    
  }
}
