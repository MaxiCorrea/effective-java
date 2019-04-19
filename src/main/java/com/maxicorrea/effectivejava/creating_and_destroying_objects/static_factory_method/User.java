package com.maxicorrea.effectivejava.creating_and_destroying_objects.static_factory_method;

/**
 * 
 * Ventajas
 * 
 * 1) Los metodos de fabrica estaticos pueden tener un nombre descriptivo de las caracteristicas 
 * 	  del objeto que se va a crear a diferencia de los constructores que deben tener el nombre 
 * 	  de la clase.
 * 
 * 2) Los metodos de fabrica estaticos puede no crear una instancia de la clase cada vez que 
 * 	  son invocados (Quizas pueden reutilizar alguna otra instancia creada).
 * 
 * 3) Los metodos de fabrica estaticos a diferencia de los constructores pueden devolver 
 * 	  cualquier subtipo de la clase que tienen como valor de retorno.
 * 
 * 4) Los metodos de fabrica estaticos pueden devolver cualquier subtipo de clase que tiene
 * 	  como valor de retorno dependiendo del valor o valores de sus parametros. 
 * 
 * 5) Los metodos de fabrica estaticos pueden devolver cualquier subtipo de clase que tiene
 * 	  como valor de retorno incluso si aun no existiera.(Ejemplo JDBC)
 * 
 * 
 * 
 * Deventajas.
 * 
 * 1) Las clase metodos de fabrica estaticos con contructores privados o protejidos no pueden
 * 	  subclasificarse.
 * 
 * 2) A algunos programadores les cuesta encontrar los metodos de fabrica estaticos.
 * 
 * @author maximiliano
 *
 */
public class User {
	
	/*Ejemplo de la primera ventaja*/
	public static final User createWithDefaultCountry(
			final String nick ,
			final String email) {
		final String defaultCountry = "Argentina";
		return new User(nick ,email ,defaultCountry);
	}
	
	private final String nick;
	private final String email;
	private final String country;
	
	private User(
			final String nick ,
			final String email , 
			final String country) {
		this.nick = nick;
		this.email = email;
		this.country = country;
	}
	
	public String getNick() {
		return nick;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "User [nick=" + nick + ", email=" 
				+ email + ", country=" + country + "]";
	}

}
