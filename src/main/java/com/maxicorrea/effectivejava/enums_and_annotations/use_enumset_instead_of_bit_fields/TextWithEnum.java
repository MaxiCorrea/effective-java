package com.maxicorrea.effectivejava.enums_and_annotations.use_enumset_instead_of_bit_fields;

import java.util.Set;

/**
 * Para reemplazar el patron "Int Enum" mas las operaciones a nivel de bit para
 * pasar conjuntos de constantes, java agrego la clase EnumSet que hace ese
 * trabaja por nosotros dejando asi un codigo mas limpia y robusto.
 * 
 * @author mxcorrea
 *
 */
public class TextWithEnum {

	enum Style {
		STYLE_BOLD ,
		STYLE_ITALIC,
		STYLE_UNDERLINE ,
		STYLE_STRIKETHROUGH;
	}

	// text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
	public void applyStyles(Set<Style> styles) {
		// code
	}
	
}
