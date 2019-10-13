package com.maxicorrea.effectivejava.classes_and_interfaces.favor_static_member_classes_over_nonstatic;

import java.util.AbstractSet;
import java.util.Iterator;
/**
 * 
 * Ejemplo comun de Uso de Clase Miembro no estatico (Adapter Pattern)
 * 
 * @author mxcorrea
 *
 * @param <E>
 */
public class MySet<E> extends AbstractSet<E> {

	@Override
	public Iterator<E> iterator() {
		return new MyIterator();
	}

	@Override
	public int size() {
		return 0;
	}

	/*Adapter Pattern*/
	private class MyIterator implements Iterator<E> {

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public E next() {
			return null;
		}
		
	}
	
}
