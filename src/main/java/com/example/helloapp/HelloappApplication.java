package com.example.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloappApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello from Subashree!";
	}
}
	