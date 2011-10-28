/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.OPERATION;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.parser.eSyntax.ADDITIVE_OPERATOR;
import hu.e.parser.eSyntax.BOOLEAN_OPERATOR;
import hu.e.parser.eSyntax.EQUALITY_OPERATOR;
import hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.UNARY_OPERATOR;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class OperationSymbol implements ILiteralSymbol, IVariableSymbol{

	private final ISymbol a; 
	private final OPERATION op; 
	private final ISymbol b;
	private final ISymbolManager sm;
	
	public static OPERATION findop(Object op){
		if (op instanceof OPERATION) return (OPERATION)op;
		
		if (op instanceof UNARY_OPERATOR){
			switch((UNARY_OPERATOR)op){
			case MINUS: return OPERATION.UNARYMINUS;
			case NOT: return OPERATION.NOT;
			}
		}
		if (op instanceof BOOLEAN_OPERATOR){
			switch((BOOLEAN_OPERATOR)op){
			case AND: return OPERATION.AND;
			case OR: return OPERATION.OR;
			}
		}
		if (op instanceof EQUALITY_OPERATOR){
			switch((EQUALITY_OPERATOR)op){
			case EQUALS: return OPERATION.EQUALS;
			case NOTEQUALS: return OPERATION.NOTEQUALS;
			case GT: return OPERATION.GT;
			case LT: return OPERATION.LT;
			case GTE: return OPERATION.GTE;
			case LTE: return OPERATION.LTE;
			}
		}
		if (op instanceof ADDITIVE_OPERATOR){
			switch((ADDITIVE_OPERATOR)op){
			case ADD: return OPERATION.ADD;
			case MINUS: return OPERATION.MINUS;
			}
		}
		if (op instanceof MULTIPLICATIVE_OPERATOR){
			switch((MULTIPLICATIVE_OPERATOR)op){
			case DIV: return OPERATION.DIV;
			case MOD: return OPERATION.MOD;
			case MUL: return OPERATION.MUL;
			}
		}
		
		return null;
	}
	
	public OperationSymbol(ISymbol a, Object op, ISymbol b, ISymbolManager sm) throws ECompilerException {
		super();
		this.a = a;
		if (a == null){
			throw new IllegalArgumentException("The operation needs at least one argument");
		}
		this.op = findop(op);
		if (this.op == null){
			throw new IllegalArgumentException("Could not find operator for "+op);
		}
		this.b = b;
		this.sm = sm;
		//this.eo = eo;
		
		if (!isLiteral())
			compile();
		
	}
	
	public ISymbol getA() {
		return a;
	}
	
	public OPERATION getOp() {
		return op;
	}
	
	public ISymbol getB() {
		return b;
	}

	private final List<IProgramStep> steps = new ArrayList<IProgramStep>();
	
	private IVariableSymbol result = null;
	
	private IVariableSymbol createBuffer(Type type) throws ECompilerException{
		int addr = sm.getVariableManager().allocate(sm, type);
		IVariableSymbol v = VariableSymbol.create(new LiteralSymbol(addr), type);
		return v;
	}
	
	private void execute(OperationRole role, ISymbol...symbols) throws ECompilerException{
		steps.addAll(sm.executeOperator(role,sm.getOpFinder().getElement(), symbols));
	}
	
	private OperationRole getRole(OPERATION op) throws ECompilerException{
		switch(op){
		case ADD: return OperationRole.ADD;
		case AND: return OperationRole.AND;
		case MINUS: return OperationRole.SUBTRACT;
		case MOD: return OperationRole.MOD;
		case DIV: return OperationRole.DIV;
		case LT: return OperationRole.LT;
		case LTE: return OperationRole.LTE;
		case GTE: return OperationRole.GT;
		case GT: return OperationRole.GTE;
		case MUL: break;
		case EQUALS: return OperationRole.EQUALS;
		case NOTEQUALS : break;
		case OR: return OperationRole.OR;
		}
		throw new ECompilerException(sm.getOpFinder().getElement(), "Runtime "+op+" operator is not yet supported.");
	}
	
	private void compile() throws ECompilerException{
		Type type = getType();
		result = createBuffer(type);
		
		sm.getVariableManager().startBlock();
		switch(op){
		case ADD:
		case AND:
		case MINUS:
		case MOD:
		case DIV:
		case GT:
		case GTE:
		case LT:
		case LTE:
		case MUL:
		case NOTEQUALS:
		case OR:
			execute(OperationRole.SET, result,a);
			execute(getRole(op), result,b);
			break;
			
			
		default:
			throw new ECompilerException(sm.getOpFinder().getElement(), "Runtime "+op+" operator is not yet supported.");
		}
		sm.getVariableManager().startBlock();
		
	}
	
	@Override
	public int getValue() {
		if (isLiteral()){
			ILiteralSymbol a = (ILiteralSymbol)this.a;
			ILiteralSymbol b = (this.b == null)? null : (ILiteralSymbol)this.b;
			switch(op){
			case UNARYMINUS:
				return -a.getValue();
			case NOT:
				return ~a.getValue();
			case ADD:
				return a.getValue()+b.getValue();
			case AND:
				return a.getValue() & b.getValue();
			case DIV:
				return a.getValue() / b.getValue();
			case EQUALS:
				return (a.getValue() == b.getValue()) ? 1 : 0;
			case GT:
				return (a.getValue() > b.getValue()) ? 1 : 0;
			case GTE:
				return (a.getValue() >= b.getValue()) ? 1 : 0;
			case LT:
				return (a.getValue() < b.getValue()) ? 1 : 0;
			case LTE:
				return (a.getValue() <= b.getValue()) ? 1 : 0;
			case MINUS:
				return a.getValue()-b.getValue();
			case MOD:
				return a.getValue() % b.getValue();
			case MUL:
				return a.getValue()*b.getValue();
			case NOTEQUALS:
				return (a.getValue() != b.getValue()) ? 1 : 0;
			case OR:
				return a.getValue() | b.getValue();
			}
			throw new IllegalArgumentException("Unknown operator: "+op);
		}else{
			
			
			
			throw new IllegalArgumentException("This is a runtime operation!");
		}
	}

	@Override
	public boolean isLiteral() {
		if (b == null) return a.isLiteral();
		return a.isLiteral() && b.isLiteral();
	}

	@Override
	public List<IProgramStep> getSteps() {
		List<IProgramStep> ps = new ArrayList<IProgramStep>();
		ps.addAll(a.getSteps());
		ps.addAll(b.getSteps());
		ps.addAll(steps);
		return ps;
	}

	@Override
	public Type getType() throws ECompilerException {
		if (b != null){
			int sizeb = 0;
			int sizea = sm.getVariableManager().getMemoryManager().getSize(sm, a.getType());
			sizeb = sm.getVariableManager().getMemoryManager().getSize(sm, b.getType());
			return sizea > sizeb ? a.getType() : b.getType();
		}else{
			return a.getType();
		}
		
	}

	@Override
	public String toString() {
		if (isLiteral())
			return ""+getValue();
		return op+"("+a.toString()+(b==null?"":(", "+b.toString()))+")";
	}
	
	@Override
	public ISymbol getAddressSymbol() {
		return result.getAddressSymbol();
	}
	
}
