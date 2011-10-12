/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip;

import microchip.device.Vdd;
import microchip.device.Vpp;

import microchip.device.config.CfgBits;

import microchip.device.memory.Breakpoints;
import microchip.device.memory.DevID;
import microchip.device.memory.MemRegion;
import microchip.device.memory.MirrorRegs;
import microchip.device.memory.Programming;
import microchip.device.memory.SFR;
import microchip.device.memory.UnusedRegs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.Device#getFormat <em>Format</em>}</li>
 *   <li>{@link microchip.Device#getVdd <em>Vdd</em>}</li>
 *   <li>{@link microchip.Device#getVpp <em>Vpp</em>}</li>
 *   <li>{@link microchip.Device#getCfgbits <em>Cfgbits</em>}</li>
 *   <li>{@link microchip.Device#getPgming <em>Pgming</em>}</li>
 *   <li>{@link microchip.Device#getPgmmem <em>Pgmmem</em>}</li>
 *   <li>{@link microchip.Device#getUserid <em>Userid</em>}</li>
 *   <li>{@link microchip.Device#getTestmem <em>Testmem</em>}</li>
 *   <li>{@link microchip.Device#getDevid <em>Devid</em>}</li>
 *   <li>{@link microchip.Device#getCfgmem <em>Cfgmem</em>}</li>
 *   <li>{@link microchip.Device#getEedata <em>Eedata</em>}</li>
 *   <li>{@link microchip.Device#getBkbgvectmem <em>Bkbgvectmem</em>}</li>
 *   <li>{@link microchip.Device#getSfrs <em>Sfrs</em>}</li>
 *   <li>{@link microchip.Device#getNumBanks <em>Num Banks</em>}</li>
 *   <li>{@link microchip.Device#getNumHWBP <em>Num HWBP</em>}</li>
 *   <li>{@link microchip.Device#getMirrors <em>Mirrors</em>}</li>
 *   <li>{@link microchip.Device#getUnused <em>Unused</em>}</li>
 *   <li>{@link microchip.Device#getNmmrs <em>Nmmrs</em>}</li>
 *   <li>{@link microchip.Device#getUnusedBankMask <em>Unused Bank Mask</em>}</li>
 *   <li>{@link microchip.Device#getAccessBankSplitOffset <em>Access Bank Split Offset</em>}</li>
 *   <li>{@link microchip.Device#getBreakpoints <em>Breakpoints</em>}</li>
 *   <li>{@link microchip.Device#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.MicrochipPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(String)
	 * @see microchip.MicrochipPackage#getDevice_Format()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link microchip.Device#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Unsets the value of the '{@link microchip.Device#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(String)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link microchip.Device#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(String)
	 * @generated
	 */
	boolean isSetFormat();

	/**
	 * Returns the value of the '<em><b>Vdd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vdd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vdd</em>' containment reference.
	 * @see #isSetVdd()
	 * @see #unsetVdd()
	 * @see #setVdd(Vdd)
	 * @see microchip.MicrochipPackage#getDevice_Vdd()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Vdd getVdd();

	/**
	 * Sets the value of the '{@link microchip.Device#getVdd <em>Vdd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vdd</em>' containment reference.
	 * @see #isSetVdd()
	 * @see #unsetVdd()
	 * @see #getVdd()
	 * @generated
	 */
	void setVdd(Vdd value);

	/**
	 * Unsets the value of the '{@link microchip.Device#getVdd <em>Vdd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVdd()
	 * @see #getVdd()
	 * @see #setVdd(Vdd)
	 * @generated
	 */
	void unsetVdd();

	/**
	 * Returns whether the value of the '{@link microchip.Device#getVdd <em>Vdd</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vdd</em>' containment reference is set.
	 * @see #unsetVdd()
	 * @see #getVdd()
	 * @see #setVdd(Vdd)
	 * @generated
	 */
	boolean isSetVdd();

	/**
	 * Returns the value of the '<em><b>Vpp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpp</em>' containment reference.
	 * @see #isSetVpp()
	 * @see #unsetVpp()
	 * @see #setVpp(Vpp)
	 * @see microchip.MicrochipPackage#getDevice_Vpp()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Vpp getVpp();

	/**
	 * Sets the value of the '{@link microchip.Device#getVpp <em>Vpp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpp</em>' containment reference.
	 * @see #isSetVpp()
	 * @see #unsetVpp()
	 * @see #getVpp()
	 * @generated
	 */
	void setVpp(Vpp value);

	/**
	 * Unsets the value of the '{@link microchip.Device#getVpp <em>Vpp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVpp()
	 * @see #getVpp()
	 * @see #setVpp(Vpp)
	 * @generated
	 */
	void unsetVpp();

	/**
	 * Returns whether the value of the '{@link microchip.Device#getVpp <em>Vpp</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vpp</em>' containment reference is set.
	 * @see #unsetVpp()
	 * @see #getVpp()
	 * @see #setVpp(Vpp)
	 * @generated
	 */
	boolean isSetVpp();

	/**
	 * Returns the value of the '<em><b>Cfgbits</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.config.CfgBits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfgbits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfgbits</em>' containment reference list.
	 * @see microchip.MicrochipPackage#getDevice_Cfgbits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CfgBits> getCfgbits();

	/**
	 * Returns the value of the '<em><b>Pgming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgming</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgming</em>' containment reference.
	 * @see #setPgming(Programming)
	 * @see microchip.MicrochipPackage#getDevice_Pgming()
	 * @model containment="true"
	 * @generated
	 */
	Programming getPgming();

	/**
	 * Sets the value of the '{@link microchip.Device#getPgming <em>Pgming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgming</em>' containment reference.
	 * @see #getPgming()
	 * @generated
	 */
	void setPgming(Programming value);

	/**
	 * Returns the value of the '<em><b>Pgmmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgmmem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgmmem</em>' containment reference.
	 * @see #setPgmmem(MemRegion)
	 * @see microchip.MicrochipPackage#getDevice_Pgmmem()
	 * @model containment="true"
	 * @generated
	 */
	MemRegion getPgmmem();

	/**
	 * Sets the value of the '{@link microchip.Device#getPgmmem <em>Pgmmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgmmem</em>' containment reference.
	 * @see #getPgmmem()
	 * @generated
	 */
	void setPgmmem(MemRegion value);

	/**
	 * Returns the value of the '<em><b>Userid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userid</em>' containment reference.
	 * @see #setUserid(MemRegion)
	 * @see microchip.MicrochipPackage#getDevice_Userid()
	 * @model containment="true"
	 * @generated
	 */
	MemRegion getUserid();

	/**
	 * Sets the value of the '{@link microchip.Device#getUserid <em>Userid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userid</em>' containment reference.
	 * @see #getUserid()
	 * @generated
	 */
	void setUserid(MemRegion value);

	/**
	 * Returns the value of the '<em><b>Testmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testmem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testmem</em>' containment reference.
	 * @see #setTestmem(MemRegion)
	 * @see microchip.MicrochipPackage#getDevice_Testmem()
	 * @model containment="true"
	 * @generated
	 */
	MemRegion getTestmem();

	/**
	 * Sets the value of the '{@link microchip.Device#getTestmem <em>Testmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testmem</em>' containment reference.
	 * @see #getTestmem()
	 * @generated
	 */
	void setTestmem(MemRegion value);

	/**
	 * Returns the value of the '<em><b>Devid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devid</em>' containment reference.
	 * @see #setDevid(DevID)
	 * @see microchip.MicrochipPackage#getDevice_Devid()
	 * @model containment="true"
	 * @generated
	 */
	DevID getDevid();

	/**
	 * Sets the value of the '{@link microchip.Device#getDevid <em>Devid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devid</em>' containment reference.
	 * @see #getDevid()
	 * @generated
	 */
	void setDevid(DevID value);

	/**
	 * Returns the value of the '<em><b>Cfgmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfgmem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfgmem</em>' containment reference.
	 * @see #setCfgmem(MemRegion)
	 * @see microchip.MicrochipPackage#getDevice_Cfgmem()
	 * @model containment="true"
	 * @generated
	 */
	MemRegion getCfgmem();

	/**
	 * Sets the value of the '{@link microchip.Device#getCfgmem <em>Cfgmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfgmem</em>' containment reference.
	 * @see #getCfgmem()
	 * @generated
	 */
	void setCfgmem(MemRegion value);

	/**
	 * Returns the value of the '<em><b>Eedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eedata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eedata</em>' containment reference.
	 * @see #setEedata(MemRegion)
	 * @see microchip.MicrochipPackage#getDevice_Eedata()
	 * @model containment="true"
	 * @generated
	 */
	MemRegion getEedata();

	/**
	 * Sets the value of the '{@link microchip.Device#getEedata <em>Eedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eedata</em>' containment reference.
	 * @see #getEedata()
	 * @generated
	 */
	void setEedata(MemRegion value);

	/**
	 * Returns the value of the '<em><b>Bkbgvectmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bkbgvectmem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bkbgvectmem</em>' containment reference.
	 * @see #setBkbgvectmem(MemRegion)
	 * @see microchip.MicrochipPackage#getDevice_Bkbgvectmem()
	 * @model containment="true"
	 * @generated
	 */
	MemRegion getBkbgvectmem();

	/**
	 * Sets the value of the '{@link microchip.Device#getBkbgvectmem <em>Bkbgvectmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bkbgvectmem</em>' containment reference.
	 * @see #getBkbgvectmem()
	 * @generated
	 */
	void setBkbgvectmem(MemRegion value);

	/**
	 * Returns the value of the '<em><b>Sfrs</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.memory.SFR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sfrs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sfrs</em>' containment reference list.
	 * @see microchip.MicrochipPackage#getDevice_Sfrs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SFR> getSfrs();

	/**
	 * Returns the value of the '<em><b>Num Banks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Banks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Banks</em>' attribute.
	 * @see #setNumBanks(int)
	 * @see microchip.MicrochipPackage#getDevice_NumBanks()
	 * @model
	 * @generated
	 */
	int getNumBanks();

	/**
	 * Sets the value of the '{@link microchip.Device#getNumBanks <em>Num Banks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Banks</em>' attribute.
	 * @see #getNumBanks()
	 * @generated
	 */
	void setNumBanks(int value);

	/**
	 * Returns the value of the '<em><b>Num HWBP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num HWBP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num HWBP</em>' attribute.
	 * @see #setNumHWBP(int)
	 * @see microchip.MicrochipPackage#getDevice_NumHWBP()
	 * @model
	 * @generated
	 */
	int getNumHWBP();

	/**
	 * Sets the value of the '{@link microchip.Device#getNumHWBP <em>Num HWBP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num HWBP</em>' attribute.
	 * @see #getNumHWBP()
	 * @generated
	 */
	void setNumHWBP(int value);

	/**
	 * Returns the value of the '<em><b>Mirrors</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.memory.MirrorRegs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mirrors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirrors</em>' containment reference list.
	 * @see microchip.MicrochipPackage#getDevice_Mirrors()
	 * @model containment="true"
	 * @generated
	 */
	EList<MirrorRegs> getMirrors();

	/**
	 * Returns the value of the '<em><b>Unused</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.memory.UnusedRegs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unused</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unused</em>' containment reference list.
	 * @see microchip.MicrochipPackage#getDevice_Unused()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnusedRegs> getUnused();

	/**
	 * Returns the value of the '<em><b>Nmmrs</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.memory.SFR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nmmrs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nmmrs</em>' containment reference list.
	 * @see microchip.MicrochipPackage#getDevice_Nmmrs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SFR> getNmmrs();

	/**
	 * Returns the value of the '<em><b>Unused Bank Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unused Bank Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unused Bank Mask</em>' attribute.
	 * @see #setUnusedBankMask(int)
	 * @see microchip.MicrochipPackage#getDevice_UnusedBankMask()
	 * @model
	 * @generated
	 */
	int getUnusedBankMask();

	/**
	 * Sets the value of the '{@link microchip.Device#getUnusedBankMask <em>Unused Bank Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unused Bank Mask</em>' attribute.
	 * @see #getUnusedBankMask()
	 * @generated
	 */
	void setUnusedBankMask(int value);

	/**
	 * Returns the value of the '<em><b>Access Bank Split Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Bank Split Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Bank Split Offset</em>' attribute.
	 * @see #setAccessBankSplitOffset(int)
	 * @see microchip.MicrochipPackage#getDevice_AccessBankSplitOffset()
	 * @model
	 * @generated
	 */
	int getAccessBankSplitOffset();

	/**
	 * Sets the value of the '{@link microchip.Device#getAccessBankSplitOffset <em>Access Bank Split Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Bank Split Offset</em>' attribute.
	 * @see #getAccessBankSplitOffset()
	 * @generated
	 */
	void setAccessBankSplitOffset(int value);

	/**
	 * Returns the value of the '<em><b>Breakpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakpoints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoints</em>' containment reference.
	 * @see #setBreakpoints(Breakpoints)
	 * @see microchip.MicrochipPackage#getDevice_Breakpoints()
	 * @model containment="true"
	 * @generated
	 */
	Breakpoints getBreakpoints();

	/**
	 * Sets the value of the '{@link microchip.Device#getBreakpoints <em>Breakpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoints</em>' containment reference.
	 * @see #getBreakpoints()
	 * @generated
	 */
	void setBreakpoints(Breakpoints value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see microchip.MicrochipPackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link microchip.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Device
