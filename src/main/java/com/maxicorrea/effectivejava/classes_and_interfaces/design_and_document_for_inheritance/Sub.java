package com.maxicorrea.effectivejava.classes_and_interfaces.design_and_document_for_inheritance;

import java.time.Instant;
/**
 * 
 * @author mxcorrea
 *
 */
public class Sub extends Super {

	private final Instant instant;
	
	public Sub() {
		instant = Instant.now();
	}

	@Override
	void overrideMe() {
		System.out.println(instant);
	}
	
}
