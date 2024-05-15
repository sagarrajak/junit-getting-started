package com.example.Testingdemo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operation in calculator class")
@Disabled
class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    static void beforeAllSetup() {
        System.out.println("this is executed before all");
    }

    public static Stream<Arguments> integerSubtractionStreamParameters() {
        return Stream.of(Arguments.of(19, 1, 18), Arguments.of(22, 1, 21), Arguments.of(32, 3, 29));
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("Test 4/2 = 2")
    @Test
//    @Disabled("TODO: will work on this future")
    void testIntegerDivision_When10isDividedBy5_ShouldReturnTwo() {
        assertThat(calculator.integerDivision(10, 5)).isEqualTo(2);
        assertEquals(calculator.integerDivision(10, 5), 2, "Message");
    }

    @DisplayName("Test 4/0 = Arthamatic Exception")
    @Test
    void testIntegerDivision_whenSomethingIsDividedByZero_shouldThrowArhtmaticException() {
        assertThrowsExactly(ArithmeticException.class, () -> calculator.integerDivision(10, 0));
    }

    @DisplayName("Test 10 - 20 = -10")
    @Test
    void integerSubtraction() {
        int val = calculator.integerSubtraction(10, 20);
        assertNotEquals(val, 10);
        assertEquals(val, -10);
    }

    @DisplayName("Using parameterized test")
    @ParameterizedTest()
    @MethodSource("integerSubtractionStreamParameters")
    void integerSubtraction(int minuend, int subtrahead, int expectedResult) {
        int output = calculator.integerSubtraction(minuend, subtrahead);
        assertEquals(output, expectedResult);
    }

    @AfterAll
    static void afterAllSetup() {
        System.out.println("this is executed after all");
    }


    @DisplayName("Test add two number result")
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "3, 4, 7",
            "10, 2, 12"
    })
    void addTwoNumbers(int inputFirst, int inputSecond, int output) {
        int outputReturn = calculator.addTwoNumbers(inputFirst, inputSecond);
        assertEquals(output, outputReturn);
    }

    @DisplayName("Test used with adding two number with csv")
    @ParameterizedTest
    @CsvFileSource(resources = "/integerAddition.csv")
    void addTwoNumbersWithCsv(int inputFirst, int inputSecond, int output) {
        int outputReturn = calculator.addTwoNumbers(inputFirst, inputSecond);
        assertEquals(output, outputReturn);
    }

    @DisplayName("value source demostration")
    @ParameterizedTest
    @ValueSource(strings = {"John", "kate", "alice"})
    void valueSourceDemostraction(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }
}