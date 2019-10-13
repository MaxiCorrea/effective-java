package com.maxicorrea.effectivejava.classes_and_interfaces.prefer_class_hierarchies_to_tagged_classes;
/**
 * Reemplazando Toggled Class con jerarquia de Herencia
 * 
 * @author mxcorrea
 *
 */
public class Rectangle extends AbstractFigure {

	private final double length;
	private final double width;
	
	public Rectangle(
			final double length ,
			final double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		return width * length;
	}

}
