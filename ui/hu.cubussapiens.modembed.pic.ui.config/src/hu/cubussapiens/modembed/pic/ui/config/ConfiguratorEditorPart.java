/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.config;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.EditorPart;

/**
 * @author balazs.grill
 *
 */
public class ConfiguratorEditorPart extends EditorPart implements IValueListener{

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		StringWriter sw = new StringWriter();
		try {
			properties.store(sw, "");
			file.setContents(new ByteArrayInputStream(sw.getBuffer().toString().getBytes()), true, true, monitor);
			dirty = false;
			firePropertyChange(PROP_DIRTY);
		} catch (Exception e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not save file",e));
		}

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	private IFile file;
	private Properties properties;
	
	private boolean dirty = false;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		
		if (input instanceof IFileEditorInput){
			
			setSite(site);
			setInput(input);
			
			file = ((IFileEditorInput) input).getFile();
			setPartName(file.getName());
			properties = new Properties();
			try {
				properties.load(file.getContents());
			} catch (Exception e) {
				throw new PartInitException("Could not load file", e);
			}
		}

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return dirty;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		FormToolkit tk = new FormToolkit(parent.getDisplay());
		parent.setLayout(new FillLayout());
		ScrolledForm form = tk.createScrolledForm(parent);
		form.getBody().setLayout(new FillLayout());
		form.setText("PIC Configurator");
		
		SashForm sash = new SashForm(form.getBody(), SWT.HORIZONTAL);
		
		Section s1 = tk.createSection(sash, Section.TITLE_BAR);
		s1.setText("Extract configuration from hexfile");
		Composite c1 = tk.createComposite(s1);
		s1.setClient(c1);
		c1.setLayout(new GridLayout(3, false));
		
		FilePropertyField inhex = new FilePropertyField(c1, file.getProject(), IPropertyConstants.PROP_EXTRACT_INPUT, "Input hex file:","hex");
		inhex.setValue(properties.getProperty(IPropertyConstants.PROP_EXTRACT_INPUT));
		inhex.addListener(this);
		FilePropertyField outconfig = new FilePropertyField(c1, file.getProject(), IPropertyConstants.PROP_EXTRACT_OUTPUT, "Config output:","config");
		outconfig.setValue(properties.getProperty(IPropertyConstants.PROP_EXTRACT_OUTPUT));
		outconfig.addListener(this);
		CPUTypePropertyField target = new CPUTypePropertyField(c1, IPropertyConstants.PROP_EXTRACT_CPU, "Target CPU");
		target.setValue(properties.getProperty(IPropertyConstants.PROP_EXTRACT_CPU));
		target.addListener(this);
		
		Label s1desc = tk.createLabel(c1, "Clicking on the button below, you can execute the extraction. " +
				"This loads the hex file, reads the configuration bits from it according to the given CPU type," +
				" which then will be saved as a configuration model into the given config file.", SWT.WRAP);
		s1desc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Button extract = tk.createButton(c1, "Extract", SWT.PUSH);
		extract.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Job job = new ExtractJob(file.getProject(), properties);
				job.setUser(true);
				job.schedule();
			}
		});
		extract.setImage(Activator.getDefault().getImageRegistry().get(Activator.IMAGE_EXTRACT));
		
		Section s2 = tk.createSection(sash, Section.TITLE_BAR);
		s2.setText("Insert configuration to hexfile");
		
		Composite c2 = tk.createComposite(s2);
		s2.setClient(c2);
		c2.setLayout(new GridLayout(3,false));
		
		FilePropertyField insertinhex = new FilePropertyField(c2, file.getProject(), IPropertyConstants.PROP_INSERT_INPUT, "Input data:", "hex");
		insertinhex.setValue(properties.getProperty(IPropertyConstants.PROP_INSERT_INPUT));
		insertinhex.addListener(this);
		
		FilePropertyField insertconfig = new FilePropertyField(c2, file.getProject(), IPropertyConstants.PROP_INSERT_CONFIG, "Configuration:", "config");
		insertconfig.setValue(properties.getProperty(IPropertyConstants.PROP_INSERT_CONFIG));
		insertconfig.addListener(this);
		
		FilePropertyField outhexfile = new FilePropertyField(c2, file.getProject(), IPropertyConstants.PROP_INSERT_OUTPUT, "Output hex file", "hex");
		outhexfile.setValue(properties.getProperty(IPropertyConstants.PROP_INSERT_OUTPUT));
		outhexfile.addListener(this);
		
		s1desc = tk.createLabel(c2, "To insert the configuration bits to a hex file, click on this button. " +
				"It loads the given hexfile, and inserts the appropriate bits or overwrites them if they're already" +
				"exists. The result is saved to the output hex file.", SWT.WRAP);
		s1desc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Button insert = tk.createButton(c2, "Insert", SWT.PUSH);
		insert.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Job job = new InsertJob(file.getProject(), properties);
				job.setUser(true);
				job.schedule();
			}
		});
		insert.setImage(Activator.getDefault().getImageRegistry().get(Activator.IMAGE_INSERT));

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void valueChanged(String property, String newvalue) {
		properties.put(property, newvalue);
		dirty = true;
		firePropertyChange(PROP_DIRTY);
	}

}
