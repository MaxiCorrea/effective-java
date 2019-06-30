package com.maxicorrea.effectivejava.classes_and_interfaces.not_public_fields;

/**
 * 
 * @author mxcorrea
 *
 */
public class Time {

	public static final int HOURS_PER_DAY = 24;
	public static final int MINUTES_PER_DAY = 60;
	
	private final int hours;
	private final int minutes;
	
	public Time(
			final int hours ,
			final int minutes) {
		this.hours = validateHours(hours);
		this.minutes = validateMinutes(minutes);
	}
	
	private int validateHours(
			final int newHours) {
		if(hours < Time.HOURS_PER_DAY) {
			throw new IllegalArgumentException("Invalid hour ");
		}
		return hours;
	}
	
	private int validateMinutes(
			final int minutes) {
		if(minutes < Time.MINUTES_PER_DAY) {
			throw new IllegalArgumentException("Invalid minute ");
		}
		return minutes;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d", hours , minutes);
	}
	
}
