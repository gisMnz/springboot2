package com.digitalinnovationone.springboot2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${ENV_DB_URL:NENHUMA}")
	private String dbEnvironmentVariable;
	
	
	@GetMapping("/")
	public String helloMessage() {
		return "Hello, Digital Innovation One, again!";
	}

	@GetMapping("/envVariable")
	public String getEnvironmentVariable() {
		return "A seguinte variável de ambiente foi passada: " + dbEnvironmentVariable;
	}
}
