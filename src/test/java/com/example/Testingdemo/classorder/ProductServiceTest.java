package com.example.Testingdemo.classorder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(2)
public class ProductServiceTest {
    @BeforeAll
    static void setup() {
        System.out.println("Test method related to product");
    }

    @Test
    void testFunction() {
        System.out.println("Product related test");
    }
}
