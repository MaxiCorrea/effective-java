package com.maxicorrea.effectivejava.classes_and_interfaces.minimize_mutability;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Inmutable {

	private String att1;
	private String att2;
	
	public Inmutable(
			final String att1 ,
			final String att2) {
		
		this.att1 = att1;
		this.att2 = att2;
	}
	
	public String getAtt1() {
		return att1;
	}
	
	public String getAtt2() {
		return att2;
	}
	
}
