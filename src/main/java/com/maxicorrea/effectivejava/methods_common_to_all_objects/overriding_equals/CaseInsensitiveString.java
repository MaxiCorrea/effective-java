package com.maxicorrea.effectivejava.methods_common_to_all_objects.overriding_equals;

import static java.util.Objects.requireNonNull;
/**
 * Ejemplo de violacion de propiedad de simetrica del metodo equals
 * 
 * Propiedad simetrica : 
 * 
 * si objX.equals(objY) es true entonces...
 * objY.equals(objX) tambien deberia ser true
 * 
 * @author maximiliano
 *
 */
public class CaseInsensitiveString {

	private final String s;

	public CaseInsensitiveString(
			final String s) {
		this.s = requireNonNull(s);
	}

	// violacion de propiadad simetrica de equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
		if (obj instanceof String) // para interoperabilidad
			return s.equalsIgnoreCase((String) obj);
		return false;
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		CaseInsensitiveString caseInsensitiveString;
		caseInsensitiveString = new CaseInsensitiveString("Hello");
		String str = "Hello";
		System.out.println(caseInsensitiveString.equals(str)); // true
		System.out.println(str.equals(caseInsensitiveString)); // false;
	}
	
}
