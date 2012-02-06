package hu.e.compiler.internal.model;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.linking.OperationFinder;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.internal.model.symbols.impl.LabelSymbol;
import hu.e.compiler.internal.model.symbols.impl.OperatedSymbol;
import hu.e.compiler.list.LabelStep;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.XExpression;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface ISymbolManager {
	
	public void addLabelSymbol(LabelSymbol ls);
	
	public ISymbol getSymbol(Variable ref) throws ECompilerException;
	
	public IVariableManager getVariableManager();
	
	public ISymbol resolve(XExpression expression) throws ECompilerException;
	
	public void contextAssign(VariableReference vr, int value);
	
	public void setLabelAddresses(Map<LabelStep, Integer> addresses) throws ECompilerException;
	
	public ISymbol resolveVarRef(VariableReference vr) throws ECompilerException;
	
	public OperationFinder getOpFinder();
	
	public OperatedSymbol executeOperator(OperationRole role, EObject context, ISymbol...symbols) throws ECompilerException;
	
	public TypeDef getResultType(OperationRole role, ISymbol...symbols) throws ECompilerException;
	
	public IVariableSymbol createBuffer(TypeDef type) throws ECompilerException;
	
	public CodePlatform getCodePlatform();
}
