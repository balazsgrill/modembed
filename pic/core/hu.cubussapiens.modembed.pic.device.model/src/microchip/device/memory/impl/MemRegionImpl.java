/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.generic.impl.IntRangeImpl;

import microchip.device.memory.MemRegion;
import microchip.device.memory.MemoryPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mem Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemRegionImpl extends IntRangeImpl implements MemRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.MEM_REGION;
	}

} //MemRegionImpl
