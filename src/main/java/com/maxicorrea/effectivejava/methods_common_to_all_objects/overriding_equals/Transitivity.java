package com.maxicorrea.effectivejava.methods_common_to_all_objects.overriding_equals;
/**
 * 
 * @author maximiliano
 *
 */
public class Transitivity {

	public static void main(String[] args) {
		// violacion de simetria
		//Point point = new Point(10,10);
		//ColorPoint colorPoint = new ColorPoint(10,10 , new Color(0,0,0));
		//System.out.println(point.equals(colorPoint)); // deberia ser true y es true
		//System.out.println(colorPoint.equals(point)); // deberia ser true y es false
		
		ColorPoint p1 = new ColorPoint(1, 2, new Color(0,0,0));
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, new Color(0,0,0));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p1));
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
	
	/*
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) 
			return false;
		Point other = (Point) obj;
		return this.x == other.x && 
			   this.y == other.y;	
	}*/
	
	// Violacion de Liskov substitution principle
	@Override 
	public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass())
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
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
	/*@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ColorPoint))
			return false;
		ColorPoint other = (ColorPoint) obj;
		return super.equals(other) && 
			   this.color.equals(other.color);
	}*/
	
	// Violacion de propiedad transitiva
	@Override 
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		// si es un Point solo ingnoramos la propiedad de color
		if (!(o instanceof ColorPoint))
			return o.equals(this);
		// si es un ColorPoint hacemos una comparacion completa
		return super.equals(o) && ((ColorPoint) o).color==color;
	}

}


