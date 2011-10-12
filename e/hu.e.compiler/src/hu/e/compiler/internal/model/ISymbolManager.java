package hu.e.compiler.internal.model;

import hu.e.compiler.internal.OperationFinder;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.LabelSymbol;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.XExpression;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface ISymbolManager {
	
	public void addLabelSymbol(LabelSymbol ls);
	
	public ISymbol getSymbol(Variable ref);
	
	public IVariableManager getVariableManager();
	
	public ISymbol resolve(XExpression expression);
	
	public void contextAssign(VariableReference vr, int value);
	
	public void setLabelAddresses(Map<LabelStep, Integer> addresses);
	
	public ISymbol resolveVarRef(VariableReference vr);
	
	public OperationFinder getOpFinder();
	
	public List<IProgramStep> executeOperator(OperationRole role, EObject context, ISymbol...symbols);
}
