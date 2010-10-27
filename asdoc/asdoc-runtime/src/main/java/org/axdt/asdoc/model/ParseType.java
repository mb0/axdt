/**
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org> and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.axdt.asdoc.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.axdt.asdoc.parser.AsdocParser;
import org.axdt.asdoc.parser.dita.AsdocDitaParser;
import org.axdt.asdoc.parser.html.AsdocHtmlParser;
import org.axdt.asdoc.util.AsdocUrlHelper;
import org.axdt.asdoc.util.DitaUrlHelper;
import org.axdt.asdoc.util.HtmlUrlHelper;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parse Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.axdt.asdoc.AsdocEPackage#getParseType()
 * @model
 * @generated
 */
public enum ParseType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>HTML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTML_VALUE
	 * @generated
	 * @ordered
	 */
	HTML(1, "HTML", "HTML"),

	/**
	 * The '<em><b>DITA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DITA_VALUE
	 * @generated
	 * @ordered
	 */
	DITA(2, "DITA", "DITA");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>HTML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HTML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTML_VALUE = 1;

	/**
	 * The '<em><b>DITA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DITA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DITA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DITA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Parse Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParseType[] VALUES_ARRAY =
		new ParseType[] {
			NONE,
			HTML,
			DITA,
		};

	/**
	 * A public read-only list of all the '<em><b>Parse Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parse Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parse Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parse Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParseType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case HTML_VALUE: return HTML;
			case DITA_VALUE: return DITA;
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
	private ParseType(int value, String name, String literal) {
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
	
	public AsdocUrlHelper getUrlHelper() {
		if (equals(HTML))
			return htmlHelper();
		else if (equals(DITA))
			return ditaHelper();
		else 
			return nullHelper();
	}

	private static AsdocUrlHelper htmlHelper;
	private static AsdocUrlHelper ditaHelper;
	private static AsdocUrlHelper nullHelper;

	private static AsdocUrlHelper htmlHelper() {
		if (htmlHelper == null)
			htmlHelper = new HtmlUrlHelper();
		return htmlHelper;
	}
	private static AsdocUrlHelper ditaHelper() {
		if (ditaHelper == null)
			ditaHelper = new DitaUrlHelper();
		return ditaHelper;
	}
	private static AsdocUrlHelper nullHelper() {
		if (nullHelper == null)
			nullHelper = new AsdocUrlHelper.NULL();
		return nullHelper;
	}
	
	public AsdocParser getParser() {
		if (equals(DITA))
			return ditaParser();
		return htmlParser();
	}

	private static AsdocHtmlParser htmlParser;
	private static AsdocDitaParser ditaParser;
	
	private static AsdocParser htmlParser() {
		if (htmlParser == null)
			htmlParser = new AsdocHtmlParser();
		return htmlParser;
	}
	private static AsdocParser ditaParser() {
		if (ditaParser == null)
			ditaParser = new AsdocDitaParser();
		return ditaParser;
	}
} //ParseType
