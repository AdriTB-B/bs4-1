package com.adri.bs4_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Ejerciciobs41SpringApplication {
	public static ConfigurableApplicationContext cac;

	public static void main(String[] args) {
		cac = SpringApplication.run(Ejerciciobs41SpringApplication.class, args);
	}

}
