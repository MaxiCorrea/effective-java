package com.maxicorrea.effectivejava.creating_and_destroying_objects.enforce_singleton_property;
/**
 * Implementacion del Patron singleton con campo publico y final.
 * 
 * @author maximiliano
 *
 */
public class Messi1 {

	public final static Messi1 INSTANCE = new Messi1();
	
	private Messi1() {}
	
	public void playFootball() {
		System.out.println("playing");
	}
	
}
