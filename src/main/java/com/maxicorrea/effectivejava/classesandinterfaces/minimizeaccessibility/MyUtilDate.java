package com.maxicorrea.effectivejava.classesandinterfaces.minimizeaccessibility;

/**
 * 
 * @author maximiliano
 *
 */
public class MyUtilDate {

	// security problem
	public static final int[] DAYS_PER_MONTHS = {};
	
	// security
	public static final int[] daysPerMonths() {
		return DAYS_PER_MONTHS.clone();
	}
	
}
