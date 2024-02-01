package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	@DisplayName("context Loads Test:")
	void contextLoads() {
		Assertions.assertEquals(1,2);
	}

	@Test
	@DisplayName("test1:")
	void test1() {
		Assertions.assertEquals(1,2);
	}

}
