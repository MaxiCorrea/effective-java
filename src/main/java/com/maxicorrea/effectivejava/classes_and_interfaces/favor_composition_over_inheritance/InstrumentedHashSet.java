package com.maxicorrea.effectivejava.classes_and_interfaces.favor_composition_over_inheritance;

import java.util.Collection;
import java.util.HashSet;

/**
 * 
 * Ejemplo de uso incorrecto de Herencia.
 * 
 * @author mxcorrea
 *
 * @param <E>
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

	private static final long serialVersionUID = 1L;

	private int addCounter;
	
	public InstrumentedHashSet() {}
	
	public InstrumentedHashSet(
			final int initCap, 
			final float loadFactor) {
		super(initCap, loadFactor);
	}
	
	@Override 
	public boolean add(E e) {
		addCounter++;
		return super.add(e);
	}
	
	@Override 
	public boolean addAll(
			final Collection<? extends E> c) {
		addCounter += c.size();
		return super.addAll(c);
	}
	
	public int getAddCounter() {
		return addCounter;
	}
	
}
