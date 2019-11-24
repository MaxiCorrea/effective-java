package com.maxicorrea.effectivejava.enums_and_annotations.use_enummap_instead_of_ordinal_indexing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solucion utilizandp EnumMap
 * 
 * @author mxcorrea
 *
 */
public class SolutionExample {

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
		
		EnumMap<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
		
		for(Plant.LifeCycle cycle : Plant.LifeCycle.values()) {
			plantsByLifeCycle.put(cycle, new HashSet<>());
		}
		
		for(Plant plant : garden) {
			plantsByLifeCycle.get(plant.getLifeCycle()).add(plant);
		}
	
		System.out.println(plantsByLifeCycle);
		
	}
	
}
