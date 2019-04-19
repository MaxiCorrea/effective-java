package com.maxicorrea.effectivejava.creating_and_destroying_objects.consider_a_builder;

/**
 * Ventajas:
 * 
 * 1) El patron Builder simula parametros opcionales nombrados.
 * 
 * 2) El patron Builder es adecuado para jerarquias de herencia.
 * 
 * 3) El patron Builder brinda un interface fluida que mejora la legibilidad.
 * 
 * 
 * @author maximiliano
 *
 */

public class NutritionFacts {

	/*Clase de construccion*/
	public static class Builder {
		private final int servingSize;
		private final int servings;
		private int calories;
		private int fat;
		private int sodium;
		private int carbohydrate;
		
		public Builder(
				final int servingSize ,
				final int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(
				final int calories) {
			this.calories = calories;
			return this;
		}
		
		public Builder fat(
				final int fat) {
			this.fat = fat;
			return this;
		}
		
		public Builder sodium(
				final int sodium) {
			this.sodium = sodium;
			return this;
		}
		
		public Builder carbohydrate(
				final int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	private NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
	
	public int getServingSize() {
		return servingSize;
	}
	
	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

}
