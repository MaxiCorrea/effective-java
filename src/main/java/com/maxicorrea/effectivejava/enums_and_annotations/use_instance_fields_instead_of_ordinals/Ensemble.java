package com.maxicorrea.effectivejava.enums_and_annotations.use_instance_fields_instead_of_ordinals;
/**
 * Uso indevido de valor "ordinal"
 * @author mxcorrea
 *
 */
public enum Ensemble {

	SOLO ,
	
	DUET ,
	
	TRIO ,
	
	QUARTER ,
	
	QUINTET ,
	
	SEXTET ,
	
	OCTET ,
	
	NONETET,
	
	DECTET;
	
	
	public int numberOfMusicians() {
		return ordinal() + 1;
	}
}
