/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

/**
 * The TypeTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class TypeTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new hu.modembed.model.textnotations.type.mopp.TypeMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<hu.modembed.model.textnotations.type.mopp.TypeTaskItem> taskItems = new java.util.ArrayList<hu.modembed.model.textnotations.type.mopp.TypeTaskItem>();
		hu.modembed.model.textnotations.type.mopp.TypeTaskItemDetector taskItemDetector = new hu.modembed.model.textnotations.type.mopp.TypeTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String charset = resource.getCharset();
			String content = hu.modembed.model.textnotations.type.util.TypeStreamUtil.getContent(inputStream, charset);
			hu.modembed.model.textnotations.type.ITypeTextScanner lexer = new hu.modembed.model.textnotations.type.mopp.TypeMetaInformation().createLexer();
			lexer.setText(content);
			
			hu.modembed.model.textnotations.type.ITypeTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			hu.modembed.model.textnotations.type.mopp.TypePlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			hu.modembed.model.textnotations.type.mopp.TypePlugin.logError("Exception while searching for task items", e);
		}
		
		for (hu.modembed.model.textnotations.type.mopp.TypeTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new hu.modembed.model.textnotations.type.mopp.TypeMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
