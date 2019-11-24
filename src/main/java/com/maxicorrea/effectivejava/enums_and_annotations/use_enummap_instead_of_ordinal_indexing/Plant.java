package com.maxicorrea.effectivejava.enums_and_annotations.use_enummap_instead_of_ordinal_indexing;
/**
 * 
 * @author mxcorrea
 *
 */
public class Plant {

	enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }
	
	private final String name;
	private final LifeCycle life;
	
	public Plant(
			final String name,
			final LifeCycle life) {
		this.name = name;
		this.life = life;
	}
	
	public String getName() {
		return name;
	}
	
	public LifeCycle getLifeCycle() {
		return life;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
