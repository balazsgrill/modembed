/**
 * 
 */
package hu.modembed.debug.com.rs232;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Properties;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

/**
 * @author balazs.grill
 *
 */
public class RS232DebugConnectionConfigurationPane extends Composite implements
		IProgrammerInstanceConfigurationPane {

	private static final class SerialContentProvider implements
			ITreeContentProvider {
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean hasChildren(Object element) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object getParent(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return getAvailableSerialPorts().toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	/**
	 * @param parent
	 * @param style
	 */
	public RS232DebugConnectionConfigurationPane(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(3, false));
		
		Label l = new Label(this, SWT.NONE);
		l.setText("Serial device:");
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		Text device = new Text(this, SWT.BORDER);
		device.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		Button detect = new Button(this, SWT.PUSH);
		detect.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		
		detect.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new LabelProvider(), new SerialContentProvider());
				dialog.open();
			}
			
		});
	}

	/**
     * @return    A HashSet containing the CommPortIdentifier for all serial ports that are not currently being used.
     */
    public static HashSet<CommPortIdentifier> getAvailableSerialPorts() {
        HashSet<CommPortIdentifier> h = new HashSet<CommPortIdentifier>();
        Enumeration<?> thePorts = CommPortIdentifier.getPortIdentifiers();
        while (thePorts.hasMoreElements()) {
            CommPortIdentifier com = (CommPortIdentifier) thePorts.nextElement();
            switch (com.getPortType()) {
            case CommPortIdentifier.PORT_SERIAL:
                try {
                    CommPort thePort = com.open("CommUtil", 50);
                    thePort.close();
                    h.add(com);
                } catch (PortInUseException e) {
                    System.out.println("Port, "  + com.getName() + ", is in use.");
                } catch (Exception e) {
                    System.err.println("Failed to open port " +  com.getName());
                    e.printStackTrace();
                }
            }
        }
        return h;
    }

	
	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#getControl()
	 */
	@Override
	public Control getControl() {
		return this;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#setProperties(java.util.Properties)
	 */
	@Override
	public void setProperties(Properties props) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#getProperties()
	 */
	@Override
	public Properties getProperties() {
		Properties props = new Properties();
		return props;
	}

}
