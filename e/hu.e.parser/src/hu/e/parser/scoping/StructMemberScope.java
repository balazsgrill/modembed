/**
 * 
 */
package hu.e.parser.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

/**
 * @author balazs.grill
 *
 */
public class StructMemberScope extends AbstractScope {

	private final List<IEObjectDescription> descs = new ArrayList<IEObjectDescription>();
	
	/**
	 * @param parent
	 * @param ignoreCase
	 */
	public StructMemberScope(EObject eobject, IScope parent) {
		super(parent, false);
//		if (eobject instanceof StructRef){
//			EObject eo = eobject.eContainer();
//			if (eo instanceof VariableReference){
//				Type type = ((VariableReference) eo).getVar().getType();
//				for(VariableRefSection vrs : ((VariableReference) eo).getRef()){
//					if (vrs instanceof ArrayRef){
//						if (type.getDef() instanceof ArrayTypeDef){
//							type = ((ArrayTypeDef)type.getDef()).getType();
//						}else{
//							return;
//						}
//					}else
//					if (vrs instanceof StructRef){
//						if (type.getDef() instanceof StructTypeDef){
//							StructTypeDef std = (StructTypeDef)type.getDef();
//							if (vrs.equals(eobject)){
//								for(StructTypeDefMember m : std.getMembers()){
//									descs.add(EObjectDescription.create(m.getName(), m));
//								}
//								return;
//							}else{
//								type = ((StructRef) vrs).getRef().getType();
//							}
//						}else{
//							return;
//						}
//					}else
//						return;
//				}
//			}
//		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.impl.AbstractScope#getAllLocalElements()
	 */
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return descs;
	}

}
