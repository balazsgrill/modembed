/**
 */
package hu.modembed.model.core.impl;

import hu.modembed.model.core.CorePackage;
import hu.modembed.model.core.TextOrigin;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Origin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.core.impl.TextOriginImpl#getPath <em>Path</em>}</li>
 *   <li>{@link hu.modembed.model.core.impl.TextOriginImpl#getLine <em>Line</em>}</li>
 *   <li>{@link hu.modembed.model.core.impl.TextOriginImpl#getCharStart <em>Char Start</em>}</li>
 *   <li>{@link hu.modembed.model.core.impl.TextOriginImpl#getCharEnd <em>Char End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextOriginImpl extends OriginImpl implements TextOrigin {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharStart() <em>Char Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharStart()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAR_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCharStart() <em>Char Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharStart()
	 * @generated
	 * @ordered
	 */
	protected int charStart = CHAR_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharEnd() <em>Char End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAR_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCharEnd() <em>Char End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEnd()
	 * @generated
	 * @ordered
	 */
	protected int charEnd = CHAR_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextOriginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TEXT_ORIGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TEXT_ORIGIN__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TEXT_ORIGIN__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharStart() {
		return charStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharStart(int newCharStart) {
		int oldCharStart = charStart;
		charStart = newCharStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TEXT_ORIGIN__CHAR_START, oldCharStart, charStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharEnd() {
		return charEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharEnd(int newCharEnd) {
		int oldCharEnd = charEnd;
		charEnd = newCharEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TEXT_ORIGIN__CHAR_END, oldCharEnd, charEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TEXT_ORIGIN__PATH:
				return getPath();
			case CorePackage.TEXT_ORIGIN__LINE:
				return getLine();
			case CorePackage.TEXT_ORIGIN__CHAR_START:
				return getCharStart();
			case CorePackage.TEXT_ORIGIN__CHAR_END:
				return getCharEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.TEXT_ORIGIN__PATH:
				setPath((String)newValue);
				return;
			case CorePackage.TEXT_ORIGIN__LINE:
				setLine((Integer)newValue);
				return;
			case CorePackage.TEXT_ORIGIN__CHAR_START:
				setCharStart((Integer)newValue);
				return;
			case CorePackage.TEXT_ORIGIN__CHAR_END:
				setCharEnd((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.TEXT_ORIGIN__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CorePackage.TEXT_ORIGIN__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case CorePackage.TEXT_ORIGIN__CHAR_START:
				setCharStart(CHAR_START_EDEFAULT);
				return;
			case CorePackage.TEXT_ORIGIN__CHAR_END:
				setCharEnd(CHAR_END_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.TEXT_ORIGIN__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CorePackage.TEXT_ORIGIN__LINE:
				return line != LINE_EDEFAULT;
			case CorePackage.TEXT_ORIGIN__CHAR_START:
				return charStart != CHAR_START_EDEFAULT;
			case CorePackage.TEXT_ORIGIN__CHAR_END:
				return charEnd != CHAR_END_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(", line: ");
		result.append(line);
		result.append(", charStart: ");
		result.append(charStart);
		result.append(", charEnd: ");
		result.append(charEnd);
		result.append(')');
		return result.toString();
	}

} //TextOriginImpl
