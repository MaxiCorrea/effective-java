package com.maxicorrea.effectivejava.creating_and_destroying_objects.prefer_dependency_injection;

import static java.util.Objects.requireNonNull;

import java.util.Collections;
import java.util.List;

/**
 * 
 * inyeccion de depencias.
 * 
 * Ventajas :
 * 
 * La inyeccion de dependencias proporciona flexibilidad y testabilidad.
 * 
 * @author maximiliano
 *
 */
public class SpellChecker {

	private final Lexicon dictionary;
	
	public SpellChecker(
			final Lexicon dictionary) {
		this.dictionary = requireNonNull(dictionary);
	}
	
	public boolean isValid(
			final String word) {
		return false;
	}
	
	public List<String> suggestions (
			final String typo) {
		return Collections.emptyList();
	}
	
	public Lexicon getDictionary() {
		return dictionary;
	}
}
