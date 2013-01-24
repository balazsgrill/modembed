/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.editor;

import hu.modembed.model.editor.grass.GrassModelEditorPage;
import hu.modembed.model.editor.internal.PageDescriptor;
import hu.modembed.model.editor.internal.PageRegistry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;

/**
 * This is the central singleton for the Modembed editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ModembedEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModembedEditorPlugin INSTANCE = new ModembedEditorPlugin();
	
	public static Collection<IModelEditorPage> getEditorPages(EObject eobject){
		List<IModelEditorPage> pages = new ArrayList<IModelEditorPage>();
		
		for(PageDescriptor pd : PageRegistry.getInstance().getDescs()){
			if (pd.getModelclass().isInstance(eobject)){
				pages.add(pd.createPage());
			}
		}
		
		pages.add(new GenericTreeModelEditorPage());
		pages.add(new GrassModelEditorPage());
		return pages;
	}
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModembedEditorPlugin() {
		super
			(new ResourceLocator [] {
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
