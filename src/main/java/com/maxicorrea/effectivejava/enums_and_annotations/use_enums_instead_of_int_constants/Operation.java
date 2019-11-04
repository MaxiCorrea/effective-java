package com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementacion de Enumeracion con comportamiento robusto.
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
	
	private static final Map<String, Operation> stringToEnum() {
		Map<String, Operation> map = new HashMap<>();
		for(Operation op : values())
			map.put(op.toString(),op);
		return map;
	}

	public static Operation fromString(String symbol) {
		return stringToEnum().get(symbol);
	}
	
}
