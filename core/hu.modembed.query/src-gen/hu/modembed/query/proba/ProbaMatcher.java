package hu.modembed.query.proba;

import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.code.AssemblerObject;
import hu.modembed.query.proba.ProbaMatch;
import hu.modembed.query.proba.ProbaMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatcherFactory;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the hu.modembed.query.proba pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryExplorer
 * pattern proba(ao, i) = {
 * 	AssemblerObject(ao);
 * 	AssemblerObject.instructions(ao, ins);
 * 	InstructionCall.instruction(ins, i);
 * }
 * </pre></code>
 * 
 * @see ProbaMatch
 * @see ProbaMatcherFactory
 * @see ProbaProcessor
 * 
 */
public class ProbaMatcher extends BaseGeneratedMatcher<ProbaMatch> {
  private final static int POSITION_AO = 0;
  
  private final static int POSITION_I = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public ProbaMatcher(final Notifier emfRoot) throws IncQueryException {
    this(EngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public ProbaMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @return matches represented as a ProbaMatch object.
   * 
   */
  public Collection<ProbaMatch> getAllMatches(final AssemblerObject pAo, final Instruction pI) {
    return rawGetAllMatches(new Object[]{pAo, pI});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @return a match represented as a ProbaMatch object, or null if no match is found.
   * 
   */
  public ProbaMatch getOneArbitraryMatch(final AssemblerObject pAo, final Instruction pI) {
    return rawGetOneArbitraryMatch(new Object[]{pAo, pI});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AssemblerObject pAo, final Instruction pI) {
    return rawHasMatch(new Object[]{pAo, pI});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AssemblerObject pAo, final Instruction pI) {
    return rawCountMatches(new Object[]{pAo, pI});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AssemblerObject pAo, final Instruction pI, final IMatchProcessor<? super ProbaMatch> processor) {
    rawForEachMatch(new Object[]{pAo, pI}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AssemblerObject pAo, final Instruction pI, final IMatchProcessor<? super ProbaMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pAo, pI}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<ProbaMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final AssemblerObject pAo, final Instruction pI) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pAo, pI});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pAo the fixed value of pattern parameter ao, or null if not bound.
   * @param pI the fixed value of pattern parameter i, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ProbaMatch newMatch(final AssemblerObject pAo, final Instruction pI) {
    return new ProbaMatch(pAo, pI);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for ao.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AssemblerObject> rawAccumulateAllValuesOfao(final Object[] parameters) {
    Set<AssemblerObject> results = new HashSet<AssemblerObject>();
    rawAccumulateAllValues(POSITION_AO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ao.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AssemblerObject> getAllValuesOfao() {
    return rawAccumulateAllValuesOfao(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ao.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AssemblerObject> getAllValuesOfao(final ProbaMatch partialMatch) {
    return rawAccumulateAllValuesOfao(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ao.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AssemblerObject> getAllValuesOfao(final Instruction pI) {
    return rawAccumulateAllValuesOfao(new Object[]{null, pI});
  }
  
  /**
   * Retrieve the set of values that occur in matches for i.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruction> rawAccumulateAllValuesOfi(final Object[] parameters) {
    Set<Instruction> results = new HashSet<Instruction>();
    rawAccumulateAllValues(POSITION_I, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for i.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruction> getAllValuesOfi() {
    return rawAccumulateAllValuesOfi(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for i.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruction> getAllValuesOfi(final ProbaMatch partialMatch) {
    return rawAccumulateAllValuesOfi(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for i.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Instruction> getAllValuesOfi(final AssemblerObject pAo) {
    return rawAccumulateAllValuesOfi(new Object[]{pAo, null});
  }
  
  @Override
  public ProbaMatch tupleToMatch(final Tuple t) {
    try {
    	return new ProbaMatch((hu.modembed.model.core.assembler.code.AssemblerObject) t.get(POSITION_AO), (hu.modembed.model.core.assembler.Instruction) t.get(POSITION_I));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public ProbaMatch arrayToMatch(final Object[] match) {
    try {
    	return new ProbaMatch((hu.modembed.model.core.assembler.code.AssemblerObject) match[POSITION_AO], (hu.modembed.model.core.assembler.Instruction) match[POSITION_I]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<ProbaMatcher> factory() throws IncQueryException {
    return ProbaMatcherFactory.instance();
  }
}
