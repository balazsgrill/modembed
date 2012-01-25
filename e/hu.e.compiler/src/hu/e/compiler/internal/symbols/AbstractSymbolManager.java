package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.OperationCallCompiler;
import hu.e.compiler.internal.OperationCompiler;
import hu.e.compiler.internal.OperationFinder;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.internal.model.symbols.impl.ArrayLiteralSymbol;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.compiler.internal.model.symbols.impl.OperatedSymbol;
import hu.e.compiler.internal.model.symbols.impl.OperationSymbol;
import hu.e.compiler.internal.model.symbols.impl.StructLiteralSymbol;
import hu.e.compiler.internal.model.symbols.impl.VariableSymbol;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.UNARY_OPERATOR;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XExpression0;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XExpressionM1;
import hu.e.parser.eSyntax.XIsLiteralExpression;
import hu.e.parser.eSyntax.XParenthesizedExpression;
import hu.e.parser.eSyntax.XPrimaryExpression;
import hu.e.parser.eSyntax.XSizeOfExpression;
import hu.e.parser.eSyntax.XStructExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractSymbolManager implements ISymbolManager {
	
	@Override
	public ISymbol resolve(XExpression x) throws ECompilerException{
		return resolve((XExpression5)x);
	}
	
	private ISymbol resolve(XExpression5 x) throws ECompilerException{
		ISymbol a = resolve(x.getA());
		for(int i=0;i<x.getB().size();i++){
			a = new OperationSymbol(x, a, x.getOp().get(i), resolve(x.getB().get(i)), this);
		}
		return a;
	}
	
	private ISymbol resolve(XExpression4 x) throws ECompilerException{
		ISymbol a = resolve(x.getA());
		for(int i=0;i<x.getB().size();i++){
			a = new OperationSymbol(x, a, x.getOp().get(i), resolve(x.getB().get(i)), this);
		}
		return a;
	}
	
	private ISymbol resolve(XExpression3 x) throws ECompilerException{
		ISymbol a = resolve(x.getA());
		for(int i=0;i<x.getB().size();i++){
			a = new OperationSymbol(x, a, x.getOp().get(i), resolve(x.getB().get(i)), this);
		}
		return a;
	}
	
	private ISymbol resolve(XExpression2 x) throws ECompilerException{
		ISymbol a = resolve(x.getA());
		for(int i=0;i<x.getB().size();i++){
			a = new OperationSymbol(x, a, x.getOp().get(i), resolve(x.getB().get(i)), this);
		}
		return a;
	}
	
	private ISymbol resolve(XExpression1 x) throws ECompilerException{
		ISymbol a = resolve(x.getA());
		for(UNARY_OPERATOR op : x.getOperator()){
			a = new OperationSymbol(x, a, op, null, this);
		}
		return a;
	}
	
	private ISymbol resolve(XExpression0 x) throws ECompilerException{
		ISymbol a = resolve(x.getA());
		for(VariableReference ref : x.getMember()){
			Variable v = ref.getVar();
			if (v instanceof StructTypeDefMember){
				a = a.getMember(this, (StructTypeDefMember)v);
			}else{
				throw new ECompilerException(x, "No such member: "+v.getName());
			}
		}
		return a;
	}
	
	private ISymbol resolve(XExpressionM1 x) throws ECompilerException{
		ISymbol a = resolve(x.getA());
		for(XExpression index : x.getIndex()){
			ISymbol i = resolve(index);
			if (i.isLiteral()){
				a = a.getElement(this, ((ILiteralSymbol)i).getValue());
			}else{
				throw new ECompilerException(index, "TODO: Only compile-time indexing is supported for now");
			}
		}
		return a;
	}
	
	@Override
	public ISymbol resolveVarRef(VariableReference vr) throws ECompilerException{
		ISymbol s = getSymbol(vr.getVar());
		
		if (s == null) throw new ECompilerException(vr, "Variable cannot be accessed here: "+vr.getVar());
		return s;
	}
	
	private ISymbol resolve(XPrimaryExpression x) throws ECompilerException{
		if(x instanceof VariableReference){
			return resolveVarRef((VariableReference)x);
		}
		if (x instanceof XExpressionLiteral){
			return new LiteralSymbol(ECompiler.convertLiteral(((XExpressionLiteral) x).getValue()));
		}
		if (x instanceof XParenthesizedExpression){
			return resolve(((XParenthesizedExpression) x).getA());
		}
		
		if (x instanceof XIsLiteralExpression){
			ISymbol s = getSymbol(((XIsLiteralExpression) x).getRef().getVar());
			return new LiteralSymbol(s.isLiteral()? 1 : 0);
		}
		
		if (x instanceof OperationCall){
			OperationCall oc = (OperationCall)x;
			OperationCallCompiler c = new OperationCallCompiler(oc, this);
			List<IProgramStep> ps = c.compile();
			if (!ps.isEmpty()){
				return new OperatedSymbol(ps, c.getReturns());
			}
			return c.getReturns();
		}
		if (x instanceof XStructExpression){
			return resolveXStruct((XStructExpression)x);
		}
		if (x instanceof XSizeOfExpression){
			TypeDef t = ((XSizeOfExpression) x).getType();
			int size = getVariableManager().getMemoryManager().getSize(this, t);
			return new LiteralSymbol(size);
		}
		
		throw new ECompilerException(x, "Invalid expression");
	}
	
	private ISymbol resolveXStruct(XStructExpression literalStruct) throws ECompilerException{ 
		TypeDef td = literalStruct.getType().getDef();
		List<ISymbol> symbols = new ArrayList<ISymbol>(literalStruct.getValues().size());
		for(XExpression value : literalStruct.getValues()){
			symbols.add(resolve(value));
		}
		
		if (td instanceof ArrayTypeDef){
			ArrayTypeDef atd = (ArrayTypeDef)td;
			int length = ((ILiteralSymbol)resolve(atd.getSize())).getValue();
			if (length != symbols.size()) throw new ECompilerException(literalStruct, "Invalid number of elements!");
			return new ArrayLiteralSymbol(symbols.toArray(new ISymbol[symbols.size()]), td);
		}
		
		if (td instanceof StructTypeDef){
			StructTypeDef std = (StructTypeDef)td;
			if (std.getMembers().size() != symbols.size())
				throw new ECompilerException(literalStruct, "Invalid number of elements!");
			Map<Variable, ISymbol> members = new HashMap<Variable, ISymbol>();
			int i = 0;
			for(Variable m : std.getMembers()){
				members.put(m, symbols.get(i));
				i++;
			}
			return new StructLiteralSymbol(members, td);
		}
		
		return null;
	}
	
	@Override
	public OperatedSymbol executeOperator(OperationRole role, EObject context,
			ISymbol... symbols) throws ECompilerException {
		OperationFinder opfinder = getOpFinder();
		OperationCompiler oc = opfinder.getOperationCompiler(role, symbols);
		if (oc == null) 
			throw new ECompilerException(context, "Cannot find "+role+" operator!");
		return new OperatedSymbol(oc.compile(this),oc.getReturns(this));
	}
	
	@Override
	public IVariableSymbol createBuffer(TypeDef type) throws ECompilerException {
		int addr = this.getVariableManager().allocate(this, type);
		IVariableSymbol v = VariableSymbol.create(new LiteralSymbol(addr), type);
		return v;
	}
	
	@Override
	public TypeDef getResultType(OperationRole role, ISymbol... symbols) throws ECompilerException {
		OperationFinder opfinder = getOpFinder();
		Operation op = opfinder.getOperation(role, symbols);
		if (op != null){
			if (op.getReturn() != null){
				return resolve(op.getReturn()).getType();
			}
			if (op.getReturnvar() != null){
				return op.getReturnvar().getType();
			}
		}
		return null;
	}
	
}
