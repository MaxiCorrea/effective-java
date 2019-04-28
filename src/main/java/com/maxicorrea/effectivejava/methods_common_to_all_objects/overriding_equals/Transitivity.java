package com.maxicorrea.effectivejava.methods_common_to_all_objects.overriding_equals;
/**
 * 
 * @author maximiliano
 *
 */
public class Transitivity {

	public static void main(String[] args) {
		
	}
	
}


class Point {

	private final int x;
	private final int y;
	
	public Point( 
			final int x ,
			final int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Point)) 
			return false;
		Point other = (Point) obj;
		return this.x == other.x && 
			   this.y == other.y;	
	}
	
}

class Color {

	private final int r;
	private final int g;
	private final int b;
	
	public Color(
			final int r ,
			final int g ,
			final int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		result = prime * result + g;
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		if (b != other.b)
			return false;
		if (g != other.g)
			return false;
		return r == other.r;
	}

}

class ColorPoint extends Point {

	private final Color color;
	
	public ColorPoint(
			final int x, 
			final int y , 
			final Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	// Violacion de propiedad simetrica
	@Override
	public boolean equals(Object obj) {
		if(!( obj instanceof ColorPoint))
			return false;
		ColorPoint other = (ColorPoint) obj;
		return super.equals(other) && 
			   this.color.equals(other.color);
	}
	
}


