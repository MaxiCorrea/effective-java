package com.maxicorrea.effectivejava.methods_common_to_all_objects.clone_vs_copy;

/**
 * No es recomendable sobreescribir el metodo "clone" una mejor practica es
 * implementar un static factory method.
 * 
 * @author maximiliano
 *
 */
public class CopyFactory {
	
	public static class MyClass {

		// no sobreescribir "clone" mejor un
		// un static factory method
		public static MyClass newInstance(MyClass myClass) {
			int myInt = myClass.myInt;
			String myString = myClass.myString;
			return new MyClass(myInt, myString);
		}

		private final int myInt;
		private final String myString;

		public MyClass(final int myInt, final String myString) {
			this.myInt = myInt;
			this.myString = myString;
		}

	}
}
