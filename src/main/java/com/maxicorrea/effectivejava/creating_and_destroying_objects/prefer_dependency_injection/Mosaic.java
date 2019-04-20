package com.maxicorrea.effectivejava.creating_and_destroying_objects.prefer_dependency_injection;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author maximiliano
 *
 */
public class Mosaic {

	private static final int DEFAULT_WIDTH = 10;
	private static final int DEFAULT_HEIGTH = 10;
	private static final List<Tile> EMPTY_TILES = new ArrayList<>();
	
	private final int width;
	private final int heigth;
	private final List<Tile> tiles;
	
	public Mosaic() {
		this(DEFAULT_WIDTH,DEFAULT_HEIGTH);
	}
	
	public Mosaic(
			final int width ,
			final int heigth) {
		this.width = width;
		this.heigth = heigth;
		tiles = EMPTY_TILES;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return heigth;
	}

	public List<Tile> getTiles() {
		return tiles;
	}
	
	public void put(
			final int x, 
			final int y, 
			final Tile tile) {
		// code
	}

}
