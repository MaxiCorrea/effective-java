package com.maxicorrea.effectivejava.classes_and_interfaces.not_public_fields;
/**
 * 
 * @author mxcorrea
 *
 */
public class Point {

	private double x;
	private double y;
	
	public Point(
			final double x ,
			final double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
}
