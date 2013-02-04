package hu.modembed.query.proba;

import hu.modembed.query.proba.ProbaMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ProbaMatcher in a type-safe way.
 * 
 * @see ProbaMatcher
 * @see ProbaMatch
 * 
 */
public class ProbaMatcherFactory extends BaseGeneratedMatcherFactory<ProbaMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ProbaMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ProbaMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ProbaMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.modembed.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.modembed.query.proba";
    
  }
  
  private ProbaMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ProbaMatcherFactory> {
    @Override
    public ProbaMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ProbaMatcherFactory INSTANCE = make();
    
    public static ProbaMatcherFactory make() {
      try {
      	return new ProbaMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
