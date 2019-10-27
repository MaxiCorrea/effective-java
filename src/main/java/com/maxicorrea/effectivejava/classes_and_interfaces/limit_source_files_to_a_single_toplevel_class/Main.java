package com.maxicorrea.effectivejava.classes_and_interfaces.limit_source_files_to_a_single_toplevel_class;
/**
 * Ejemplo de implementacion de Clases de nivel superior declaradas en un mismo archivo fuente.
 * (Mala Practica no hagamos esto)
 * @author mxcorrea
 *
 */
public class Main {

	public static void main(String...args) {
		System.out.println(Utensil.NAME + " - " + Dessert.NAME);
	}
	
}

class Utensil {
	
	public static final String NAME = "Name of Utensil instances";
	
}

class Dessert {
	public static final String NAME = "Name of Dessert instances";
}
