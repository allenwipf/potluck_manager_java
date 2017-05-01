package com.potluck_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PotluckManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotluckManagerApplication.class, args);
	}
}
