/**
 */
package iec611313Specification.language.ld;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coil Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iec611313Specification.language.ld.LdPackage#getCoilType()
 * @model
 * @generated
 */
public enum CoilType implements Enumerator {
	/**
	 * The '<em><b>COIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIL_VALUE
	 * @generated
	 * @ordered
	 */
	COIL(0, "COIL", "COIL"),

	/**
	 * The '<em><b>NEGATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATED_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATED(1, "NEGATED", "NEGATED"),

	/**
	 * The '<em><b>SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(2, "SET", "SET"),

	/**
	 * The '<em><b>RESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(3, "RESET", "RESET"),

	/**
	 * The '<em><b>POSITIVE TRANSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_TRANSITION(4, "POSITIVE_TRANSITION", "POSITIVE_TRANSITION"),

	/**
	 * The '<em><b>NEGATIVE TRANSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_TRANSITION(5, "NEGATIVE_TRANSITION", "NEGATIVE_TRANSITION");

	/**
	 * The '<em><b>COIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COIL_VALUE = 0;

	/**
	 * The '<em><b>NEGATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEGATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEGATED_VALUE = 1;

	/**
	 * The '<em><b>SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 2;

	/**
	 * The '<em><b>RESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 3;

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
	public static final int POSITIVE_TRANSITION_VALUE = 4;

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
	public static final int NEGATIVE_TRANSITION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Coil Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoilType[] VALUES_ARRAY =
		new CoilType[] {
			COIL,
			NEGATED,
			SET,
			RESET,
			POSITIVE_TRANSITION,
			NEGATIVE_TRANSITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Coil Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoilType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coil Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoilType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoilType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coil Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoilType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoilType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coil Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoilType get(int value) {
		switch (value) {
			case COIL_VALUE: return COIL;
			case NEGATED_VALUE: return NEGATED;
			case SET_VALUE: return SET;
			case RESET_VALUE: return RESET;
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
	private CoilType(int value, String name, String literal) {
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
	
} //CoilType
