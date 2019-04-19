package com.maxicorrea.effectivejava.creating_and_destroying_objects.enforce_singleton_property;
/**
 * Implementacion del patron builder utilizando una enumeracion.
 * 
 * @author maximiliano
 *
 */
public enum Messi3 {

	INSTANCE;
	
	public void playFootball() {
		System.out.println("playing");
	}
	
}
