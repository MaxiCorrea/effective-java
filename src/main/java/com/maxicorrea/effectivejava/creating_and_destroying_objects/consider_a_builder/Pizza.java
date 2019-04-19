package com.maxicorrea.effectivejava.creating_and_destroying_objects.consider_a_builder;

import static java.util.Objects.requireNonNull;

import java.util.EnumSet;
import java.util.Set;
/**
 * Ejemplo de implementacion del Patron Builder con jerarquias de herencia paralelas.
 * 
 * @author maximiliano
 *
 */
public abstract class Pizza {
	
	public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
	final Set<Topping> toppings;

	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping) {
			toppings.add(requireNonNull(topping));
			return self();
		}

		abstract Pizza build();

		protected abstract T self();
	}

	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();
	}
}