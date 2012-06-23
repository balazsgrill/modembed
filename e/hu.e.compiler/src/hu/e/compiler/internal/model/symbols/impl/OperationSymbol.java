/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.CodePlatform;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.OPERATION;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ILinkTimeSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

import java.math.BigDecimal;
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
	
	private final EObject context;
	
	public OperationSymbol(EObject context, ISymbol a, OPERATION op, ISymbol b, ISymbolManager sm) throws ECompilerException {
		super();
		this.context = context;
		this.a = a;
		if (a == null){
			throw new ECompilerException(context, "The operation needs at least one argument");
		}
		this.op = op;
		if (this.op == null){
			throw new ECompilerException(context, "Could not find operator for "+op);
		}
		this.b = b;
		this.sm = sm;
		//this.eo = eo;
		
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
	private MemoryAssignment resultbuffer = null;
	
	private ISymbol result = null;
	
	private IVariableSymbol createBuffer(TypeDef type) throws ECompilerException{
		if (sm.getVariableManager() == null){
			throw new ECompilerException(context, "Cannot define runtime variables in compiletime context!");
		}
		MemoryAssignmentValueSymbol symbol = sm.getVariableManager().allocate(sm, type);
		//memassignments.add(symbol.getAssignment());
		resultbuffer = symbol.getAssignment();
		IVariableSymbol v = VariableSymbol.create(symbol, type);
		return v;
	}
	
	private ISymbol execute(OperationRole role, SequenceStep step, ISymbol...symbols) throws ECompilerException{
		OperatedSymbol os = sm.executeOperator(role,context,step, symbols);
		SequenceStep ss = ListFactory.eINSTANCE.createSequenceStep();
		ss.setName(os.toString());
		os.addSteps(ss);
		steps.add(ss);
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
		case BRANCH:
			break;
		case DEREFERENCE:
			break;
		case NOT:
			break;
		case REFERENCE:
			break;
		case SET:
			break;
		case UNARYMINUS:
			break;
		}
		throw new ECompilerException(context, "Runtime "+op+" operator is not yet supported.");
	}
	
	private boolean isLinkTimeLiteral(){
		if (b == null) return a.isLiteral();
		return a.isLiteral() && b.isLiteral();
	}
	
	private void linkTimeCompile() throws ECompilerException{
		throw new ECompilerException(context, "Link time operation is not yet supported!");
	}
	
	private void compile(SequenceStep step) throws ECompilerException{
		TypeDef type = getType();
		
		if (isLinkTimeLiteral()) {
			linkTimeCompile();
			return;
		}
		
		//sm.getVariableManager().startBlock();
		switch(op){
		case SET:
			result = (IVariableSymbol)a;
			execute(OperationRole.SET, step, a, b);
			break;
		
		case ADD:
		case AND:
		case MINUS:
		case MOD:
		case DIV:
		case MUL:
		case OR:
			result = createBuffer(type);
			execute(OperationRole.SET,step, result,a);
			execute(getRole(op),step, result,b);
			break;
		
		case GT:
		case GTE:
		case LT:
		case LTE:
		case NOTEQUALS:
		case EQUALS:
			result = (IVariableSymbol)execute(getRole(op),step, a,b);
			break;
		case REFERENCE:
			if (a instanceof IVariableSymbol){
				result = ((IVariableSymbol) a).getAddressSymbol();
			}
			break;
		default:
			throw new ECompilerException(context, "Runtime "+op+" operator is not yet supported.");
		}
		//sm.getVariableManager().endBlock();
		
	}
	
	@Override
	public BigDecimal getValue() throws ECompilerException {
		if (isLiteral()){
			
			ILiteralSymbol a = (ILiteralSymbol)this.a;
			ILiteralSymbol b = (this.b == null)? null : (ILiteralSymbol)this.b;
			switch(op){
			case UNARYMINUS:
				return a.getValue().negate();
//			case NOT:
//				return ~a.getValue();
			case ADD:
				return a.getValue().add(b.getValue());
			case AND:
				return BigDecimal.valueOf(a.getValue().longValue() & b.getValue().longValue());
			case DIV:
				return a.getValue().divide(b.getValue(),BigDecimal.ROUND_HALF_UP);
			case EQUALS:
				return (a.getValue().compareTo(b.getValue())) == 0 ? new BigDecimal(1) : new BigDecimal(0);
			case GT:
				return (a.getValue().compareTo(b.getValue())) == 1 ? new BigDecimal(1) : new BigDecimal(0);
			case GTE:
				return (a.getValue().compareTo(b.getValue())) >= 0 ? new BigDecimal(1) : new BigDecimal(0);
			case LT:
				return (a.getValue().compareTo(b.getValue())) == -1 ? new BigDecimal(1) : new BigDecimal(0);
			case LTE:
				return (a.getValue().compareTo(b.getValue())) <= 0 ? new BigDecimal(1) : new BigDecimal(0);
			case MINUS:
				return a.getValue().subtract(b.getValue());
			case MOD:
				return BigDecimal.valueOf(a.getValue().longValue() % b.getValue().longValue());
			case MUL:
				return a.getValue().multiply(b.getValue());
			case NOTEQUALS:
				return (a.getValue().compareTo(b.getValue())) != 0 ? new BigDecimal(1) : new BigDecimal(0);
			case OR:
				return BigDecimal.valueOf(a.getValue().longValue() | b.getValue().longValue());
			case BRANCH:
				break;
			case DEREFERENCE:
				break;
			case NOT:
				break;
			case REFERENCE:
				break;
			case SET:
				break;
			default:
				break;
			}
			throw new ECompilerException(context, "Unknown operator: "+op);
		}else{

			throw new ECompilerException(context, "This is a runtime operation!");
		}
	}

	@Override
	public boolean isLiteral() {
		if (this.a instanceof ILinkTimeSymbol) return false;
		if (this.b instanceof ILinkTimeSymbol) return false;
		
		if (b == null) return a.isLiteral();
		return a.isLiteral() && b.isLiteral();
	}

	@Override
	public void addSteps(SequenceStep sequence) throws ECompilerException {
		SequenceStep step = ListFactory.eINSTANCE.createSequenceStep();
		step.setName(toString());
		sequence.getSteps().add(step);
		
		if (!isLiteral())
			compile(step);
		
		a.addSteps(step);
		if (b != null){
			b.addSteps(step);
		}
		step.getSteps().addAll(steps);
		
		if (resultbuffer != null){
			sequence.getVariables().add(resultbuffer);
		}

	}
	
	private TypeDef getLiteralType() throws ECompilerException{
		if (b == null) return a.getType();
		
		int bits = 0;
		
		TypeDef td = CodePlatform.resolveType(a.getType());
		if (td instanceof DataTypeDef){
			bits = ((DataTypeDef) td).getBits();
		}
		
		TypeDef btd = CodePlatform.resolveType(b.getType());
		if (btd instanceof DataTypeDef){
			if (((DataTypeDef) btd).getBits() > bits) return btd;
		}
		
		return a.getType();
	}
	
	@Override
	public TypeDef getType() throws ECompilerException {
		if (isLiteral()){
			return getLiteralType();
		}
		switch(op){
		case ADD:
		case AND:
		case MINUS:
		case MOD:
		case DIV:
		case MUL:
		case OR:
			if (b != null){
				int sizeb = 0;
				int sizea = sm.getVariableManager().getTypeResolver().getSize(sm, a.getType());
				sizeb = sm.getVariableManager().getTypeResolver().getSize(sm, b.getType());
				return sizea > sizeb ? a.getType() : b.getType();
			}else{
				return a.getType();
			}
		
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
	public ISymbol getAddressSymbol() throws ECompilerException {
		if (result instanceof IVariableSymbol)
			return ((IVariableSymbol)result).getAddressSymbol();
		throw new ECompilerException(context, "Literal value does not have an address.");
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
