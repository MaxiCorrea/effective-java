package com.maxicorrea.effectivejava.enums_and_annotations.emulate_extensible_enums_with_interfaces;

/**
 * Implementacion de interface con enums
 * 
 * @author mxcorrea
 *
 */
public enum BasicOperations implements Operation {

	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		public double apply(double x, double y) {
			return x / y;
		}
	};

	private final String symbol;

	private BasicOperations(final String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}
}
