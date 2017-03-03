/**
 */
package iec611313Specification.common.variables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iec611313Specification.common.variables.VariablesPackage#getSize()
 * @model
 * @generated
 */
public enum Size implements Enumerator {
	/**
	 * The '<em><b>BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_VALUE
	 * @generated
	 * @ordered
	 */
	BIT(0, "BIT", "BIT"),

	/**
	 * The '<em><b>BYTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(1, "BYTE", "BYTE"),

	/**
	 * The '<em><b>WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_VALUE
	 * @generated
	 * @ordered
	 */
	WORD(2, "WORD", "WORD"),

	/**
	 * The '<em><b>DOUBLE WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_WORD_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_WORD(3, "DOUBLE_WORD", "DOUBLE_WORD"),

	/**
	 * The '<em><b>LONG WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_WORD_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_WORD(4, "LONG_WORD", "LONG_WORD");

	/**
	 * The '<em><b>BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIT_VALUE = 0;

	/**
	 * The '<em><b>BYTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 1;

	/**
	 * The '<em><b>WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORD_VALUE = 2;

	/**
	 * The '<em><b>DOUBLE WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE WORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_WORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_WORD_VALUE = 3;

	/**
	 * The '<em><b>LONG WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG WORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_WORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_WORD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Size[] VALUES_ARRAY =
		new Size[] {
			BIT,
			BYTE,
			WORD,
			DOUBLE_WORD,
			LONG_WORD,
		};

	/**
	 * A public read-only list of all the '<em><b>Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Size> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Size</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Size get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Size result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Size getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Size result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Size get(int value) {
		switch (value) {
			case BIT_VALUE: return BIT;
			case BYTE_VALUE: return BYTE;
			case WORD_VALUE: return WORD;
			case DOUBLE_WORD_VALUE: return DOUBLE_WORD;
			case LONG_WORD_VALUE: return LONG_WORD;
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
	private Size(int value, String name, String literal) {
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
	
} //Size
