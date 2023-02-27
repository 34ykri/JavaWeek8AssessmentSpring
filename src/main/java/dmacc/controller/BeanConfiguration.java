/**
 * 
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Pokemon;
import dmacc.beans.Type;

/**
 * @author akvang - Alexander Vang
 * CIS175 - Spring 2023
 * Feb 27, 2023
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Pokemon pokemon() {
		Pokemon bean = new Pokemon();
		bean.setName("Espeon");
		bean.setNickname("Unnie");
		bean.setLevel(50);
		return bean;
	}
	@Bean
	public Type type() {
		Type bean = new Type("Psychic", "No Secondary Type");
		return bean;
	}
}
