package com.maxicorrea.effectivejava.enums_and_annotations.use_enumset_instead_of_bit_fields;
/**
 * Si un grupo de constantes son utiizadas en conjunto es comun utilizar el patron "Int Enum"
 * para utilizarlos en conjunto con operaciones de deplazamiento de bits.
 * @author mxcorrea
 *
 */
public class Text {

	public static final int STYLE_BOLD = 1 << 0; 
	public static final int STYLE_ITALIC = 1 << 1;
	public static final int STYLE_UNDERLINE = 1 << 2;
	public static final int STYLE_STRIKETHROUGH = 1 << 4;
	
	public void applyStyles(int style) {
		// code
	}
	
}
