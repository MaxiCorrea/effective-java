package com.maxicorrea.effectivejava.enums_and_annotations.consistently_use_override_annotation;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

/**
 * 
 * @author mxcorrea
 *
 */
public class BigramOverride {

	private final char first;
	private final char second;

	public BigramOverride(
			final char first, 
			final char second) {
		this.first = first;
		this.second = second;
	}

	public char getFirst() {
		return first;
	}
	
	public char getSecond() {
		return second;
	}
	
	@Override
	public boolean equals(Object obj) {
		return reflectionEquals(this , obj);
	}
	
	@Override
	public int hashCode() {
		return reflectionHashCode(this);
	}
}
