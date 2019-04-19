package com.maxicorrea.effectivejava.creating_and_destroying_objects.consider_a_builder;

public class NutritionFacts {

	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;

	public void setServingSize(
			final int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(
			final int servings) {
		this.servings = servings;
	}

	public void setCalories(
			final int calories) {
		this.calories = calories;
	}

	public void setFat(
			final int fat) {
		this.fat = fat;
	}

	public void setSodium(
			final int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(
			final int carbohydrate) {
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
