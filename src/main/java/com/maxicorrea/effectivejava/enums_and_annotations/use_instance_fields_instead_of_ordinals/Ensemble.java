package com.maxicorrea.effectivejava.enums_and_annotations.use_instance_fields_instead_of_ordinals;
/**
 * No utilize los ordinal para algun tipo de logica. mejor utilize variables que se
 *  agregan por el constructor del enum
 * @author mxcorrea
 *
 */
public enum Ensemble {

	SOLO(1) ,
	
	DUET(2) ,
	
	TRIO(3) ,
	
	QUARTER(4) ,
	
	DOUBLE_QUARTET(4),
	
	QUINTET(5) ,
	
	SEXTET(6) ,
	
	OCTET(8) ,
	
	NONETET(10),
	
	DECTET(12);
	
	
	private final int numberOfMusicians;
	
	private Ensemble(
			final int numberOfMusicians) {
		this.numberOfMusicians = numberOfMusicians;
	}
	
	public int numberOfMusicians() {
		return numberOfMusicians;
	}
}
