package com.maxicorrea.effectivejava.methods.check_parameters_for_validity;

import java.math.BigInteger;

/**
 * 
 * @author mxcorrea
 *
 */
public class MyClass {
	
	/**
	* Returns a BigInteger whose value is (this mod m). This method
	* differs from the remainder method in that it always returns a
	* non-negative BigInteger.
	*
	* @param m the modulus, which must be positive
	* @return this mod m
	* @throws ArithmeticException if m is less than or equal to 0
	*/
	public BigInteger mod(
			final BigInteger m) {
		if (m.signum() <= 0)
			throw new ArithmeticException("Modulus <= 0: " + m);
		
		// Do the computation
		return null;
	}
	
}
