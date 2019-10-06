package com.maxicorrea.effectivejava.classes_and_interfaces.design_and_document_for_inheritance;

public class ConstructorForInheritanceProblem {

	public static void main(String... args) {
		DerivedClass classe = new DerivedClass();
		classe.myMethod(); // throws NullPointerException
	}
	
}

class BaseClass {
	
	BaseClass() {
		myMethod(); 
	}
	
	void myMethod() {
		System.out.print("myMethod : BaseClass");
	}
}

class DerivedClass extends BaseClass {
	
	private Integer number;
	
	public DerivedClass() {
		number = Integer.valueOf(3);
	}
	
	@Override
	public void myMethod() {
		number *= 2;
		System.out.println(number);
	}
}
