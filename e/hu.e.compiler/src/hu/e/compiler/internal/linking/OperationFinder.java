/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.OperationCompiler;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.internal.model.symbols.impl.StructLiteralSymbol;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.TypeDef;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class OperationFinder {

	private final Collection<Library> usedlibs;
	
	public OperationFinder(Collection<Library> usedlibs) {
		this.usedlibs = usedlibs;
//		this.element = element;
//		EObject eo = element.eResource().getContents().get(0);
//		if (eo instanceof Package){
//			this.pack = (Package)eo;
//		}else{
//			throw new IllegalArgumentException(element+" is not contained by a namespace!");
//		}
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
	
	private boolean checkOperation(Operation op, ISymbol...symbols) throws ECompilerException{
		//if (op.eIsProxy()) op = (Operation) EcoreUtil2.resolve(op, pack);
		if (op.getParams().size() != symbols.length) return false;
		for(int i=0;i<symbols.length;i++){
			ParameterVariable pv = (ParameterVariable)op.getParams().get(i);
			ISymbol s = symbols[i];
			
			if (s instanceof ILiteralSymbol && s.isLiteral()){
				if (pv.getKind() == ParameterKind.VAR) return false;
				
				TypeDef td = pv.getType();
				
				if (td instanceof DataTypeDef){
					int bits = ((DataTypeDef) td).getBits();
					if (1<<bits <= ((ILiteralSymbol) s).getValue()) return false;
				}else{
					return false;
				}
				
			}else if (s instanceof IVariableSymbol){
				if (pv.getKind() == ParameterKind.CONST) return false;
				
				if (s.getType() != pv.getType()){
					return false;
				}
				
			}else if (s instanceof StructLiteralSymbol){
				if (pv.getKind() == ParameterKind.VAR) return false;
				
				if (s.getType() != pv.getType()){
					return false;
				}
			}else{
				throw new ECompilerException(op, "Unsupported operator symbol: "+s);
			}
		}
		return true;
	}
	
}
