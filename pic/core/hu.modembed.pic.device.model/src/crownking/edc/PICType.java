/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIC Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.PICType#getImport <em>Import</em>}</li>
 *   <li>{@link crownking.edc.PICType#getPower <em>Power</em>}</li>
 *   <li>{@link crownking.edc.PICType#getProgramming <em>Programming</em>}</li>
 *   <li>{@link crownking.edc.PICType#getArchDef <em>Arch Def</em>}</li>
 *   <li>{@link crownking.edc.PICType#getOscillator <em>Oscillator</em>}</li>
 *   <li>{@link crownking.edc.PICType#getWatchdogTimer <em>Watchdog Timer</em>}</li>
 *   <li>{@link crownking.edc.PICType#getBreakpoints <em>Breakpoints</em>}</li>
 *   <li>{@link crownking.edc.PICType#getLCD <em>LCD</em>}</li>
 *   <li>{@link crownking.edc.PICType#getProgramSpace <em>Program Space</em>}</li>
 *   <li>{@link crownking.edc.PICType#getDataSpace <em>Data Space</em>}</li>
 *   <li>{@link crownking.edc.PICType#getPinList <em>Pin List</em>}</li>
 *   <li>{@link crownking.edc.PICType#getArch <em>Arch</em>}</li>
 *   <li>{@link crownking.edc.PICType#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.PICType#getDsid <em>Dsid</em>}</li>
 *   <li>{@link crownking.edc.PICType#getHasfreeze <em>Hasfreeze</em>}</li>
 *   <li>{@link crownking.edc.PICType#getInformedby <em>Informedby</em>}</li>
 *   <li>{@link crownking.edc.PICType#getIsextended <em>Isextended</em>}</li>
 *   <li>{@link crownking.edc.PICType#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.PICType#getProcid <em>Procid</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getPICType()
 * @model extendedMetaData="name='PICType' kind='elementOnly'"
 * @generated
 */
public interface PICType extends EObject {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.ImportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getPICType_Import()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Import' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Returns the value of the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' containment reference.
	 * @see #setPower(PowerType)
	 * @see crownking.edc.EdcPackage#getPICType_Power()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Power' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerType getPower();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getPower <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' containment reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(PowerType value);

	/**
	 * Returns the value of the '<em><b>Programming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programming</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programming</em>' containment reference.
	 * @see #setProgramming(ProgrammingType)
	 * @see crownking.edc.EdcPackage#getPICType_Programming()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Programming' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgrammingType getProgramming();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getProgramming <em>Programming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programming</em>' containment reference.
	 * @see #getProgramming()
	 * @generated
	 */
	void setProgramming(ProgrammingType value);

	/**
	 * Returns the value of the '<em><b>Arch Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arch Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch Def</em>' containment reference.
	 * @see #setArchDef(ArchDefType)
	 * @see crownking.edc.EdcPackage#getPICType_ArchDef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ArchDef' namespace='##targetNamespace'"
	 * @generated
	 */
	ArchDefType getArchDef();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getArchDef <em>Arch Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch Def</em>' containment reference.
	 * @see #getArchDef()
	 * @generated
	 */
	void setArchDef(ArchDefType value);

	/**
	 * Returns the value of the '<em><b>Oscillator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oscillator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscillator</em>' containment reference.
	 * @see #setOscillator(OscillatorType)
	 * @see crownking.edc.EdcPackage#getPICType_Oscillator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oscillator' namespace='##targetNamespace'"
	 * @generated
	 */
	OscillatorType getOscillator();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getOscillator <em>Oscillator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscillator</em>' containment reference.
	 * @see #getOscillator()
	 * @generated
	 */
	void setOscillator(OscillatorType value);

	/**
	 * Returns the value of the '<em><b>Watchdog Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watchdog Timer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watchdog Timer</em>' containment reference.
	 * @see #setWatchdogTimer(WatchdogTimerType)
	 * @see crownking.edc.EdcPackage#getPICType_WatchdogTimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WatchdogTimer' namespace='##targetNamespace'"
	 * @generated
	 */
	WatchdogTimerType getWatchdogTimer();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getWatchdogTimer <em>Watchdog Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watchdog Timer</em>' containment reference.
	 * @see #getWatchdogTimer()
	 * @generated
	 */
	void setWatchdogTimer(WatchdogTimerType value);

	/**
	 * Returns the value of the '<em><b>Breakpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakpoints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoints</em>' containment reference.
	 * @see #setBreakpoints(BreakpointsType)
	 * @see crownking.edc.EdcPackage#getPICType_Breakpoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Breakpoints' namespace='##targetNamespace'"
	 * @generated
	 */
	BreakpointsType getBreakpoints();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getBreakpoints <em>Breakpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoints</em>' containment reference.
	 * @see #getBreakpoints()
	 * @generated
	 */
	void setBreakpoints(BreakpointsType value);

	/**
	 * Returns the value of the '<em><b>LCD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCD</em>' containment reference.
	 * @see #setLCD(LCDType)
	 * @see crownking.edc.EdcPackage#getPICType_LCD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LCD' namespace='##targetNamespace'"
	 * @generated
	 */
	LCDType getLCD();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getLCD <em>LCD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LCD</em>' containment reference.
	 * @see #getLCD()
	 * @generated
	 */
	void setLCD(LCDType value);

	/**
	 * Returns the value of the '<em><b>Program Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Space</em>' containment reference.
	 * @see #setProgramSpace(ProgramSpaceType)
	 * @see crownking.edc.EdcPackage#getPICType_ProgramSpace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProgramSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramSpaceType getProgramSpace();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getProgramSpace <em>Program Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Space</em>' containment reference.
	 * @see #getProgramSpace()
	 * @generated
	 */
	void setProgramSpace(ProgramSpaceType value);

	/**
	 * Returns the value of the '<em><b>Data Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Space</em>' containment reference.
	 * @see #setDataSpace(DataSpaceType)
	 * @see crownking.edc.EdcPackage#getPICType_DataSpace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSpaceType getDataSpace();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getDataSpace <em>Data Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Space</em>' containment reference.
	 * @see #getDataSpace()
	 * @generated
	 */
	void setDataSpace(DataSpaceType value);

	/**
	 * Returns the value of the '<em><b>Pin List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin List</em>' containment reference.
	 * @see #setPinList(PinListType)
	 * @see crownking.edc.EdcPackage#getPICType_PinList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PinList' namespace='##targetNamespace'"
	 * @generated
	 */
	PinListType getPinList();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getPinList <em>Pin List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin List</em>' containment reference.
	 * @see #getPinList()
	 * @generated
	 */
	void setPinList(PinListType value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(String)
	 * @see crownking.edc.EdcPackage#getPICType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	String getArch();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see crownking.edc.EdcPackage#getPICType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Dsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsid</em>' attribute.
	 * @see #isSetDsid()
	 * @see #unsetDsid()
	 * @see #setDsid(int)
	 * @see crownking.edc.EdcPackage#getPICType_Dsid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='dsid'"
	 * @generated
	 */
	int getDsid();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getDsid <em>Dsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsid</em>' attribute.
	 * @see #isSetDsid()
	 * @see #unsetDsid()
	 * @see #getDsid()
	 * @generated
	 */
	void setDsid(int value);

	/**
	 * Unsets the value of the '{@link crownking.edc.PICType#getDsid <em>Dsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDsid()
	 * @see #getDsid()
	 * @see #setDsid(int)
	 * @generated
	 */
	void unsetDsid();

	/**
	 * Returns whether the value of the '{@link crownking.edc.PICType#getDsid <em>Dsid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dsid</em>' attribute is set.
	 * @see #unsetDsid()
	 * @see #getDsid()
	 * @see #setDsid(int)
	 * @generated
	 */
	boolean isSetDsid();

	/**
	 * Returns the value of the '<em><b>Hasfreeze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasfreeze</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasfreeze</em>' attribute.
	 * @see #setHasfreeze(String)
	 * @see crownking.edc.EdcPackage#getPICType_Hasfreeze()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hasfreeze'"
	 * @generated
	 */
	String getHasfreeze();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getHasfreeze <em>Hasfreeze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hasfreeze</em>' attribute.
	 * @see #getHasfreeze()
	 * @generated
	 */
	void setHasfreeze(String value);

	/**
	 * Returns the value of the '<em><b>Informedby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informedby</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informedby</em>' attribute.
	 * @see #setInformedby(String)
	 * @see crownking.edc.EdcPackage#getPICType_Informedby()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='informedby'"
	 * @generated
	 */
	String getInformedby();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getInformedby <em>Informedby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informedby</em>' attribute.
	 * @see #getInformedby()
	 * @generated
	 */
	void setInformedby(String value);

	/**
	 * Returns the value of the '<em><b>Isextended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isextended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isextended</em>' attribute.
	 * @see #setIsextended(String)
	 * @see crownking.edc.EdcPackage#getPICType_Isextended()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isextended'"
	 * @generated
	 */
	String getIsextended();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getIsextended <em>Isextended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isextended</em>' attribute.
	 * @see #getIsextended()
	 * @generated
	 */
	void setIsextended(String value);

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
	 * @see crownking.edc.EdcPackage#getPICType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Procid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procid</em>' attribute.
	 * @see #setProcid(String)
	 * @see crownking.edc.EdcPackage#getPICType_Procid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='procid'"
	 * @generated
	 */
	String getProcid();

	/**
	 * Sets the value of the '{@link crownking.edc.PICType#getProcid <em>Procid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procid</em>' attribute.
	 * @see #getProcid()
	 * @generated
	 */
	void setProcid(String value);

} // PICType
