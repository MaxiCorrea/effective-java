package com.maxicorrea.effectivejava.creating_and_destroying_objects.consider_a_builder;

import static java.util.Objects.requireNonNull;
/**
 * 
 * @author maximiliano
 *
 */
public class NYPizza extends Pizza {

	public enum Size {SMALL, MEDIUM, LARGE}

	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;

		public Builder(Size size) {
			this.size = requireNonNull(size);
		}

		@Override
		NYPizza build() {
			return new NYPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

	}

	private NYPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
	}

	public Size getSize() {
		return size;
	}
	
}
