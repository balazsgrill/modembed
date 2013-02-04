package hu.modembed.query;

import hu.modembed.query.proba.ProbaMatcher;
import hu.modembed.query.types.TypesMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public final class GroupOfFileQueries extends BaseGeneratedPatternGroup {
  public GroupOfFileQueries() throws IncQueryException {
    matcherFactories.add(ProbaMatcher.factory());
    matcherFactories.add(TypesMatcher.factory());
    
  }
}
