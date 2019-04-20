package com.maxicorrea.effectivejava.creating_and_destroying_objects.obsolete_object_references;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Eliminacion de referencias obsoletas para evitar las fugas de memoria.
 * 
 * @author maximiliano
 *
 */
public class Stack {

	private final int DEFAULT_INITIAL_CAPACITY = 10;
	private Object[] elements;
	private int size;
	
	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(
			final int newElement) {
		ensureCapacity();
		elements[size++] = newElement;
	}
	
	public Object pop() {
		if(isEmpty()) 
			throw new NoSuchElementException();
		Object obj = elements[--size];
		elements[size] = null; // remove obsolete reference
		return obj;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
}
