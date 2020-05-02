package com.maxicorrea.effectivejava.enums_and_annotations.consistently_use_override_annotation;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author mxcorrea
 *
 */
public class MainBigramOverride {

	public static void main(String... args) {
		Set<BigramOverride> s = new HashSet<>();
		for (int i = 0; i < 10; i++)
			for (char ch = 'a'; ch <= 'z'; ch++)
				s.add(new BigramOverride(ch, ch));
		System.out.println(s.size());
	}

}
