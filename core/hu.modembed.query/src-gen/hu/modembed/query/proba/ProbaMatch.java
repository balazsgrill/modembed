package hu.modembed.query.proba;

import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.code.AssemblerObject;
import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.modembed.query.proba pattern, 
 * to be used in conjunction with ProbaMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ProbaMatcher
 * @see ProbaProcessor
 * 
 */
public final class ProbaMatch extends BasePatternMatch {
  private AssemblerObject fAo;
  
  private Instruction fI;
  
  private static String[] parameterNames = {"ao", "i"};
  
  ProbaMatch(final AssemblerObject pAo, final Instruction pI) {
    this.fAo = pAo;
    this.fI = pI;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ao".equals(parameterName)) return this.fAo;
    if ("i".equals(parameterName)) return this.fI;
    return null;
    
  }
  
  public AssemblerObject getAo() {
    return this.fAo;
    
  }
  
  public Instruction getI() {
    return this.fI;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("ao".equals(parameterName) ) {
    	this.fAo = (hu.modembed.model.core.assembler.code.AssemblerObject) newValue;
    	return true;
    }
    if ("i".equals(parameterName) ) {
    	this.fI = (hu.modembed.model.core.assembler.Instruction) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setAo(final AssemblerObject pAo) {
    this.fAo = pAo;
    
  }
  
  public void setI(final Instruction pI) {
    this.fI = pI;
    
  }
  
  @Override
  public String patternName() {
    return "hu.modembed.query.proba";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ProbaMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAo, fI};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ao\"=" + prettyPrintValue(fAo) + ", ");
    result.append("\"i\"=" + prettyPrintValue(fI));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAo == null) ? 0 : fAo.hashCode()); 
    result = prime * result + ((fI == null) ? 0 : fI.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!ProbaMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ProbaMatch other = (ProbaMatch) obj;
    if (fAo == null) {if (other.fAo != null) return false;}
    else if (!fAo.equals(other.fAo)) return false;
    if (fI == null) {if (other.fI != null) return false;}
    else if (!fI.equals(other.fI)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ProbaMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
