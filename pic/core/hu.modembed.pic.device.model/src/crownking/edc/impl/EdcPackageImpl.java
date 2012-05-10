/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import crownking.edc.EdcFactory;
import crownking.edc.EdcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdcPackageImpl extends EPackageImpl implements EdcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "edc.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjustPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasListType8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backbugVectorSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundDebugMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakpointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calDataMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calDataZoneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checksumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configFuseMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configFuseSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcrDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcrFieldDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcrFieldSemanticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcrModeListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcrModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceIDMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceIDSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devidToRevTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dprDataSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eeDataMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eeDataSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emulatorZoneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gprDataSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass illegalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinedSFRDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latchesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lcdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyAliasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationAliasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mirrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleExcludeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleImportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleMacroTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muxedSFRDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nmmrPlaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscillatorModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscillatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regardlessOfModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectSFRTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfrDataSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfrDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfrFieldDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfrFieldSemanticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfrModeListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfrModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testZoneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIDMemTraitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIDSectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vddTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualPinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vppTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass watchdogTimerTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see crownking.edc.EdcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdcPackageImpl() {
		super(eNS_URI, EdcFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EdcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static EdcPackage init() {
		if (isInited) return (EdcPackage)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI);

		// Obtain or create and register package
		EdcPackageImpl theEdcPackage = (EdcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EdcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EdcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theEdcPackage.loadPackage();

		// Fix loaded packages
		theEdcPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdcPackage.eNS_URI, theEdcPackage);
		return theEdcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjustPointType() {
		if (adjustPointTypeEClass == null) {
			adjustPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(0);
		}
		return adjustPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Mixed() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Group() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_DCRFieldSemantic() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_AliasList() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_SFRModeList() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_StimInfo() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_ModuleMacro() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_ModuleExclude() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_SFRDef() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_Checksum() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjustPointType_SFRFieldSemantic() {
        return (EReference)getAdjustPointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Access() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Begin() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Cname() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Desc() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_End() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Impl() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Ishidden() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Isidehidden() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Isindirect() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Islanghidden() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Islnaghidden() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Isvolatile() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Mask() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Mclr() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Modsrc() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Name() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Nzsize() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Nzwidth() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Offset() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Por() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdjustPointType_Regionidref() {
        return (EAttribute)getAdjustPointType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType() {
		if (aliasListTypeEClass == null) {
			aliasListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(1);
		}
		return aliasListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Mixed() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Group() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType_LegacyAlias() {
        return (EReference)getAliasListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType_MigrationAlias() {
        return (EReference)getAliasListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType_AliasList() {
        return (EReference)getAliasListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType_Checksum() {
        return (EReference)getAliasListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Beginaddr() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Checksumalgo() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Cname() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Desc() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Endaddr() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Ishidden() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Islanghidden() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_Oscmodeidref() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType_When() {
        return (EAttribute)getAliasListType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType1() {
		if (aliasListType1EClass == null) {
			aliasListType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(2);
		}
		return aliasListType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Mixed() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Group() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType1_LegacyAlias() {
        return (EReference)getAliasListType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType1_MigrationAlias() {
        return (EReference)getAliasListType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType1_AliasList() {
        return (EReference)getAliasListType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType1_Checksum() {
        return (EReference)getAliasListType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Beginaddr() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Checksumalgo() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Cname() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Desc() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Endaddr() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Ishidden() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Islanghidden() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_Oscmodeidref() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType1_When() {
        return (EAttribute)getAliasListType1().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType2() {
		if (aliasListType2EClass == null) {
			aliasListType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(3);
		}
		return aliasListType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Mixed() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Group() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType2_LegacyAlias() {
        return (EReference)getAliasListType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType2_MigrationAlias() {
        return (EReference)getAliasListType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType2_AliasList() {
        return (EReference)getAliasListType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType2_Checksum() {
        return (EReference)getAliasListType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Beginaddr() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Checksumalgo() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Cname() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Desc() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Endaddr() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Ishidden() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Islanghidden() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_Oscmodeidref() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType2_When() {
        return (EAttribute)getAliasListType2().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType3() {
		if (aliasListType3EClass == null) {
			aliasListType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(4);
		}
		return aliasListType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Mixed() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Group() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType3_LegacyAlias() {
        return (EReference)getAliasListType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType3_MigrationAlias() {
        return (EReference)getAliasListType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType3_AliasList() {
        return (EReference)getAliasListType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType3_Checksum() {
        return (EReference)getAliasListType3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Beginaddr() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Checksumalgo() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Cname() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Desc() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Endaddr() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Ishidden() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Islanghidden() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_Oscmodeidref() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType3_When() {
        return (EAttribute)getAliasListType3().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType4() {
		if (aliasListType4EClass == null) {
			aliasListType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(5);
		}
		return aliasListType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Mixed() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Group() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType4_LegacyAlias() {
        return (EReference)getAliasListType4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType4_MigrationAlias() {
        return (EReference)getAliasListType4().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType4_AliasList() {
        return (EReference)getAliasListType4().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType4_Checksum() {
        return (EReference)getAliasListType4().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Beginaddr() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Checksumalgo() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Cname() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Desc() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Endaddr() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Ishidden() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Islanghidden() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_Oscmodeidref() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType4_When() {
        return (EAttribute)getAliasListType4().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType5() {
		if (aliasListType5EClass == null) {
			aliasListType5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(6);
		}
		return aliasListType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Mixed() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Group() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType5_LegacyAlias() {
        return (EReference)getAliasListType5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType5_MigrationAlias() {
        return (EReference)getAliasListType5().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType5_AliasList() {
        return (EReference)getAliasListType5().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType5_Checksum() {
        return (EReference)getAliasListType5().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Beginaddr() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Checksumalgo() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Cname() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Desc() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Endaddr() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Ishidden() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Islanghidden() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_Oscmodeidref() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType5_When() {
        return (EAttribute)getAliasListType5().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType6() {
		if (aliasListType6EClass == null) {
			aliasListType6EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(7);
		}
		return aliasListType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Mixed() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Group() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType6_LegacyAlias() {
        return (EReference)getAliasListType6().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType6_MigrationAlias() {
        return (EReference)getAliasListType6().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType6_AliasList() {
        return (EReference)getAliasListType6().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType6_Checksum() {
        return (EReference)getAliasListType6().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Beginaddr() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Checksumalgo() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Cname() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Desc() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Endaddr() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Ishidden() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Islanghidden() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_Oscmodeidref() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType6_When() {
        return (EAttribute)getAliasListType6().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType7() {
		if (aliasListType7EClass == null) {
			aliasListType7EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(8);
		}
		return aliasListType7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Mixed() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Group() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType7_LegacyAlias() {
        return (EReference)getAliasListType7().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType7_MigrationAlias() {
        return (EReference)getAliasListType7().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType7_AliasList() {
        return (EReference)getAliasListType7().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType7_Checksum() {
        return (EReference)getAliasListType7().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Beginaddr() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Checksumalgo() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Cname() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Desc() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Endaddr() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Ishidden() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Islanghidden() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_Oscmodeidref() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType7_When() {
        return (EAttribute)getAliasListType7().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasListType8() {
		if (aliasListType8EClass == null) {
			aliasListType8EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(9);
		}
		return aliasListType8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasListType8_Group() {
        return (EAttribute)getAliasListType8().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType8_LegacyAlias() {
        return (EReference)getAliasListType8().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasListType8_MigrationAlias() {
        return (EReference)getAliasListType8().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchDefType() {
		if (archDefTypeEClass == null) {
			archDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(10);
		}
		return archDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchDefType_MemTraits() {
        return (EReference)getArchDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchDefType_Desc() {
        return (EAttribute)getArchDefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchDefType_Name() {
        return (EAttribute)getArchDefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBACKBUGVectorSectorType() {
		if (backbugVectorSectorTypeEClass == null) {
			backbugVectorSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(11);
		}
		return backbugVectorSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBACKBUGVectorSectorType_Value() {
        return (EAttribute)getBACKBUGVectorSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBACKBUGVectorSectorType_Beginaddr() {
        return (EAttribute)getBACKBUGVectorSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBACKBUGVectorSectorType_Endaddr() {
        return (EAttribute)getBACKBUGVectorSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBACKBUGVectorSectorType_Regionid() {
        return (EAttribute)getBACKBUGVectorSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackgroundDebugMemTraitsType() {
		if (backgroundDebugMemTraitsTypeEClass == null) {
			backgroundDebugMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(12);
		}
		return backgroundDebugMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundDebugMemTraitsType_Value() {
        return (EAttribute)getBackgroundDebugMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundDebugMemTraitsType_Locsize() {
        return (EAttribute)getBackgroundDebugMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundDebugMemTraitsType_Wordimpl() {
        return (EAttribute)getBackgroundDebugMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundDebugMemTraitsType_Wordinit() {
        return (EAttribute)getBackgroundDebugMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundDebugMemTraitsType_Wordsafe() {
        return (EAttribute)getBackgroundDebugMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundDebugMemTraitsType_Wordsize() {
        return (EAttribute)getBackgroundDebugMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakpointsType() {
		if (breakpointsTypeEClass == null) {
			breakpointsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(13);
		}
		return breakpointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpointsType_Value() {
        return (EAttribute)getBreakpointsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpointsType_Hasdatacapture() {
        return (EAttribute)getBreakpointsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpointsType_Hwbpcount() {
        return (EAttribute)getBreakpointsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpointsType_Idbyte() {
        return (EAttribute)getBreakpointsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalDataMemTraitsType() {
		if (calDataMemTraitsTypeEClass == null) {
			calDataMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(14);
		}
		return calDataMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataMemTraitsType_Value() {
        return (EAttribute)getCalDataMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataMemTraitsType_Locsize() {
        return (EAttribute)getCalDataMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataMemTraitsType_Wordimpl() {
        return (EAttribute)getCalDataMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataMemTraitsType_Wordinit() {
        return (EAttribute)getCalDataMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataMemTraitsType_Wordsafe() {
        return (EAttribute)getCalDataMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataMemTraitsType_Wordsize() {
        return (EAttribute)getCalDataMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalDataZoneType() {
		if (calDataZoneTypeEClass == null) {
			calDataZoneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(15);
		}
		return calDataZoneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataZoneType_Value() {
        return (EAttribute)getCalDataZoneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataZoneType_Beginaddr() {
        return (EAttribute)getCalDataZoneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataZoneType_Endaddr() {
        return (EAttribute)getCalDataZoneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataZoneType_Issection() {
        return (EAttribute)getCalDataZoneType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataZoneType_Regionid() {
        return (EAttribute)getCalDataZoneType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataZoneType_Sectiondesc() {
        return (EAttribute)getCalDataZoneType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalDataZoneType_Sectionname() {
        return (EAttribute)getCalDataZoneType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChecksumType() {
		if (checksumTypeEClass == null) {
			checksumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(16);
		}
		return checksumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_Mixed() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChecksumType_AliasList() {
        return (EReference)getChecksumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChecksumType_Checksum() {
        return (EReference)getChecksumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_Beginaddr() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_Checksumalgo() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_Cname() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_Desc() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_Endaddr() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_Islanghidden() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksumType_When() {
        return (EAttribute)getChecksumType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeMemTraitsType() {
		if (codeMemTraitsTypeEClass == null) {
			codeMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(17);
		}
		return codeMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeMemTraitsType_Value() {
        return (EAttribute)getCodeMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeMemTraitsType_Locsize() {
        return (EAttribute)getCodeMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeMemTraitsType_Wordimpl() {
        return (EAttribute)getCodeMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeMemTraitsType_Wordinit() {
        return (EAttribute)getCodeMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeMemTraitsType_Wordsafe() {
        return (EAttribute)getCodeMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeMemTraitsType_Wordsize() {
        return (EAttribute)getCodeMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSectorType() {
		if (codeSectorTypeEClass == null) {
			codeSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(18);
		}
		return codeSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSectorType_Value() {
        return (EAttribute)getCodeSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSectorType_Beginaddr() {
        return (EAttribute)getCodeSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSectorType_Endaddr() {
        return (EAttribute)getCodeSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSectorType_Issection() {
        return (EAttribute)getCodeSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSectorType_Regionid() {
        return (EAttribute)getCodeSectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSectorType_Sectiondesc() {
        return (EAttribute)getCodeSectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSectorType_Sectionname() {
        return (EAttribute)getCodeSectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigFuseMemTraitsType() {
		if (configFuseMemTraitsTypeEClass == null) {
			configFuseMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(19);
		}
		return configFuseMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseMemTraitsType_Value() {
        return (EAttribute)getConfigFuseMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseMemTraitsType_Locsize() {
        return (EAttribute)getConfigFuseMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseMemTraitsType_Unimplval() {
        return (EAttribute)getConfigFuseMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseMemTraitsType_Wordimpl() {
        return (EAttribute)getConfigFuseMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseMemTraitsType_Wordinit() {
        return (EAttribute)getConfigFuseMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseMemTraitsType_Wordsafe() {
        return (EAttribute)getConfigFuseMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseMemTraitsType_Wordsize() {
        return (EAttribute)getConfigFuseMemTraitsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigFuseSectorType() {
		if (configFuseSectorTypeEClass == null) {
			configFuseSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(20);
		}
		return configFuseSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigFuseSectorType_DCRDef() {
        return (EReference)getConfigFuseSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseSectorType_Beginaddr() {
        return (EAttribute)getConfigFuseSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseSectorType_Endaddr() {
        return (EAttribute)getConfigFuseSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFuseSectorType_Regionid() {
        return (EAttribute)getConfigFuseSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMemTraitsType() {
		if (dataMemTraitsTypeEClass == null) {
			dataMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(21);
		}
		return dataMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMemTraitsType_Value() {
        return (EAttribute)getDataMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMemTraitsType_Locsize() {
        return (EAttribute)getDataMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMemTraitsType_Wordimpl() {
        return (EAttribute)getDataMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMemTraitsType_Wordinit() {
        return (EAttribute)getDataMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMemTraitsType_Wordsafe() {
        return (EAttribute)getDataMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMemTraitsType_Wordsize() {
        return (EAttribute)getDataMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSpaceType() {
		if (dataSpaceTypeEClass == null) {
			dataSpaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(22);
		}
		return dataSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpaceType_RegardlessOfMode() {
        return (EReference)getDataSpaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSpaceType_TraditionalModeOnly() {
        return (EAttribute)getDataSpaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSpaceType_ExtendedModeOnly() {
        return (EAttribute)getDataSpaceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSpaceType_Endaddr() {
        return (EAttribute)getDataSpaceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCRDefType() {
		if (dcrDefTypeEClass == null) {
			dcrDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(23);
		}
		return dcrDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_AliasList() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRDefType_Illegal() {
        return (EReference)getDCRDefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRDefType_DCRModeList() {
        return (EReference)getDCRDefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Access() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Cname() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Default() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Desc() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Impl() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Name() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Nzwidth() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Unimplval() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Unused() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRDefType_Useinchecksum() {
        return (EAttribute)getDCRDefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCRFieldDefType() {
		if (dcrFieldDefTypeEClass == null) {
			dcrFieldDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(24);
		}
		return dcrFieldDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Mixed() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Group() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_DCRFieldSemantic() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_AliasList() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_SFRModeList() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_StimInfo() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_ModuleMacro() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_ModuleExclude() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_SFRDef() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_Checksum() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldDefType_SFRFieldSemantic() {
        return (EReference)getDCRFieldDefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Access() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Begin() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Cname() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Desc() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_End() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Impl() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Ishidden() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Isidehidden() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Isindirect() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Islanghidden() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Islnaghidden() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Isvolatile() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Mask() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Mclr() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Modsrc() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Name() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Nzsize() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Nzwidth() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Offset() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Por() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldDefType_Regionidref() {
        return (EAttribute)getDCRFieldDefType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCRFieldSemanticType() {
		if (dcrFieldSemanticTypeEClass == null) {
			dcrFieldSemanticTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(25);
		}
		return dcrFieldSemanticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Mixed() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldSemanticType_AliasList() {
        return (EReference)getDCRFieldSemanticType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRFieldSemanticType_Checksum() {
        return (EReference)getDCRFieldSemanticType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Beginaddr() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Checksumalgo() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Cname() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Desc() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Endaddr() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Ishidden() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Islanghidden() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_Oscmodeidref() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRFieldSemanticType_When() {
        return (EAttribute)getDCRFieldSemanticType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCRModeListType() {
		if (dcrModeListTypeEClass == null) {
			dcrModeListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(26);
		}
		return dcrModeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRModeListType_DCRMode() {
        return (EReference)getDCRModeListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCRModeType() {
		if (dcrModeTypeEClass == null) {
			dcrModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(27);
		}
		return dcrModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRModeType_Group() {
        return (EAttribute)getDCRModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRModeType_AdjustPoint() {
        return (EReference)getDCRModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCRModeType_DCRFieldDef() {
        return (EReference)getDCRModeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCRModeType_Id() {
        return (EAttribute)getDCRModeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceIDMemTraitsType() {
		if (deviceIDMemTraitsTypeEClass == null) {
			deviceIDMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(28);
		}
		return deviceIDMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDMemTraitsType_Value() {
        return (EAttribute)getDeviceIDMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDMemTraitsType_Locsize() {
        return (EAttribute)getDeviceIDMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDMemTraitsType_Wordimpl() {
        return (EAttribute)getDeviceIDMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDMemTraitsType_Wordinit() {
        return (EAttribute)getDeviceIDMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDMemTraitsType_Wordsafe() {
        return (EAttribute)getDeviceIDMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDMemTraitsType_Wordsize() {
        return (EAttribute)getDeviceIDMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceIDSectorType() {
		if (deviceIDSectorTypeEClass == null) {
			deviceIDSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(29);
		}
		return deviceIDSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Mixed() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceIDSectorType_DEVIDToRev() {
        return (EReference)getDeviceIDSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Beginaddr() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Endaddr() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Issection() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Mask() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Regionid() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Sectiondesc() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Sectionname() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceIDSectorType_Value() {
        return (EAttribute)getDeviceIDSectorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEVIDToRevType() {
		if (devidToRevTypeEClass == null) {
			devidToRevTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(30);
		}
		return devidToRevTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEVIDToRevType_Value() {
        return (EAttribute)getDEVIDToRevType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEVIDToRevType_Revlist() {
        return (EAttribute)getDEVIDToRevType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEVIDToRevType_Value1() {
        return (EAttribute)getDEVIDToRevType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(31);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PIC() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPRDataSectorType() {
		if (dprDataSectorTypeEClass == null) {
			dprDataSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(32);
		}
		return dprDataSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Mixed() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Group() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPRDataSectorType_SFRDef() {
        return (EReference)getDPRDataSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPRDataSectorType_AdjustPoint() {
        return (EReference)getDPRDataSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Bank() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Beginaddr() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Endaddr() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Regionid() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Shadowidref() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Shadowoffset() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPRDataSectorType_Shadowoffset1() {
        return (EAttribute)getDPRDataSectorType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEDataMemTraitsType() {
		if (eeDataMemTraitsTypeEClass == null) {
			eeDataMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(33);
		}
		return eeDataMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataMemTraitsType_Value() {
        return (EAttribute)getEEDataMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataMemTraitsType_Magicoffset() {
        return (EAttribute)getEEDataMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEDataSectorType() {
		if (eeDataSectorTypeEClass == null) {
			eeDataSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(34);
		}
		return eeDataSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataSectorType_Value() {
        return (EAttribute)getEEDataSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataSectorType_Beginaddr() {
        return (EAttribute)getEEDataSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataSectorType_Endaddr() {
        return (EAttribute)getEEDataSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataSectorType_Issection() {
        return (EAttribute)getEEDataSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataSectorType_Regionid() {
        return (EAttribute)getEEDataSectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataSectorType_Sectiondesc() {
        return (EAttribute)getEEDataSectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEDataSectorType_Sectionname() {
        return (EAttribute)getEEDataSectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmulatorZoneType() {
		if (emulatorZoneTypeEClass == null) {
			emulatorZoneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(35);
		}
		return emulatorZoneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Mixed() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Group() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmulatorZoneType_SFRDef() {
        return (EReference)getEmulatorZoneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmulatorZoneType_AdjustPoint() {
        return (EReference)getEmulatorZoneType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Bank() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Beginaddr() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Endaddr() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Regionid() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Shadowidref() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Shadowoffset() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmulatorZoneType_Shadowoffset1() {
        return (EAttribute)getEmulatorZoneType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPRDataSectorType() {
		if (gprDataSectorTypeEClass == null) {
			gprDataSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(36);
		}
		return gprDataSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Mixed() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Group() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPRDataSectorType_SFRDef() {
        return (EReference)getGPRDataSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGPRDataSectorType_AdjustPoint() {
        return (EReference)getGPRDataSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Bank() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Beginaddr() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Endaddr() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Regionid() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Shadowidref() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Shadowoffset() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPRDataSectorType_Shadowoffset1() {
        return (EAttribute)getGPRDataSectorType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIllegalType() {
		if (illegalTypeEClass == null) {
			illegalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(37);
		}
		return illegalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllegalType_Value() {
        return (EAttribute)getIllegalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllegalType_Desc() {
        return (EAttribute)getIllegalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllegalType_When() {
        return (EAttribute)getIllegalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportType() {
		if (importTypeEClass == null) {
			importTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(38);
		}
		return importTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportType_ModuleImport() {
        return (EReference)getImportType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinedSFRDefType() {
		if (joinedSFRDefTypeEClass == null) {
			joinedSFRDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(39);
		}
		return joinedSFRDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Mixed() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Group() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_DCRFieldSemantic() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_AliasList() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_SFRModeList() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_StimInfo() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_SFRDef() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_ModuleMacro() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_ModuleExclude() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_Checksum() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSFRDefType_SFRFieldSemantic() {
        return (EReference)getJoinedSFRDefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Access() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Begin() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Cname() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Desc() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_End() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Impl() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Ishidden() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Isidehidden() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Isindirect() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Islanghidden() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Islnaghidden() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Isvolatile() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Mask() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Mclr() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Modsrc() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Name() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Nzsize() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Nzwidth() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Offset() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Por() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSFRDefType_Regionidref() {
        return (EAttribute)getJoinedSFRDefType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatchesType() {
		if (latchesTypeEClass == null) {
			latchesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(40);
		}
		return latchesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatchesType_Value() {
        return (EAttribute)getLatchesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatchesType_Cfg() {
        return (EAttribute)getLatchesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatchesType_Eedata() {
        return (EAttribute)getLatchesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatchesType_Pgm() {
        return (EAttribute)getLatchesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatchesType_Rowerase() {
        return (EAttribute)getLatchesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatchesType_Userid() {
        return (EAttribute)getLatchesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLCDType() {
		if (lcdTypeEClass == null) {
			lcdTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(41);
		}
		return lcdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLCDType_Value() {
        return (EAttribute)getLCDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLCDType_Segcount() {
        return (EAttribute)getLCDType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyAliasType() {
		if (legacyAliasTypeEClass == null) {
			legacyAliasTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(42);
		}
		return legacyAliasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAliasType_Value() {
        return (EAttribute)getLegacyAliasType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAliasType_Cname() {
        return (EAttribute)getLegacyAliasType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemTraitsType() {
		if (memTraitsTypeEClass == null) {
			memTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(43);
		}
		return memTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_CodeMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_CalDataMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_BackgroundDebugMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_TestMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_UserIDMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_ConfigFuseMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_DeviceIDMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_EEDataMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemTraitsType_DataMemTraits() {
        return (EReference)getMemTraitsType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemTraitsType_Bankcount() {
        return (EAttribute)getMemTraitsType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemTraitsType_Hwstackdepth() {
        return (EAttribute)getMemTraitsType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrationAliasType() {
		if (migrationAliasTypeEClass == null) {
			migrationAliasTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(44);
		}
		return migrationAliasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationAliasType_Value() {
        return (EAttribute)getMigrationAliasType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationAliasType_Cname() {
        return (EAttribute)getMigrationAliasType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMirrorType() {
		if (mirrorTypeEClass == null) {
			mirrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(45);
		}
		return mirrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Mixed() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Group() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_DCRFieldSemantic() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_AliasList() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_SFRModeList() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_StimInfo() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_ModuleMacro() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_ModuleExclude() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_SFRDef() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_Checksum() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorType_SFRFieldSemantic() {
        return (EReference)getMirrorType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Access() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Begin() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Cname() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Desc() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_End() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Impl() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Ishidden() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Isidehidden() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Isindirect() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Islanghidden() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Islnaghidden() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Isvolatile() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Mask() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Mclr() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Modsrc() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Name() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Nzsize() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Nzwidth() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Offset() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Por() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMirrorType_Regionidref() {
        return (EAttribute)getMirrorType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleExcludeType() {
		if (moduleExcludeTypeEClass == null) {
			moduleExcludeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(46);
		}
		return moduleExcludeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleExcludeType_Value() {
        return (EAttribute)getModuleExcludeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleExcludeType_Impl() {
        return (EAttribute)getModuleExcludeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleExcludeType_Offset() {
        return (EAttribute)getModuleExcludeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleExcludeType_Replace() {
        return (EAttribute)getModuleExcludeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleExcludeType_With() {
        return (EAttribute)getModuleExcludeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleImportType() {
		if (moduleImportTypeEClass == null) {
			moduleImportTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(47);
		}
		return moduleImportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImportType_Value() {
        return (EAttribute)getModuleImportType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleImportType_Modsrc() {
        return (EAttribute)getModuleImportType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleMacroType() {
		if (moduleMacroTypeEClass == null) {
			moduleMacroTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(48);
		}
		return moduleMacroTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleMacroType_Value() {
        return (EAttribute)getModuleMacroType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleMacroType_Impl() {
        return (EAttribute)getModuleMacroType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleMacroType_Offset() {
        return (EAttribute)getModuleMacroType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleMacroType_Replace() {
        return (EAttribute)getModuleMacroType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleMacroType_With() {
        return (EAttribute)getModuleMacroType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleRefType() {
		if (moduleRefTypeEClass == null) {
			moduleRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(49);
		}
		return moduleRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Mixed() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Group() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_ModuleMacro() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_ModuleExclude() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_DCRFieldSemantic() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_AliasList() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_SFRModeList() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_StimInfo() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_SFRDef() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_Checksum() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefType_SFRFieldSemantic() {
        return (EReference)getModuleRefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Access() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Begin() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Cname() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Desc() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_End() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Impl() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Ishidden() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Isidehidden() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Isindirect() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Islanghidden() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Islnaghidden() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Isvolatile() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Mask() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Mclr() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Modsrc() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Name() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Nzsize() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Nzwidth() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Offset() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Por() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRefType_Regionidref() {
        return (EAttribute)getModuleRefType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuxedSFRDefType() {
		if (muxedSFRDefTypeEClass == null) {
			muxedSFRDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(50);
		}
		return muxedSFRDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Mixed() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Group() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_SelectSFR() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_DCRFieldSemantic() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_AliasList() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_SFRModeList() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_StimInfo() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_ModuleMacro() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_ModuleExclude() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_SFRDef() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_Checksum() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuxedSFRDefType_SFRFieldSemantic() {
        return (EReference)getMuxedSFRDefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Access() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Begin() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Cname() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Desc() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_End() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Impl() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Ishidden() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Isidehidden() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Isindirect() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Islanghidden() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Islnaghidden() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Isvolatile() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Mask() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Mclr() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Modsrc() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Name() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Nzsize() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Nzwidth() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Offset() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Por() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuxedSFRDefType_Regionidref() {
        return (EAttribute)getMuxedSFRDefType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNMMRPlaceType() {
		if (nmmrPlaceTypeEClass == null) {
			nmmrPlaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(51);
		}
		return nmmrPlaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNMMRPlaceType_ModuleRef() {
        return (EReference)getNMMRPlaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNMMRPlaceType_Regionid() {
        return (EAttribute)getNMMRPlaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscillatorModeType() {
		if (oscillatorModeTypeEClass == null) {
			oscillatorModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(52);
		}
		return oscillatorModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscillatorModeType_Value() {
        return (EAttribute)getOscillatorModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscillatorModeType_Id() {
        return (EAttribute)getOscillatorModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscillatorModeType_Max() {
        return (EAttribute)getOscillatorModeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscillatorModeType_Min() {
        return (EAttribute)getOscillatorModeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscillatorType() {
		if (oscillatorTypeEClass == null) {
			oscillatorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(53);
		}
		return oscillatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOscillatorType_OscillatorMode() {
        return (EReference)getOscillatorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPICType() {
		if (picTypeEClass == null) {
			picTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(54);
		}
		return picTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_Import() {
        return (EReference)getPICType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_Power() {
        return (EReference)getPICType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_Programming() {
        return (EReference)getPICType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_ArchDef() {
        return (EReference)getPICType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_Oscillator() {
        return (EReference)getPICType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_WatchdogTimer() {
        return (EReference)getPICType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_Breakpoints() {
        return (EReference)getPICType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_LCD() {
        return (EReference)getPICType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_ProgramSpace() {
        return (EReference)getPICType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_DataSpace() {
        return (EReference)getPICType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICType_PinList() {
        return (EReference)getPICType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Arch() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Desc() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Dsid() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Hasfreeze() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Informedby() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Isextended() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Name() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICType_Procid() {
        return (EAttribute)getPICType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinListType() {
		if (pinListTypeEClass == null) {
			pinListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(55);
		}
		return pinListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinListType_Pin() {
        return (EReference)getPinListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinType() {
		if (pinTypeEClass == null) {
			pinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(56);
		}
		return pinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinType_VirtualPin() {
        return (EReference)getPinType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerType() {
		if (powerTypeEClass == null) {
			powerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(57);
		}
		return powerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerType_VPP() {
        return (EReference)getPowerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerType_VDD() {
        return (EReference)getPowerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammingType() {
		if (programmingTypeEClass == null) {
			programmingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(58);
		}
		return programmingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Mixed() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammingType_Wait() {
        return (EReference)getProgrammingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammingType_Latches() {
        return (EReference)getProgrammingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Boundary() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Csumadd() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Erasealgo() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Haschecksum() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Hasrowerasecmd() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Hasvppfirst() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Lvpthresh() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Memtech() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Ovrpgm() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingType_Tries() {
        return (EAttribute)getProgrammingType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramSpaceType() {
		if (programSpaceTypeEClass == null) {
			programSpaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(59);
		}
		return programSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramSpaceType_Group() {
        return (EAttribute)getProgramSpaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_CodeSector() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_UserIDSector() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_TestZone() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_DeviceIDSector() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_ConfigFuseSector() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_BACKBUGVectorSector() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_CalDataZone() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramSpaceType_EEDataSector() {
        return (EReference)getProgramSpaceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegardlessOfModeType() {
		if (regardlessOfModeTypeEClass == null) {
			regardlessOfModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(60);
		}
		return regardlessOfModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegardlessOfModeType_Group() {
        return (EAttribute)getRegardlessOfModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegardlessOfModeType_NMMRPlace() {
        return (EReference)getRegardlessOfModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegardlessOfModeType_SFRDataSector() {
        return (EReference)getRegardlessOfModeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegardlessOfModeType_DPRDataSector() {
        return (EReference)getRegardlessOfModeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegardlessOfModeType_GPRDataSector() {
        return (EReference)getRegardlessOfModeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegardlessOfModeType_EmulatorZone() {
        return (EReference)getRegardlessOfModeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectSFRType() {
		if (selectSFRTypeEClass == null) {
			selectSFRTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(61);
		}
		return selectSFRTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectSFRType_SFRDef() {
        return (EReference)getSelectSFRType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFRDataSectorType() {
		if (sfrDataSectorTypeEClass == null) {
			sfrDataSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(62);
		}
		return sfrDataSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDataSectorType_Group() {
        return (EAttribute)getSFRDataSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDataSectorType_SFRDef() {
        return (EReference)getSFRDataSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDataSectorType_JoinedSFRDef() {
        return (EReference)getSFRDataSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDataSectorType_AdjustPoint() {
        return (EReference)getSFRDataSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDataSectorType_Mirror() {
        return (EReference)getSFRDataSectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDataSectorType_ModuleRef() {
        return (EReference)getSFRDataSectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDataSectorType_MuxedSFRDef() {
        return (EReference)getSFRDataSectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDataSectorType_Bank() {
        return (EAttribute)getSFRDataSectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDataSectorType_Beginaddr() {
        return (EAttribute)getSFRDataSectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDataSectorType_Endaddr() {
        return (EAttribute)getSFRDataSectorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDataSectorType_Regionid() {
        return (EAttribute)getSFRDataSectorType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFRDefType() {
		if (sfrDefTypeEClass == null) {
			sfrDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(63);
		}
		return sfrDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Mixed() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Group() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_DCRFieldSemantic() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_AliasList() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_SFRModeList() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_StimInfo() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_ModuleMacro() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_ModuleExclude() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_SFRDef() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_Checksum() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRDefType_SFRFieldSemantic() {
        return (EReference)getSFRDefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Access() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Begin() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Cname() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Desc() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_End() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Impl() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Ishidden() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Isidehidden() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Isindirect() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Islanghidden() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Islnaghidden() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Isvolatile() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Mask() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Mclr() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Modsrc() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Name() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Nzsize() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Nzwidth() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Offset() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Por() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRDefType_Regionidref() {
        return (EAttribute)getSFRDefType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFRFieldDefType() {
		if (sfrFieldDefTypeEClass == null) {
			sfrFieldDefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(64);
		}
		return sfrFieldDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Mixed() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Group() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_DCRFieldSemantic() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_AliasList() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_SFRModeList() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_StimInfo() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_ModuleMacro() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_ModuleExclude() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_SFRDef() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_Checksum() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRFieldDefType_SFRFieldSemantic() {
        return (EReference)getSFRFieldDefType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Access() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Begin() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Cname() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Desc() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_End() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Impl() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Ishidden() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Isidehidden() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Isindirect() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Islanghidden() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Islnaghidden() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Isvolatile() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Mask() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Mclr() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Modsrc() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Name() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Nzsize() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Nzwidth() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Offset() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Por() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldDefType_Regionidref() {
        return (EAttribute)getSFRFieldDefType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFRFieldSemanticType() {
		if (sfrFieldSemanticTypeEClass == null) {
			sfrFieldSemanticTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(65);
		}
		return sfrFieldSemanticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldSemanticType_Value() {
        return (EAttribute)getSFRFieldSemanticType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldSemanticType_Desc() {
        return (EAttribute)getSFRFieldSemanticType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRFieldSemanticType_When() {
        return (EAttribute)getSFRFieldSemanticType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFRModeListType() {
		if (sfrModeListTypeEClass == null) {
			sfrModeListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(66);
		}
		return sfrModeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeListType_Mixed() {
        return (EAttribute)getSFRModeListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRModeListType_SFRMode() {
        return (EReference)getSFRModeListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeListType_Stimpcfiles() {
        return (EAttribute)getSFRModeListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeListType_Stimregfiles() {
        return (EAttribute)getSFRModeListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeListType_Stimscl() {
        return (EAttribute)getSFRModeListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeListType_Stimtype() {
        return (EAttribute)getSFRModeListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFRModeType() {
		if (sfrModeTypeEClass == null) {
			sfrModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(67);
		}
		return sfrModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeType_Mixed() {
        return (EAttribute)getSFRModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeType_Group() {
        return (EAttribute)getSFRModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRModeType_AdjustPoint() {
        return (EReference)getSFRModeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFRModeType_SFRFieldDef() {
        return (EReference)getSFRModeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFRModeType_Id() {
        return (EAttribute)getSFRModeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimInfoType() {
		if (stimInfoTypeEClass == null) {
			stimInfoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(68);
		}
		return stimInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimInfoType_Value() {
        return (EAttribute)getStimInfoType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimInfoType_Stimpcfiles() {
        return (EAttribute)getStimInfoType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimInfoType_Stimregfiles() {
        return (EAttribute)getStimInfoType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimInfoType_Stimscl() {
        return (EAttribute)getStimInfoType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimInfoType_Stimtype() {
        return (EAttribute)getStimInfoType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestMemTraitsType() {
		if (testMemTraitsTypeEClass == null) {
			testMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(69);
		}
		return testMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMemTraitsType_Value() {
        return (EAttribute)getTestMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMemTraitsType_Locsize() {
        return (EAttribute)getTestMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMemTraitsType_Wordimpl() {
        return (EAttribute)getTestMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMemTraitsType_Wordinit() {
        return (EAttribute)getTestMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMemTraitsType_Wordsafe() {
        return (EAttribute)getTestMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMemTraitsType_Wordsize() {
        return (EAttribute)getTestMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestZoneType() {
		if (testZoneTypeEClass == null) {
			testZoneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(70);
		}
		return testZoneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestZoneType_Value() {
        return (EAttribute)getTestZoneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestZoneType_Beginaddr() {
        return (EAttribute)getTestZoneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestZoneType_Endaddr() {
        return (EAttribute)getTestZoneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestZoneType_Regionid() {
        return (EAttribute)getTestZoneType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIDMemTraitsType() {
		if (userIDMemTraitsTypeEClass == null) {
			userIDMemTraitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(71);
		}
		return userIDMemTraitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDMemTraitsType_Value() {
        return (EAttribute)getUserIDMemTraitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDMemTraitsType_Locsize() {
        return (EAttribute)getUserIDMemTraitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDMemTraitsType_Wordimpl() {
        return (EAttribute)getUserIDMemTraitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDMemTraitsType_Wordinit() {
        return (EAttribute)getUserIDMemTraitsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDMemTraitsType_Wordsafe() {
        return (EAttribute)getUserIDMemTraitsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDMemTraitsType_Wordsize() {
        return (EAttribute)getUserIDMemTraitsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIDSectorType() {
		if (userIDSectorTypeEClass == null) {
			userIDSectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(72);
		}
		return userIDSectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDSectorType_Value() {
        return (EAttribute)getUserIDSectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDSectorType_Beginaddr() {
        return (EAttribute)getUserIDSectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDSectorType_Endaddr() {
        return (EAttribute)getUserIDSectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDSectorType_Issection() {
        return (EAttribute)getUserIDSectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDSectorType_Regionid() {
        return (EAttribute)getUserIDSectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDSectorType_Sectiondesc() {
        return (EAttribute)getUserIDSectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIDSectorType_Sectionname() {
        return (EAttribute)getUserIDSectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDDType() {
		if (vddTypeEClass == null) {
			vddTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(73);
		}
		return vddTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDDType_Value() {
        return (EAttribute)getVDDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDDType_Maxdefaultvoltage() {
        return (EAttribute)getVDDType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDDType_Maxvoltage() {
        return (EAttribute)getVDDType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDDType_Mindefaultvoltage() {
        return (EAttribute)getVDDType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDDType_Minvoltage() {
        return (EAttribute)getVDDType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDDType_Nominalvoltage() {
        return (EAttribute)getVDDType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualPinType() {
		if (virtualPinTypeEClass == null) {
			virtualPinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(74);
		}
		return virtualPinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualPinType_Value() {
        return (EAttribute)getVirtualPinType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualPinType_Name() {
        return (EAttribute)getVirtualPinType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualPinType_Ppsval() {
        return (EAttribute)getVirtualPinType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPPType() {
		if (vppTypeEClass == null) {
			vppTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(75);
		}
		return vppTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPPType_Value() {
        return (EAttribute)getVPPType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPPType_Defaultvoltage() {
        return (EAttribute)getVPPType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPPType_Maxvoltage() {
        return (EAttribute)getVPPType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPPType_Minvoltage() {
        return (EAttribute)getVPPType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitType() {
		if (waitTypeEClass == null) {
			waitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(76);
		}
		return waitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Value() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Cfg() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Eedata() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Erase() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Lverase() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Lvpgm() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Pgm() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitType_Userid() {
        return (EAttribute)getWaitType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWatchdogTimerType() {
		if (watchdogTimerTypeEClass == null) {
			watchdogTimerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EdcPackage.eNS_URI).getEClassifiers().get(77);
		}
		return watchdogTimerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWatchdogTimerType_Value() {
        return (EAttribute)getWatchdogTimerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWatchdogTimerType_Min() {
        return (EAttribute)getWatchdogTimerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdcFactory getEdcFactory() {
		return (EdcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("crownking.edc." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //EdcPackageImpl
