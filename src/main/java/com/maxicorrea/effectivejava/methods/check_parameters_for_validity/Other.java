package com.maxicorrea.effectivejava.methods.check_parameters_for_validity;

import java.util.Objects;

public class Other {

	private String strategy;
	
	public Other(
			final String strategy) {
		this.strategy = Objects.requireNonNull(strategy, "strategy");
	}
	
	public String getStrategy() {
		return strategy;
	}
	
}
