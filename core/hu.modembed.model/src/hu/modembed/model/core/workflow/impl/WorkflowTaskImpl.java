/**
 */
package hu.modembed.model.core.workflow.impl;

import hu.modembed.model.core.impl.MODembedElementImpl;

import hu.modembed.model.core.workflow.WorkflowPackage;
import hu.modembed.model.core.workflow.WorkflowTask;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class WorkflowTaskImpl extends MODembedElementImpl implements WorkflowTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_TASK;
	}

} //WorkflowTaskImpl
