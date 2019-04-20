package com.maxicorrea.effectivejava.creating_and_destroying_objects.prefer_dependency_injection;

import java.util.function.Supplier;
/**
 * 
 * @author maximiliano
 *
 */
public class MosaicFactory {

	private MosaicFactory() {
		throw new AssertionError();
	}
	
	public static Mosaic createWithBlackTiles() {
		return create(()-> new Color("0,0,0"));
	}
	
	public static Mosaic create(
			final Supplier<? extends Tile> tileFactory) {
		Mosaic mosaic = new Mosaic();
		for(int x = 0 ; x < mosaic.getWidth() ; ++x) 
			for( int y = 0; y < mosaic.getHeight() ; ++y) 
				mosaic.put(x , y , tileFactory.get());
		return mosaic;
	}
	
}
