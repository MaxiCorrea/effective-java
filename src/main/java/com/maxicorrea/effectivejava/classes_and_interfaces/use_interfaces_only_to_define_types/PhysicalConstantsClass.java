package com.maxicorrea.effectivejava.classes_and_interfaces.use_interfaces_only_to_define_types;
/**
 * 
 * Clase de utilidad para reemplazar "Interface son solo constantes".
 * 
 * @author mxcorrea
 *
 */
public class PhysicalConstantsClass {

	public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
	
	public static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
	
	public static final double ELECTRON_MASS	= 9.109_383_56e-31;
	
	private PhysicalConstantsClass() {
		throw new AssertionError("Utility Class");
	}
	
}
