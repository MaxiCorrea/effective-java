package com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants;

import static com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants.Operation.DIVIDE;
import static com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants.Operation.MINUS;
import static com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants.Operation.PLUS;
import static com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants.Operation.TIMES;

/**
 * Suponiento de que la unumeracion no esta bajo nuestro control podemos utilizar el switch para agregar comportamento constante
 * @author mxcorrea
 *
 */
public class OperationLocalExtension {

	private OperationLocalExtension() {
		throw new AssertionError("Util Class");
	}
	
	public static final Operation reverse(
			final  Operation operation) {
		switch(operation) {
			case PLUS : return MINUS;
			case MINUS : return PLUS;
			case TIMES : return DIVIDE;
			case DIVIDE : return TIMES;
		default:
			throw new IllegalArgumentException();
		}
	}
	
}
