package com.maxicorrea.effectivejava.creating_and_destroying_objects.enforce_noninstantiability;
/**
 * Evitar la crecion de instancias de clases de utilidad.
 * 
 * @author maximiliano
 *
 */
public final class UtilityClass {

	private UtilityClass() {
		throw new AssertionError("Utility class");
	}
	
	public static void utilityMethod() {}
	
}
