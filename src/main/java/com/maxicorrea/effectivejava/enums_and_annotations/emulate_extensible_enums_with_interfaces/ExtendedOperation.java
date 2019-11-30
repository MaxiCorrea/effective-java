package com.maxicorrea.effectivejava.enums_and_annotations.emulate_extensible_enums_with_interfaces;

/**
 * Extenden el API de operaciones con una nueva enumeracion.
 * 
 * @author mxcorrea
 *
 */
public enum ExtendedOperation implements Operation {

	POW("pow") {
		public double apply(double x, double y) {
			return Math.pow(x, y);
		}
	},

	REMAINDER("%") {
		public double apply(double x, double y) {
			return x % y;
		}
	};

	private final String symbol;

	private ExtendedOperation(
			final String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

}
