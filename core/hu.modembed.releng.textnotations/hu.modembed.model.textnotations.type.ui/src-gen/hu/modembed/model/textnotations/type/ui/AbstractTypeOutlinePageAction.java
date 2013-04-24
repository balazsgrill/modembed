/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public abstract class AbstractTypeOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer;
	
	public AbstractTypeOutlinePageAction(hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = hu.modembed.model.textnotations.type.ui.TypeImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = hu.modembed.model.textnotations.type.ui.TypeUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			hu.modembed.model.textnotations.type.ui.TypeUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (hu.modembed.model.textnotations.type.ui.TypeOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
