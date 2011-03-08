/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.wizard;

import hu.cubussapiens.modembed.pic.PICPlugin;
import hu.cubussapiens.modembed.pic.ui.ContentProposedTextViewer;
import hu.cubussapiens.modembed.pic.ui.PicTargetContentProvider;
import hu.cubussapiens.modembed.pic.ui.PicTargetLabelProvider;
import hu.cubussapiens.modembed.ui.IProjectWizardExtension;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IPropertyListener;

import pic.PicCPUType;
import picproject.PICSettings;
import picproject.PicprojectFactory;
import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class PicProjectWizardExtension implements IProjectWizardExtension {

	private ContentProposedTextViewer tv;

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectWizardExtension#createControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public Control createControls(Composite parent) {
		Composite c = new Composite(parent, SWT.NONE);
		
		c.setLayout(new GridLayout(2, false));
		Label l = new Label(c, SWT.NONE);
		l.setText("PIC type:");
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		tv = new ContentProposedTextViewer(c, SWT.BORDER);
		tv.setContentProvider(new PicTargetContentProvider());
		tv.setLabelProvider(new PicTargetLabelProvider());
		tv.setInput(PICPlugin.getDefault().getDefinitions());
		tv.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object e = ((IStructuredSelection)tv.getSelection()).getFirstElement();
				selection = (e instanceof URL) ? (URL)e : null;
				for(IPropertyListener l : ls){
					l.propertyChanged(this, 0);
				}
			}
		});
		
		return c;
	}

	private URL selection = null;
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectWizardExtension#validate(org.eclipse.jface.wizard.WizardPage)
	 */
	@Override
	public boolean validate(WizardPage page) {
		
		if (selection == null){
			page.setMessage("Please Provide a valid CPU type");
			return false;
		}
		
		return true;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectWizardExtension#includeData(project.ProjectConfig)
	 */
	@Override
	public void includeData(ProjectConfig config) {
		if (selection != null){
			try {
				PicCPUType cpu = PICPlugin.getDefault().getCPUType(config.eResource().getResourceSet(), (URL)selection);
				PICSettings pc = PicprojectFactory.eINSTANCE.createPICSettings();
				pc.setCpu(cpu);
				pc.setConfiguration("default.config");
				config.getExtensions().add(pc);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private final Set<IPropertyListener> ls = new HashSet<IPropertyListener>();
	
	@Override
	public void addPropertyListener(IPropertyListener pl) {
		ls.add(pl);
	}

}
