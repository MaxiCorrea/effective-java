package com.maxicorrea.effectivejava.enums_and_annotations.use_enums_instead_of_int_constants;

/**
 * Enum Strategy
 * 
 * @author mxcorrea
 *
 */
public enum PayStrategy {

	WEEKDAY {
		int overtimePay(int minsWorked, int payRate) {
			return minsWorked <= MINS_PER_SHIFT ? 0 : 
				(minsWorked - MINS_PER_SHIFT) * payRate / 2;
		}
	},
	
	WEEKEND {
		int overtimePay(int minsWorked, int payRate) {
			return minsWorked * payRate / 2;
		}
	};
	
	abstract int overtimePay(int mins, int payRate);

	private static final int MINS_PER_SHIFT = 8 * 60;

	int pay(int minsWorked, int payRate) {
		int basePay = minsWorked * payRate;
		return basePay + overtimePay(minsWorked, payRate);
	}

}
