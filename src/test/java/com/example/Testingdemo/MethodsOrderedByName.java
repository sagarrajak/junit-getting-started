package com.example.Testingdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// sorting by method name
@TestMethodOrder(MethodOrderer.MethodName.class)
@Disabled
public class MethodsOrderedByName {
    @Test
    void testA() {
        System.out.println("Running test A");
    }

    @Test
    void testB() {
        System.out.println("Running test B");
    }

    @Test
    void testC() {
        System.out.println("Running test C");
    }


    @Test
    void testD() {
        System.out.println("Running test D");
    }
}
