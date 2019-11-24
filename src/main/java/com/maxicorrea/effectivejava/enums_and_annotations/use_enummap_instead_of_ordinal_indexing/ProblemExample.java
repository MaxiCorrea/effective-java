package com.maxicorrea.effectivejava.enums_and_annotations.use_enummap_instead_of_ordinal_indexing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Uso de ordinal para indexar
 * 
 * @author mxcorrea
 *
 */
public class ProblemExample {

	public static void main(String[] args) {

		List<Plant> garden = new ArrayList<>(Arrays.asList(
				new Plant("Plant 1" , Plant.LifeCycle.ANNUAL),
				new Plant("Plant 2" , Plant.LifeCycle.BIENNIAL),
				new Plant("Plant 3" , Plant.LifeCycle.BIENNIAL),
				new Plant("Plant 4" , Plant.LifeCycle.BIENNIAL),
				new Plant("Plant 5" , Plant.LifeCycle.PERENNIAL),
				new Plant("Plant 6" , Plant.LifeCycle.ANNUAL),
				new Plant("Plant 7" , Plant.LifeCycle.ANNUAL)
		));
		
		
		@SuppressWarnings("unchecked")
		Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

		// initialize Array of Set 
		for (int i = 0; i < plantsByLifeCycle.length; ++i) {
			plantsByLifeCycle[i] = new HashSet<>();
		}
		
		// load set of plant by cycle life
		for(Plant plant : garden) {
			plantsByLifeCycle[plant.getLifeCycle().ordinal()].add(plant);
		}
		
		// Print the results
		for (int i = 0; i < plantsByLifeCycle.length; i++) {
			System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
		}

	}

}
