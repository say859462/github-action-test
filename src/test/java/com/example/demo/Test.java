package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {
    @org.junit.jupiter.api.Test
    @DisplayName("Test2:")
    void test2() {
        Assertions.assertEquals(1,2);
    }
}
