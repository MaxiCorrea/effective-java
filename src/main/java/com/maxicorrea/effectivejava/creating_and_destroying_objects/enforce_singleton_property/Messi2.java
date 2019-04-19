package com.maxicorrea.effectivejava.creating_and_destroying_objects.enforce_singleton_property;
/**
 * Implementacion de patron singleton un metodo de fabrica estatico.
 * 
 * @author maximiliano
 *
 */
public class Messi2 {

	private static final Messi2 INSTANCE = new Messi2();
	
	private Messi2() {}
	
	public static Messi2 getInstance() {
		return INSTANCE;
	}
	
	public void playFootball() {
		System.out.println("playing");
	}

}
