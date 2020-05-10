package com.maxicorrea.effectivejava.methods.make_defensive_copies_when_needed;

import java.util.Date;

/**
 * 
 * @author mxcorrea
 *
 */
public final class PeriodProblem {

	// mutable attributes
	private final Date start;
	private final Date end;
	
	public PeriodProblem(
			final Date start ,
			final Date end) {
		if (start.compareTo(end) > 0)
			throw new IllegalArgumentException(
			start + " after " + end);
		
		this.start = start; // aliasing
		this.end = end;
	}
	
	public final Date getStart() {
		return start; // problem
	}
	
	public final Date getEnd() {
		return end;
	}
}
