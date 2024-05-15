package com.example.Testingdemo.classorder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(3)
public class OrderServiceTest {
    @BeforeAll
    static void setup() {
        System.out.println("Test method related to order");
    }

    @Test
    void testFunction() {
        System.out.println("Order related test");
    }
}
