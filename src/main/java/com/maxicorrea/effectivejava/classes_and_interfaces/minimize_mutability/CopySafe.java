package com.maxicorrea.effectivejava.classes_and_interfaces.minimize_mutability;

import java.math.BigInteger;
/**
 * 
 * @author mxcorrea
 *
 */
public class CopySafe {

	public static final BigInteger copy(
			final BigInteger bigInteger) {
		return bigInteger.getClass() == BigInteger.class ? 
			   bigInteger : new BigInteger(bigInteger.toByteArray());
	}
	
}
