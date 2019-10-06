package com.maxicorrea.effectivejava.classes_and_interfaces.favor_composition_over_inheritance;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Ejemplo de clase decorador de un Set (Conjunto)
 * @author mxcorrea
 *
 */
public class ForwardingSet<E> implements Set<E> {

	private final Set<E> set;
	
	public ForwardingSet(
			final Set<E> set) {
		this.set = set;
	}
	
	@Override
	public int size() {
		return set.size();
	}

	@Override
	public boolean isEmpty() {
		return set.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return set.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return set.iterator();
	}

	@Override
	public Object[] toArray() {
		return set.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return set.toArray(a);
	}

	@Override
	public boolean add(E e) {
		return set.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return set.remove(o);
	}

	@Override
	public boolean containsAll(
			final Collection<?> c) {
		return set.containsAll(c);
	}

	@Override
	public boolean addAll(
			final Collection<? extends E> c) {
		return set.addAll(c);
	}

	@Override
	public boolean retainAll(
			final Collection<?> c) {
		return set.retainAll(c);
	}

	@Override
	public boolean removeAll(
			final Collection<?> c) {
		return set.removeAll(c);
	}

	@Override
	public void clear() {
		set.clear();
	}

}
