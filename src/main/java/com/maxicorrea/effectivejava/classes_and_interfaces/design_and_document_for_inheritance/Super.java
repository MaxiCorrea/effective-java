package com.maxicorrea.effectivejava.classes_and_interfaces.design_and_document_for_inheritance;
/**
 * 
 * @author mxcorrea
 *
 */
public abstract class Super {

	public Super() {
		overrideMe(); // Bad implementation
	}

	abstract void overrideMe();
	
}
