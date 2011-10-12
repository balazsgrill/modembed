/**
 * 
 */
package hu.cubussapiens.modembed.model.editor.properties;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * @author balage
 *
 */
public class EAttributeChangeCommand extends AbstractCommand {

	private final EObject eobject;
	private final EAttribute attrib;
	private final String newvaluelabel;
	
	private Object oldvalue = null;
	private Object newvalue = null;
	
	public EAttributeChangeCommand(EObject eobject, EAttribute attrib, String newvalue) {
		this.eobject = eobject;
		this.attrib = attrib;
		this.newvaluelabel = newvalue;
		
	}
	
	@Override
	protected boolean prepare() {
		oldvalue = eobject.eGet(attrib);
		
		Class<?> type = attrib.getEAttributeType().getInstanceClass();
		if (String.class.equals(type)){
			newvalue = newvaluelabel;
			return true;
		}
		if (int.class.equals(type) || Integer.class.equals(type)){
			try{
				newvalue = Integer.parseInt(newvaluelabel);
				return true;
			}catch(NumberFormatException e){
				return false;
			}
		}
		if (long.class.equals(type) || Long.class.equals(type)){
			try{
				newvalue = Long.parseLong(newvaluelabel);
				return true;
			}catch(NumberFormatException e){
				return false;
			}
		}
		
		/* unknown data type */
		return false;
	}
	
	@Override
	public void undo() {
		eobject.eSet(attrib, oldvalue);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		eobject.eSet(attrib, newvalue);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		execute();
	}

}
