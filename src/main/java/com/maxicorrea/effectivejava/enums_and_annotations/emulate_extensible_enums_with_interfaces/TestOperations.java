package com.maxicorrea.effectivejava.enums_and_annotations.emulate_extensible_enums_with_interfaces;

import java.util.Arrays;
import java.util.Collection;

/**
 * Ejemplo de uso de enumeraciones extensible para extender un API de operaciones.
 * @author mxcorrea
 *
 */
public class TestOperations {

	public static void main(String[] args) {
		double x = 4;
		double y = 5;
		test(BasicOperations.class , x , y);
		test(Arrays.asList(ExtendedOperation.values()) , x , y);
	}
	
	private static <T extends Enum<T> & Operation> void test(
			final Class<T> opEnumType, 
			final double x, 
			final double y) {
		for (Operation op : opEnumType.getEnumConstants())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}

	private static <T extends Operation> void test(
			final Collection <T> operations , double x , double y) {
		for (Operation op : operations)
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
	
}
