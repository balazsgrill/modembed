/**
 */
package hu.modembed.syntax.impl;

import hu.modembed.syntax.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyntaxFactoryImpl extends EFactoryImpl implements SyntaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SyntaxFactory init() {
		try {
			SyntaxFactory theSyntaxFactory = (SyntaxFactory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/syntax"); 
			if (theSyntaxFactory != null) {
				return theSyntaxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SyntaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SyntaxPackage.SYNTAX_MODEL: return createSyntaxModel();
			case SyntaxPackage.TERMINAL: return createTerminal();
			case SyntaxPackage.REPLACE: return createReplace();
			case SyntaxPackage.RULE: return createRule();
			case SyntaxPackage.TERMINAL_ITEM: return createTerminalItem();
			case SyntaxPackage.NON_TERMINAL_ITEM: return createNonTerminalItem();
			case SyntaxPackage.SET_VALUE: return createSetValue();
			case SyntaxPackage.PUSH: return createPush();
			case SyntaxPackage.POP: return createPop();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxModel createSyntaxModel() {
		SyntaxModelImpl syntaxModel = new SyntaxModelImpl();
		return syntaxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replace createReplace() {
		ReplaceImpl replace = new ReplaceImpl();
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalItem createTerminalItem() {
		TerminalItemImpl terminalItem = new TerminalItemImpl();
		return terminalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminalItem createNonTerminalItem() {
		NonTerminalItemImpl nonTerminalItem = new NonTerminalItemImpl();
		return nonTerminalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValue createSetValue() {
		SetValueImpl setValue = new SetValueImpl();
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Push createPush() {
		PushImpl push = new PushImpl();
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pop createPop() {
		PopImpl pop = new PopImpl();
		return pop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxPackage getSyntaxPackage() {
		return (SyntaxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SyntaxPackage getPackage() {
		return SyntaxPackage.eINSTANCE;
	}

} //SyntaxFactoryImpl
