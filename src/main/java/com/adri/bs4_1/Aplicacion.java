package com.adri.bs4_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Aplicacion {
	public static ConfigurableApplicationContext cac;

	public static void main(String[] args) {
		cac = SpringApplication.run(Aplicacion.class, args);
	}

}
