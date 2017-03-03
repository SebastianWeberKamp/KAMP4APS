/**
 */
package iec611313Specification.language.sfc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Timed Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.sfc.SfcPackage#getTimedQualifier()
 * @model
 * @generated
 */
public enum TimedQualifier implements Enumerator {
	/**
	 * The '<em><b>TIME LIMITED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LIMITED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_LIMITED(0, "TIME_LIMITED", "TIME_LIMITED"),

	/**
	 * The '<em><b>TIME DELAYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_DELAYED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_DELAYED(1, "TIME_DELAYED", "TIME_DELAYED"),

	/**
	 * The '<em><b>STORED TIME DELAYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORED_TIME_DELAYED_VALUE
	 * @generated
	 * @ordered
	 */
	STORED_TIME_DELAYED(2, "STORED_TIME_DELAYED", "STORED_TIME_DELAYED"),

	/**
	 * The '<em><b>TIME DELAYED STORED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_DELAYED_STORED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_DELAYED_STORED(3, "TIME_DELAYED_STORED", "TIME_DELAYED_STORED"),

	/**
	 * The '<em><b>STORED TIME LIMITED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORED_TIME_LIMITED_VALUE
	 * @generated
	 * @ordered
	 */
	STORED_TIME_LIMITED(4, "STORED_TIME_LIMITED", "STORED_TIME_LIMITED");

	/**
	 * The '<em><b>TIME LIMITED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME LIMITED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_LIMITED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_LIMITED_VALUE = 0;

	/**
	 * The '<em><b>TIME DELAYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME DELAYED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_DELAYED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_DELAYED_VALUE = 1;

	/**
	 * The '<em><b>STORED TIME DELAYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STORED TIME DELAYED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORED_TIME_DELAYED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORED_TIME_DELAYED_VALUE = 2;

	/**
	 * The '<em><b>TIME DELAYED STORED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME DELAYED STORED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_DELAYED_STORED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_DELAYED_STORED_VALUE = 3;

	/**
	 * The '<em><b>STORED TIME LIMITED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STORED TIME LIMITED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORED_TIME_LIMITED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORED_TIME_LIMITED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Timed Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimedQualifier[] VALUES_ARRAY =
		new TimedQualifier[] {
			TIME_LIMITED,
			TIME_DELAYED,
			STORED_TIME_DELAYED,
			TIME_DELAYED_STORED,
			STORED_TIME_LIMITED,
		};

	/**
	 * A public read-only list of all the '<em><b>Timed Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimedQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timed Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimedQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimedQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timed Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimedQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimedQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timed Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimedQualifier get(int value) {
		switch (value) {
			case TIME_LIMITED_VALUE: return TIME_LIMITED;
			case TIME_DELAYED_VALUE: return TIME_DELAYED;
			case STORED_TIME_DELAYED_VALUE: return STORED_TIME_DELAYED;
			case TIME_DELAYED_STORED_VALUE: return TIME_DELAYED_STORED;
			case STORED_TIME_LIMITED_VALUE: return STORED_TIME_LIMITED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimedQualifier(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimedQualifier
