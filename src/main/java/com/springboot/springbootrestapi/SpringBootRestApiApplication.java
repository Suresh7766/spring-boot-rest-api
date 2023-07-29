package com.springboot.springbootrestapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootRestApiApplication {
	
	private Logger logger = LoggerFactory.getLogger(SpringBootRestApiApplication.class);
	
	@PostConstruct
	public void initialContext() {
		logger.info("Initial Context Loaded!.");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

}
