package com.maxicorrea.effectivejava.methods.make_defensive_copies_when_needed;

import java.util.Date;

/**
 * 
 * @author mxcorrea
 *
 */
public final class PeriodSolution {

	private final Date start;
	private final Date end;
	
	public PeriodSolution(
			final Date start ,
			final Date end) {
		
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(
			this.start + " after " + this.end);
	}
	
	public final Date getStart() {
		return new Date(start.getTime());
	}
	
	public final Date getEnd() {
		return new Date(end.getTime());
	}
	
}
