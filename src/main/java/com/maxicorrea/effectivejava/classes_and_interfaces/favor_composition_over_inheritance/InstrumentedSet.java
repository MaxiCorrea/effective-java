package com.maxicorrea.effectivejava.classes_and_interfaces.favor_composition_over_inheritance;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author mxcorrea
 *
 * @param <E>
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {

	private int addCounter;
	
	public InstrumentedSet(
			final Set<E> set) {
		super(set);
	}

	@Override
	public boolean add(
			final E e) {
		addCounter++;
		return super.add(e);
	}
	
	public int getAddCounter() {
		return addCounter;
	}

	@Override
	public boolean addAll(
			final Collection<? extends E> c) {
		addCounter += c.size();
		return super.addAll(c);
	}
	
	public static void main(String[] args) {
		InstrumentedSet<String> myHash = new InstrumentedSet<>(new HashSet<>());
		myHash.addAll(Arrays.asList("A","B","C"));
		System.out.println("Counter : " + myHash.getAddCounter());
	}
	
}
