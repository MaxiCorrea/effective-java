package com.maxicorrea.effectivejava.creating_and_destroying_objects.consider_a_builder;

public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public NutritionFacts(
			final int servingSize, 
			final int servings) {
		this(servingSize, servings, 0);
	}

	public NutritionFacts(
			final int servingSize, 
			final int servings, 
			final int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFacts(
			final int servingSize, 
			final int servings, 
			final int calories, 
			final int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFacts(
			final int servingSize, 
			final int servings, 
			final int calories, 
			final int fat, 
			final int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFacts(
			final int servingSize, 
			final int servings, 
			final int calories, 
			final int fat, 
			final int sodium, 
			final int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
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
