package com.maxicorrea.effectivejava.classes_and_interfaces.prefer_interfaces_to_abstract_classes;

import java.applet.AudioClip;

/**
 * 
 * Definicion de tipos "mixin" con interfaces
 * 
 * @author mxcorrea
 *
 */
public interface SingerSongwriter extends Singer , Songwriter {

	AudioClip strum();
	
	void actSensitive();

}
