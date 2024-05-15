package com.example.Testingdemo.classorder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(1)
public class UserServiceTest {
    @BeforeAll
    static void setup() {
        System.out.println("Test method related to user");
    }

    @Test
    void testFunction() {
        System.out.println("User related test");
    }
}
