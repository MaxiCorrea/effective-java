package com.maxicorrea.effectivejava.enums_and_annotations.use_enummap_instead_of_ordinal_indexing;

/**
 * Utilizando ordinal para indexar Array de Arrays
 * 
 * @author mxcorrea
 *
 */
public enum Phase {

	SOLID, LIQUID, GAS;

	public static Transition from(Phase from, Phase to) {
		return Transition.TRANSITIONS[from.ordinal()][to.ordinal()];
	}
	
	public enum Transition {

		MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

		private static final Transition[][] TRANSITIONS = { 
				{ null, MELT, SUBLIME }, 
				{ FREEZE, null, BOIL },
				{ DEPOSIT, CONDENSE, null } };
	}

}
