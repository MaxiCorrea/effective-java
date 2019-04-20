package com.maxicorrea.effectivejava.creating_and_destroying_objects.prefer_dependency_injection;

import static java.util.Objects.requireNonNull;

public class Color extends Tile {

	private String rgb;
	
	public Color(String rgb) {
		this.rgb = requireNonNull(rgb);
	}
	
	public String getRGB() {
		return rgb;
	}
	
	@Override
	public String toString() {
		return getRGB();
	}

}
