package com.boot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private String name;
	public static void main(String[] args) {
		ConfigurableApplicationContext run = 
			SpringApplication.run(Application.class, args);
		//changes for HIS-134
		run.close();
	}

}
