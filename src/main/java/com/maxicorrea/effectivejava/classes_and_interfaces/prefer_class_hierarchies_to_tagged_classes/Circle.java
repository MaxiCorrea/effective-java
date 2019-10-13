package com.maxicorrea.effectivejava.classes_and_interfaces.prefer_class_hierarchies_to_tagged_classes;
/**
 * Reemplazando Toggled Class con jerarquia de Herencia
 * 
 * @author mxcorrea
 *
 */
public class Circle extends AbstractFigure {

	private final double radius;
	
	public Circle(
			final double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

}
