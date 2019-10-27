package com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants;

/**
 * Ejemplo de enumeracion con datos y comportamiento.
 * 
 * @author mxcorrea
 *
 */
public enum Planet {

	MERCURY(3.302e+23, 2.477e7), 
	VENUS(4.869e+24, 2.439e6), 
	EARTH(5.975e+24, 6.052e6), 
	MARS(6.419e+23, 6.378e6),
	JUPITER(1.899e+27, 3.393e6), 
	SATURN(5.685e+26, 7.149e7), 
	URANUS(8.683e+25, 6.027e7), 
	NEPTUNE(1.024e+26, 2.556e7);

	private static final double G = 6.67300E-11;
	private final double mass;
	private final double radius;
	private final double surfaceGravity;

	private Planet(
			final double mass, 
			final double radius) {
		this.mass = mass;
		this.radius = radius;
		this.surfaceGravity = G * mass / (radius * radius);
	}

	public double mass() {
		return mass;
	}

	public double radius() {
		return radius;
	}

	public double surfaceGravity() {
		return surfaceGravity;
	}

	public double surfaceWeight(
			final double mass) {
		return mass * surfaceGravity; 
	}

}
