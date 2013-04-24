/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

/**
 * Helper class to add markers to text files based on EMF's
 * <code>org.eclipse.emf.ecore.resource.Resource.Diagnostic</code>. If a resource
 * contains
 * <code>hu.modembed.model.textnotations.device.IDeviceTextDiagnostic</code>s it
 * uses the more precise information of this extended diagnostic type.
 */
public class DeviceMarkerHelper {
	
	/**
	 * The extension id of the custom marker type that is used by this text resource.
	 */
	public static final String MARKER_TYPE = hu.modembed.model.textnotations.device.mopp.DevicePlugin.PLUGIN_ID + ".problem";
	
	/**
	 * The total number of markers per file is restricted with this constant.
	 * Restriction is needed because the performance of Eclipse decreases drastically
	 * if large amounts of markers are added to files.
	 */
	public static int MAXIMUM_MARKERS = 500;
	
	/**
	 * We use a queue to aggregate commands that create or remove markers. This is
	 * basically for performance reasons. Without the queue we would need to create a
	 * job for each marker creation/removal, which creates tons of threads and takes
	 * very long time.
	 */
	private final static MarkerCommandQueue COMMAND_QUEUE = new MarkerCommandQueue();
	
	public static class MutexRule implements org.eclipse.core.runtime.jobs.ISchedulingRule {
		
		public boolean isConflicting(org.eclipse.core.runtime.jobs.ISchedulingRule rule) {
			return rule == this;
		}
		
		public boolean contains(org.eclipse.core.runtime.jobs.ISchedulingRule rule) {
			return rule == this;
		}
	}
	
	private static class MarkerCommandQueue {
		
		private java.util.List<hu.modembed.model.textnotations.device.IDeviceCommand<Object>> commands = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceCommand<Object>>();
		
		private MutexRule schedulingRule = new MutexRule();
		
		public void addCommand(hu.modembed.model.textnotations.device.IDeviceCommand<Object> command) {
			synchronized(commands) {
				commands.add(command);
				// we only need to schedule a job, if the queue was empty
				if (commands.size() == 1) {
					scheduleRunCommandsJob();
				}
			}
		}
		
		private void scheduleRunCommandsJob() {
			org.eclipse.core.runtime.jobs.Job job = new org.eclipse.core.runtime.jobs.Job("updating markers") {
				@Override				
				protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
					runCommands();
					return org.eclipse.core.runtime.Status.OK_STATUS;
				}
			};
			job.setRule(schedulingRule);
			job.schedule();
		}
		
