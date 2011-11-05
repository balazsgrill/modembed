/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch.programmers;

import java.net.URL;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.RegisteredProgrammer;
import hu.cubussapiens.modembed.ui.MODembedUI;
import hu.cubussapiens.modembed.ui.launch.control.ProgrammerConfiguration;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author balazs.grill
 *
 */
public class ProgrammersLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof ProgrammerConfiguration){
			return getText(((ProgrammerConfiguration) element).getInstance());
		}
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof ProgrammerConfiguration){
			return getImage(((ProgrammerConfiguration) element).getInstance());
		}
		if (element instanceof IProgrammerInstance){
			IProgrammerInstance pd = (IProgrammerInstance)element;
			RegisteredProgrammer rp = MODembedCore.getDefault().getProgrammerRegistry().getProgrammer(pd.getType().getID());
			if (rp != null){
				URL url = rp.getImage();
				if (url != null){
					return MODembedUI.getDefault().getSharedImage(url);
				}
			}
		}
		return super.getImage(element);
	}
	
}
