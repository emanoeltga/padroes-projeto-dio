package com.correia.padroesprojetodio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 * Modulo Gerado pelo Spring Initializr.
 * Modulos selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - OpenFeign
 * Adcionado manual o springdoc-openapi-ui no pom
 * e Mysql
 * 
 * @author correia
 *
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoDioApplication.class, args);
	}

}