		public void runCommands() {
			java.util.List<hu.modembed.model.textnotations.device.IDeviceCommand<Object>> commandsToProcess = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceCommand<Object>>();
			synchronized(commands) {
				commandsToProcess.addAll(commands);
				commands.clear();
			}
			for (hu.modembed.model.textnotations.device.IDeviceCommand<Object> command : commandsToProcess) {
				command.execute(null);
			}
		}
		
	}
	
	/**
	 * Creates a marker from the given diagnostics object and attaches the marker to
	 * the resource. Markers are created and removed asynchronously. Thus, they may
	 * not appear when calls to this method return. But, the order of marker additions
	 * and removals is preserved.
	 * 
	 * @param resource The resource that is the file to mark.
	 * @param diagnostic The diagnostic with information for the marker.
	 */
	public void mark(org.eclipse.emf.ecore.resource.Resource resource, hu.modembed.model.textnotations.device.IDeviceTextDiagnostic diagnostic) {
		final org.eclipse.core.resources.IFile file = getFile(resource);
		if (file == null) {
			return;
		}
		createMarkerFromDiagnostic(file, diagnostic);
	}
	
	protected void createMarkerFromDiagnostic(final org.eclipse.core.resources.IFile file, final hu.modembed.model.textnotations.device.IDeviceTextDiagnostic diagnostic) {
		final hu.modembed.model.textnotations.device.IDeviceProblem problem = diagnostic.getProblem();
		hu.modembed.model.textnotations.device.DeviceEProblemType problemType = problem.getType();
		final String markerID = getMarkerID(problemType);
		COMMAND_QUEUE.addCommand(new hu.modembed.model.textnotations.device.IDeviceCommand<Object>() {
			public boolean execute(Object context) {
				try {
					// if there are too many markers, we do not add new ones
					if (file.findMarkers(markerID, false, org.eclipse.core.resources.IResource.DEPTH_ZERO).length >= MAXIMUM_MARKERS) {
						return true;
					}
					
					org.eclipse.core.resources.IMarker marker = file.createMarker(markerID);
					if (problem.getSeverity() == hu.modembed.model.textnotations.device.DeviceEProblemSeverity.ERROR) {
						marker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY, org.eclipse.core.resources.IMarker.SEVERITY_ERROR);
					} else {
						marker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY, org.eclipse.core.resources.IMarker.SEVERITY_WARNING);
					}
					marker.setAttribute(org.eclipse.core.resources.IMarker.MESSAGE, diagnostic.getMessage());
					hu.modembed.model.textnotations.device.IDeviceTextDiagnostic textDiagnostic = (hu.modembed.model.textnotations.device.IDeviceTextDiagnostic) diagnostic;
					marker.setAttribute(org.eclipse.core.resources.IMarker.LINE_NUMBER, textDiagnostic.getLine());
					marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_START, textDiagnostic.getCharStart());
					marker.setAttribute(org.eclipse.core.resources.IMarker.CHAR_END, textDiagnostic.getCharEnd() + 1);
					if (diagnostic instanceof hu.modembed.model.textnotations.device.mopp.DeviceResource.ElementBasedTextDiagnostic) {
						org.eclipse.emf.ecore.EObject element = ((hu.modembed.model.textnotations.device.mopp.DeviceResource.ElementBasedTextDiagnostic) diagnostic).getElement();
						String elementURI = getObjectURI(element);
						if (elementURI != null) {
							marker.setAttribute(org.eclipse.emf.ecore.util.EcoreValidator.URI_ATTRIBUTE, elementURI);
						}
					}
					java.util.Collection<hu.modembed.model.textnotations.device.IDeviceQuickFix> quickFixes = textDiagnostic.getProblem().getQuickFixes();
					java.util.Collection<Object> sourceIDs = new java.util.ArrayList<Object>();
					if (quickFixes != null) {
						for (hu.modembed.model.textnotations.device.IDeviceQuickFix quickFix : quickFixes) {
							if (quickFix != null) {
								sourceIDs.add(quickFix.getContextAsString());
							}
						}
					}
					if (!sourceIDs.isEmpty()) {
						marker.setAttribute(org.eclipse.core.resources.IMarker.SOURCE_ID, hu.modembed.model.textnotations.device.util.DeviceStringUtil.explode(sourceIDs, "|"));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					handleException(ce);
				}
				return true;
			}
		});
	}
	
	/**
	 * Removes all markers from the given resource regardless of their type. Markers
	 * are created and removed asynchronously. Thus, they may not appear when calls to
	 * this method return. But, the order of marker additions and removals is
	 * preserved.
	 * 
	 * @param resource The resource where to delete markers from
	 */
	public void unmark(org.eclipse.emf.ecore.resource.Resource resource) {
		for (hu.modembed.model.textnotations.device.DeviceEProblemType nextType : hu.modembed.model.textnotations.device.DeviceEProblemType.values()) {
			unmark(resource, nextType);
		}
	}
	
	/**
	 * Removes all markers of the given type from the given resource. Markers are
	 * created and removed asynchronously. Thus, they may not appear when calls to
	 * this method return. But, the order of marker additions and removals is
	 * preserved.
	 * 
	 * @param resource The resource where to delete markers from
	 * @param problemType The type of problem to remove
	 */
	public void unmark(org.eclipse.emf.ecore.resource.Resource resource, hu.modembed.model.textnotations.device.DeviceEProblemType problemType) {
		final org.eclipse.core.resources.IFile file = getFile(resource);
		if (file == null) {
			return;
		}
		final String markerType = getMarkerID(problemType);
		COMMAND_QUEUE.addCommand(new hu.modembed.model.textnotations.device.IDeviceCommand<Object>() {
			public boolean execute(Object context) {
				try {
					file.deleteMarkers(markerType, false, org.eclipse.core.resources.IResource.DEPTH_ZERO);
				} catch (org.eclipse.core.runtime.CoreException ce) {
					handleException(ce);
				}
				return true;
			}
		});
	}
	
	/**
	 * Removes all markers that were caused by the given object from the resource.
	 * Markers are created and removed asynchronously. Thus, they may not appear when
	 * calls to this method return. But, the order of marker additions and removals is
	 * preserved.
	 * 
	 * @param resource The resource where to delete markers from
	 * @param causingObject The cause of the problems to remove
	 */
	public void unmark(org.eclipse.emf.ecore.resource.Resource resource, final org.eclipse.emf.ecore.EObject causingObject) {
		final org.eclipse.core.resources.IFile file = getFile(resource);
		if (file == null) {
			return;
		}
		final String markerID = getMarkerID(hu.modembed.model.textnotations.device.DeviceEProblemType.UNKNOWN);
		final String causingObjectURI = getObjectURI(causingObject);
		if (causingObjectURI == null) {
			return;
		}
		COMMAND_QUEUE.addCommand(new hu.modembed.model.textnotations.device.IDeviceCommand<Object>() {
			public boolean execute(Object context) {
				try {
					org.eclipse.core.resources.IMarker[] markers = file.findMarkers(markerID, true, org.eclipse.core.resources.IResource.DEPTH_ZERO);
					for (org.eclipse.core.resources.IMarker marker : markers) {
						if (causingObjectURI.equals(marker.getAttribute(org.eclipse.emf.ecore.util.EcoreValidator.URI_ATTRIBUTE))) {
							marker.delete();
						}
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					handleException(ce);
				}
				return true;
			}
		});
	}
	
	/**
	 * Returns the ID of the marker type that is used to indicate problems of the
	 * given type.
	 */
	public String getMarkerID(hu.modembed.model.textnotations.device.DeviceEProblemType problemType) {
		String markerID = MARKER_TYPE;
		String typeID = problemType.getID();
		if (!"".equals(typeID)) {
			markerID += "." + typeID;
		}
		return markerID;
	}
	
	/**
	 * Tries to determine the file for the given resource. If the platform is not
	 * running, the resource is not a platform resource, or the resource cannot be
	 * found in the workspace, this method returns <code>null</code>.
	 */
	protected org.eclipse.core.resources.IFile getFile(org.eclipse.emf.ecore.resource.Resource resource) {
		if (resource == null || !org.eclipse.core.runtime.Platform.isRunning()) {
			return null;
		}
		String platformString = resource.getURI().toPlatformString(true);
		if (platformString == null) {
			return null;
		}
		org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		return file;
	}
	
	/**
	 * Returns an URI that identifies the given object.
	 */
	protected String getObjectURI(org.eclipse.emf.ecore.EObject object) {
		if (object == null) {
			return null;
		}
		if (object.eIsProxy() && object instanceof org.eclipse.emf.ecore.impl.BasicEObjectImpl) {
			return ((org.eclipse.emf.ecore.impl.BasicEObjectImpl) object).eProxyURI().toString();
		}
		org.eclipse.emf.ecore.resource.Resource eResource = object.eResource();
		if (eResource == null) {
			return null;
		}
		return eResource.getURI().toString() + "#" + eResource.getURIFragment(object);
	}
	
	protected void handleException(org.eclipse.core.runtime.CoreException ce) {
		if (ce.getMessage().matches("Marker.*not found.")) {
			// ignore
		}else if (ce.getMessage().matches("Resource.*does not exist.")) {
			// ignore
		} else {
			new hu.modembed.model.textnotations.device.util.DeviceRuntimeUtil().logError("Error while removing markers from resource:", ce);
		}
	}
	
	/**
	 * Removes all markers of the given type from the given resource. Markers are
	 * created and removed asynchronously. Thus, they may not appear when calls to
	 * this method return. But, the order of marker additions and removals is
	 * preserved.
	 * 
	 * @param resource The resource where to delete markers from
	 * @param markerId The id of the marker type to remove
	 */
	public void removeAllMarkers(final org.eclipse.core.resources.IResource resource, final String markerId) {
		if (resource == null) {
			return;
		}
		COMMAND_QUEUE.addCommand(new hu.modembed.model.textnotations.device.IDeviceCommand<Object>() {
			public boolean execute(Object context) {
				try {
					resource.deleteMarkers(markerId, false, org.eclipse.core.resources.IResource.DEPTH_ZERO);
				} catch (org.eclipse.core.runtime.CoreException ce) {
					handleException(ce);
				}
				return true;
			}
		});
	}
	
	public void createMarker(final org.eclipse.core.resources.IResource resource, final String markerId, final java.util.Map<String, Object> markerAttributes) {
		if (resource == null) {
			return;
		}
		
		COMMAND_QUEUE.addCommand(new hu.modembed.model.textnotations.device.IDeviceCommand<Object>() {
			public boolean execute(Object context) {
				try {
					org.eclipse.core.resources.IMarker marker = resource.createMarker(markerId);
					for (String key : markerAttributes.keySet()) {
						marker.setAttribute(key, markerAttributes.get(key));
					}
					return true;
				} catch (org.eclipse.core.runtime.CoreException e) {
					hu.modembed.model.textnotations.device.mopp.DevicePlugin.logError("Can't create marker.", e);
					return false;
				}
			}
		});
	}
	
	public void beginDeferMarkerUpdates() {
	}
	
	public void endDeferMarkerUpdates() {
	}
	
	public void runCommands() {
		COMMAND_QUEUE.runCommands();
	}
	
}
