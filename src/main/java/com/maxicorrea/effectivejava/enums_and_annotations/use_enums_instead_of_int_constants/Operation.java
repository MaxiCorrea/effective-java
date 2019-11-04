package com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants;

/**
 * Cuestionable implementacion de una enumeracion con comprotamiento.
 * 
 * @author mxcorrea
 *
 */
public enum Operation {

	PLUS ("+"){
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	}, 
	
	MINUS ("-") {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	}, 
	
	TIMES ("*") {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	}, 
	
	DIVIDE ("/"){
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};

	private final String symbol;
	
	private Operation(final String symbol) {
		this.symbol = symbol;
	}
	
	public abstract double apply(double x, double y);

	@Override
	public String toString() {
		return symbol;
	}
	
}
