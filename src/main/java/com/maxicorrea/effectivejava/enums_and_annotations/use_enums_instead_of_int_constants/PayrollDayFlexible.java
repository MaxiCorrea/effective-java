package com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants;

/**
 * Emplementacion Enum Strategy Pattern
 * 
 * @author mxcorrea
 *
 */
public enum PayrollDayFlexible {

	MONDAY,

	TUESDAY,

	WEDNESDAY,

	THURSDAY,

	FRIDAY,

	SATURDAY(PayStrategy.WEEKEND), // injected Strategy
	
	SUNDAY(PayStrategy.WEEKEND);

	private final PayStrategy payStrategy;

	int pay(int minutesWorked, int payRate) {
		return payStrategy.pay(minutesWorked, payRate);
	}
	
	private PayrollDayFlexible() {
		payStrategy = PayStrategy.WEEKDAY; // default Strategy
	}

	private PayrollDayFlexible(
			final PayStrategy pay) {
		this.payStrategy = pay;
	}

}
