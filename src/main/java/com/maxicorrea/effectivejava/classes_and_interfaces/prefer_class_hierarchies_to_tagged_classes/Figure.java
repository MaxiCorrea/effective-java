package com.maxicorrea.effectivejava.classes_and_interfaces.prefer_class_hierarchies_to_tagged_classes;
/**
 * Implementacion de una clase "Etiqueda" (Clase que enumera todos sus tipos de instantes posibles)
 * @author mxcorrea
 *
 */
public class Figure {

	enum Shape {CIRCLE , RECTANGLE};
	
	private final Shape shape;
	
	// estos atributos son usados solo para Rectangle
	double length;
	double width;
	
	// Este atributo es solo usado par el Circulo
	double radius;
	
	// constructor para Rectangulo
	public Figure(
			final double length ,
			final double width) {
		this.shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}
	
	// constructor para Circulo
	public Figure(
			final double radius) {
		this.shape = Shape.CIRCLE;
		this.radius = radius;
	}
	
	public double area() {
		switch(shape) {
		
		case RECTANGLE:
			return length * width;
		
		case CIRCLE:
			return Math.PI * (radius * radius);
			
		default:
			throw new AssertionError(shape);
		}
	}
	
}
