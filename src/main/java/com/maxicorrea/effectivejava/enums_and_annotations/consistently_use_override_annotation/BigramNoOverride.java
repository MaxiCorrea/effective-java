package com.maxicorrea.effectivejava.enums_and_annotations.consistently_use_override_annotation;

/**
 * 
 * @author mxcorrea
 *
 */
public class BigramNoOverride {

	private final char first;
	private final char second;

	public BigramNoOverride(
			final char first, 
			final char second) {
		this.first = first;
		this.second = second;
	}

	public boolean equals(BigramNoOverride b) {
		return b.first == first && b.second == second;
	}

	public int hashCode() {
		return 31 * first + second;
	}
}
