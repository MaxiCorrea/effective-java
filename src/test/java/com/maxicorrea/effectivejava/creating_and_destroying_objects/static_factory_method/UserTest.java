package com.maxicorrea.effectivejava.creating_and_destroying_objects.static_factory_method;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void shouldCreateAUserWithCountryByDefault() {
		User user = User.createWithDefaultCountry("Max", "max@gmail.com.ar");
		assertNotNull(user);
		String expectedNick = "Max";
		assertEquals(expectedNick , user.getNick());
		String expectedEmail = "max@gmail.com.ar";
		assertEquals(expectedEmail , user.getEmail());
		String expectedCountry = "Argentina";
		assertEquals(expectedCountry , user.getCountry());
	}

}
