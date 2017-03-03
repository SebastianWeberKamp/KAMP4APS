/**
 */
package iec611313Specification.language.ld;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contact Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.ld.LdPackage#getContactType()
 * @model
 * @generated
 */
public enum ContactType implements Enumerator {
	/**
	 * The '<em><b>NORMALLY OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALLY_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALLY_OPEN(0, "NORMALLY_OPEN", "NORMALLY_OPEN"),

	/**
	 * The '<em><b>NORMALLY CLOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALLY_CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALLY_CLOSED(1, "NORMALLY_CLOSED", "NORMALLY_CLOSED"),

	/**
	 * The '<em><b>POSITIVE TRANSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_TRANSITION(2, "POSITIVE_TRANSITION", "POSITIVE_TRANSITION"),

	/**
	 * The '<em><b>NEGATIVE TRANSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_TRANSITION(3, "NEGATIVE_TRANSITION", "NEGATIVE_TRANSITION");

	/**
	 * The '<em><b>NORMALLY OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMALLY OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALLY_OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMALLY_OPEN_VALUE = 0;

	/**
	 * The '<em><b>NORMALLY CLOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMALLY CLOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALLY_CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMALLY_CLOSED_VALUE = 1;

	/**
	 * The '<em><b>POSITIVE TRANSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITIVE TRANSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TRANSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_TRANSITION_VALUE = 2;

	/**
	 * The '<em><b>NEGATIVE TRANSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEGATIVE TRANSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_TRANSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_TRANSITION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Contact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContactType[] VALUES_ARRAY =
		new ContactType[] {
			NORMALLY_OPEN,
			NORMALLY_CLOSED,
			POSITIVE_TRANSITION,
			NEGATIVE_TRANSITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Contact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContactType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contact Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactType get(int value) {
		switch (value) {
			case NORMALLY_OPEN_VALUE: return NORMALLY_OPEN;
			case NORMALLY_CLOSED_VALUE: return NORMALLY_CLOSED;
			case POSITIVE_TRANSITION_VALUE: return POSITIVE_TRANSITION;
			case NEGATIVE_TRANSITION_VALUE: return NEGATIVE_TRANSITION;
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
	private ContactType(int value, String name, String literal) {
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
	
} //ContactType
