package com.maxicorrea.effectivejava.methods_common_to_all_objects.clone_vs_copy;
/**
 * No es recomendable sobreescribir el metodo "clone"
 * una mejor practica es implementar un constructor de
 * copia.
 * @author maximiliano
 *
 */
public class CopyContructor {

	public static class MyClass {
		
		private final int myInt;
		private final String myString;
		
		public MyClass(
				final int myInt ,
				final String myString) {
			this.myInt = myInt;
			this.myString = myString;
		}
		
		// no sobreescribir "clone" mejor un 
		// constructor de copia
		public MyClass(MyClass another) {
			this.myInt = another.myInt;
			this.myString = another.myString;
		}
	}
	
}
