package com.example.Testingdemo;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Disabled
public class MethodOrderedByCustomOrder {
    @Test
    @Order(1)
    void addRecord() {
        System.out.println("Running test: addRecord");
    }

    @Test
    @Order(2)
    void checkIfRecordExist() {
        System.out.println("Running test: checkIfRecordExist");
    }

    @Test
    @Order(3)
    void updateRecord() {
        System.out.println("Running test: updateRecord");
    }

    @Test
    @Order(4)
    void deleteRecord() {
        System.out.println("Running test: deleteRecord");
    }
}
