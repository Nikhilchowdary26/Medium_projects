package com.demo.simple_java_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleJavaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleJavaAppApplication.class, args);
		System.out.println("App started Successfully");
	}
}
