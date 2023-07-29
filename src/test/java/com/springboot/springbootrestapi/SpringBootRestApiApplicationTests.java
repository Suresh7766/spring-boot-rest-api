package com.springboot.springbootrestapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRestApiApplicationTests {

	private Logger logger = LoggerFactory.getLogger(SpringBootRestApiApplication.class);
	
	@Test
	void contextLoads() {
		logger.info("Test Case1 Passed");
		Assertions.assertTrue(true);
	}

}
