/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.OPERATION;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.list.ProgramStep;
import hu.e.parser.eSyntax.ADDITIVE_OPERATOR;
import hu.e.parser.eSyntax.BOOLEAN_OPERATOR;
import hu.e.parser.eSyntax.EQUALITY_OPERATOR;
import hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.UNARY_OPERATOR;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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
	
	private final EObject context;
	
	public OperationSymbol(EObject context, ISymbol a, Object op, ISymbol b, ISymbolManager sm) throws ECompilerException {
		super();
		this.context = context;
		this.a = a;
		if (a == null){
			throw new ECompilerException(context, "The operation needs at least one argument");
		}
		this.op = findop(op);
		if (this.op == null){
			throw new ECompilerException(context, "Could not find operator for "+op);
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

	private final List<ProgramStep> steps = new ArrayList<ProgramStep>();
	
	private IVariableSymbol result = null;
	
	private IVariableSymbol createBuffer(TypeDef type) throws ECompilerException{
		int addr = sm.getVariableManager().allocate(sm, type);
		IVariableSymbol v = VariableSymbol.create(new LiteralSymbol(addr), type);
		return v;
	}
	
	private ISymbol execute(OperationRole role, ISymbol...symbols) throws ECompilerException{
		OperatedSymbol os = sm.executeOperator(role,context, symbols);
		steps.addAll(os.getSteps());
		return os.getSymbol();
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
		throw new ECompilerException(context, "Runtime "+op+" operator is not yet supported.");
	}
	
	private void compile() throws ECompilerException{
		TypeDef type = getType();
		
		sm.getVariableManager().startBlock();
		switch(op){
		case ADD:
		case AND:
		case MINUS:
		case MOD:
		case DIV:
		case MUL:
		case OR:
			result = createBuffer(type);
			execute(OperationRole.SET, result,a);
			execute(getRole(op), result,b);
			break;
		
		case GT:
		case GTE:
		case LT:
		case LTE:
		case NOTEQUALS:
		case EQUALS:
			result = (IVariableSymbol)execute(getRole(op), a,b);
			break;
			
		default:
			throw new ECompilerException(context, "Runtime "+op+" operator is not yet supported.");
		}
		sm.getVariableManager().startBlock();
		
	}
	
	@Override
	public int getValue() throws ECompilerException {
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
			throw new ECompilerException(context, "Unknown operator: "+op);
		}else{
			
			
			
			throw new ECompilerException(context, "This is a runtime operation!");
		}
	}

	@Override
	public boolean isLiteral() {
		if (b == null) return a.isLiteral();
		return a.isLiteral() && b.isLiteral();
	}

	@Override
	public List<ProgramStep> getSteps() {
		List<ProgramStep> ps = new ArrayList<ProgramStep>();
		ps.addAll(a.getSteps());
		ps.addAll(b.getSteps());
		ps.addAll(steps);
		return ps;
	}

	@Override
	public TypeDef getType() throws ECompilerException {
		switch(op){
		case ADD:
		case AND:
		case MINUS:
		case MOD:
		case DIV:
		case MUL:
		case OR:
//			if (b != null){
//				int sizeb = 0;
//				int sizea = sm.getVariableManager().getMemoryManager().getSize(sm, a.getType());
//				sizeb = sm.getVariableManager().getMemoryManager().getSize(sm, b.getType());
//				return sizea > sizeb ? a.getType() : b.getType();
//			}else{
//				return a.getType();
//			}
		
		case GT:
		case GTE:
		case LT:
		case LTE:
		case NOTEQUALS:
		case EQUALS:
			return sm.getResultType(getRole(op), a,b);
			
		default:
			return null;
		}
		
		
	}

	@Override
	public String toString() {
		if (isLiteral()){
			try {
				return ""+getValue();
			} catch (ECompilerException e) {
				return "VARERROR("+e.getMessage()+")";
			}
		}
		return op+"("+a.toString()+(b==null?"":(", "+b.toString()))+")";
	}
	
	@Override
	public ISymbol getAddressSymbol() {
		return result.getAddressSymbol();
	}

	@Override
	public ISymbol getElement(ISymbolManager sm, int index)
			throws ECompilerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member)
			throws ECompilerException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
