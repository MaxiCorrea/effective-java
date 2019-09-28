package com.maxicorrea.effectivejava.classes_and_interfaces.minimize_mutability;
/**
 * Inmutable class Example
 * @author mxcorrea
 *
 */
public class ComplexNumber {

	private final double re;
	private final double im;
	
	public static final ComplexNumber valueOf(
			final double re ,
			final double im) {
		return new ComplexNumber(re,im);
	}
	
	private ComplexNumber (
			final double re ,
			final double im) {
		this.re = re;
		this.im = im;
	}
	
	public double realPart() {
		return re;
	}
	
	public double imaginaryPart() {
		return im;
	}
	
	public ComplexNumber plus(
			final ComplexNumber another) {
		double localRe = re + another.re;
		double localim = im + another.im;
		return new ComplexNumber(localRe, localim);
	}
	
	public ComplexNumber minus(
			final ComplexNumber another) {
		double localRe = re - another.re;
		double localIm =  im - another.im;
		return new ComplexNumber(localRe, localIm);
	}
	
	
	public ComplexNumber times(
			final ComplexNumber another) {
		double localRe = re * another.re - im * another.im;
		double localIm = re * another.im + im * another.re;
		return new ComplexNumber(localRe, localIm);
	}
		
	@Override 
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ComplexNumber))
			return false;
		ComplexNumber c = (ComplexNumber) o;
		return Double.compare(c.re, re) == 0
			&& Double.compare(c.im, im) == 0;
	}
	
	@Override 
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}
	
}
