/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch.programmers;

import java.net.URL;

import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.RegisteredProgrammer;
import hu.cubussapiens.modembed.ui.MODembedUI;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author balazs.grill
 *
 */
public class ProgrammersLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof ProgrammerDescriptor){
			ProgrammerDescriptor pd = (ProgrammerDescriptor)element;
			return pd.pi.toString();
		}
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof ProgrammerDescriptor){
			ProgrammerDescriptor pd = (ProgrammerDescriptor)element;
			RegisteredProgrammer rp = MODembedCore.getDefault().getProgrammerRegistry().getProgrammer(pd.id);
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
