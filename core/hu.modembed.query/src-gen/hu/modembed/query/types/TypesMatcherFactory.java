package hu.modembed.query.types;

import hu.modembed.query.types.TypesMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate TypesMatcher in a type-safe way.
 * 
 * @see TypesMatcher
 * @see TypesMatch
 * 
 */
public class TypesMatcherFactory extends BaseGeneratedMatcherFactory<TypesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TypesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TypesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TypesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.modembed.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.modembed.query.types";
    
  }
  
  private TypesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TypesMatcherFactory> {
    @Override
    public TypesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TypesMatcherFactory INSTANCE = make();
    
    public static TypesMatcherFactory make() {
      try {
      	return new TypesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
