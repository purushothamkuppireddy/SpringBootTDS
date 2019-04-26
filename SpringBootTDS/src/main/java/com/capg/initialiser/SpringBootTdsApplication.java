package com.capg.initialiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.capg.controller")
public class SpringBootTdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTdsApplication.class, args);
	}

}
