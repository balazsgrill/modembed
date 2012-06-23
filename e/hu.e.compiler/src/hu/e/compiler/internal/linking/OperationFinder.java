/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.OperationCompiler;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ILinkTimeSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.internal.model.symbols.SymbolContext;
import hu.e.compiler.internal.model.symbols.impl.StructLiteralSymbol;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.FixedDataTypeDef;
import hu.e.parser.eSyntax.IntegerDataTypeDef;
import hu.e.parser.eSyntax.IntegerKind;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.TypeDef;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class OperationFinder {

	private final Collection<Library> usedlibs;
	
	private final ComponentLinker linker;
	
	public OperationFinder(ComponentLinker linker, Collection<Library> usedlibs) {
		this.usedlibs = usedlibs;
		this.linker = linker;
	}
	
	public Operation findOverride(Operation operation){
		Operation op = operation;
		Library def = (Library)op.eContainer();
		for(Library lib : linker.getLibraryPath(def)){
			for(LibraryItem li : lib.getItems()){
				if (li instanceof Operation){
					if (((Operation) li).getName().equals(op.getName())){
						return (Operation)li;
					}
				}
			}
		}
		return op;
	}
	
	public OperationCompiler getOperationCompiler(CodePlatform platform, OperationRole role, ISymbol...symbols) throws ECompilerException{
		Operation op = getOperation(role, symbols);
		if (op == null) return null;
		OperationCompiler opcomp = new OperationCompiler(platform, op);
		
		for(int i=0;i<symbols.length;i++){
			opcomp.addParameter(op.getParams().get(i), symbols[i]);
		}
		
		return opcomp;
	}
	
	public Operation getOperation(OperationRole role, ISymbol...symbols) throws ECompilerException{
		for(OperatorDefinition opdef : findDef(role)){
			for(Operation op : opdef.getCandidate()){
				if (checkOperation(op, symbols)) return op;
			}
		}
		return null;
	}
	
	private Collection<OperatorDefinition> findDefInLib(OperationRole role, Library lib){
		List<OperatorDefinition> opdefs = new ArrayList<OperatorDefinition>();
		for(LibraryItem li : lib.getItems()){
			if (li instanceof OperatorDefinition){
				if (role == ((OperatorDefinition) li).getRole()){
					opdefs.add((OperatorDefinition)li);
				}
			}
		}
		for(Library u : lib.getUse()){
			opdefs.addAll(findDefInLib(role, u));
		}
		return opdefs;
	}
	
	private Collection<OperatorDefinition> findDef(OperationRole role){
		List<OperatorDefinition> opdefs = new ArrayList<OperatorDefinition>();
		for(Library lib : usedlibs){
			opdefs.addAll(findDefInLib(role, lib));
		}
		return opdefs;
	}
	
	private boolean isAssignableTo(TypeDef to, TypeDef what){
		if (to instanceof RefTypeDef){
			if (what instanceof RefTypeDef){
				return ((RefTypeDef) to).getType().equals(((RefTypeDef) what).getType());
			}
		}
		if (to instanceof RefTypeDef){
			return isAssignableTo(((RefTypeDef) to).getType().getDef(), what);
		}
		if (what instanceof RefTypeDef){
			return isAssignableTo(to, ((RefTypeDef) what).getType().getDef());
		}
		if (to instanceof DataTypeDef){
			if (what instanceof DataTypeDef){
				return isAssignableToData((DataTypeDef)to, (DataTypeDef)what);
			}
			return false;
		}
		return false;
	}
	
	private boolean isAssignableTo(TypeDef to, BigDecimal value){
		if (to instanceof RefTypeDef){
			return isAssignableTo(((RefTypeDef) to).getType().getDef(), value);
		}
		if (to instanceof DataTypeDef){
			
			if (to instanceof IntegerDataTypeDef){
				if (value.scale() > 0) return false;
				if (((IntegerDataTypeDef) to).getKind() == IntegerKind.UNSIGNED){
					return value.signum() >= 0; 
				}else{
					return true;
				}
			}
			
			if (to instanceof FixedDataTypeDef){
				//TODO
			}
			
		}
		return false;
	}
	
	private boolean isAssignableToData(DataTypeDef to, DataTypeDef what){
		return what.getBits() <= to.getBits();
	}
	
	private boolean checkOperation(Operation op, ISymbol...symbols) throws ECompilerException{
		if (op.getParams().size() != symbols.length) return false;
		for(int i=0;i<symbols.length;i++){
			ParameterVariable pv = (ParameterVariable)op.getParams().get(i);
			ISymbol s = symbols[i];
			
			if (s instanceof ILiteralSymbol && s.isAssignableAt(SymbolContext.LINKTIME)){
				if (pv.getKind() == ParameterKind.VAR) return false;
			
				if (!isAssignableTo(pv.getType(), ((ILiteralSymbol)s).getValue())) return false;
			}else if (s instanceof IVariableSymbol){
				if (pv.getKind() == ParameterKind.CONST) return false;
				
				if (!isAssignableTo(pv.getType(), s.getType())) return false;
			}else if (s instanceof StructLiteralSymbol){
				if (pv.getKind() == ParameterKind.VAR) return false;
				
				if (!isAssignableTo(pv.getType(), s.getType())) return false;
			}else if (s instanceof ILinkTimeSymbol){
				if (pv.getKind() == ParameterKind.VAR) return false;
				
				if (!isAssignableTo(pv.getType(), s.getType())) return false;
			}else{
				throw new ECompilerException(op, "Unsupported operator symbol: "+s);
			}
		}
		return true;
	}
	
}
