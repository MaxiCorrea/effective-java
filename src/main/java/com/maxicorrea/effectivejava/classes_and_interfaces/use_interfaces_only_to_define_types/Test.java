package com.maxicorrea.effectivejava.classes_and_interfaces.use_interfaces_only_to_define_types;

import static com.maxicorrea.effectivejava.classes_and_interfaces.use_interfaces_only_to_define_types.PhysicalConstantsClass.AVOGADROS_NUMBER;

/**
 * 
 * Ejemplo de uso de implementacion de clase constantes
 * 
 * @author mxcorrea
 *
 */
public class Test {

	public double method(
			final double value) {
		return AVOGADROS_NUMBER * value;
	}
	
}
