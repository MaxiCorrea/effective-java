package com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants;

/**
 * Cuestionable implementacion de una enumeracion con comprotamiento.
 * 
 * @author mxcorrea
 *
 */
public enum Operation {

	PLUS, MINUS, TIMES, DIVIDE;

	public double apply(double x, double y) {
		switch (this) {
		case PLUS:
			return x + y;
		case MINUS:
			return x - y;
		case TIMES:
			return x * y;
		case DIVIDE:
			return x / y;
		}
		throw new AssertionError("Unknown op: " + this);
	}

}
