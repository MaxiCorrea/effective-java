package com.maxicorrea.effectivejava.classes_and_interfaces.limit_source_files_to_a_single_toplevel_class;
/**
 * Una Alternativa para solucionar la implementacion de clases de nivel superior en un mismo archivo.
 * @author mxcorrea
 *
 */
public class Solution {

	public static void main(String...args) {
		System.out.println(Utensil.NAME + " - " + Dessert.NAME);
	}

	private static class Utensil {
		private static final String NAME = "Name of Utensil Instances";
	}
	
	private static class Dessert {
		private static final String NAME = "Name of Dessert Instance";
	}
	
}
