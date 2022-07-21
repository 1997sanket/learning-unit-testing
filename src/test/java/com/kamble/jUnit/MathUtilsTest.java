package com.kamble.jUnit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @Test   //Test annotation registers this method with the jUnit engine
    @DisplayName("This method calculates area of a circle.")
    void areaOfCircle() {

        //We need to create Object inorder to call the method.
//        MathUtils mathUtils = new MathUtils();
        double actual = mathUtils.areaOfCircle(2);
        double expected = 12.566370614359172;

        //I'm asserting "telling" jUnit that actual and expected are equal.
        //We can add this extra message inorder for future developers to understand what this method is supposed to do exactly and make their lives easier.
        assertEquals(expected, actual, "This method should return area of a circle");
    }

    @Test
    void divide() {
//        MathUtils mathUtils = new MathUtils();

        //I'm telling jUnit that this method should throw an Exception.
        assertThrows(ArithmeticException.class, ()->mathUtils.divide(1,0), "Dividing by zero should throw an Arithmetic Exception");

//        assertThrows(NullPointerException.class, ()->mathUtils.divide(1,0));

    }

    @Disabled
    @DisplayName("This method is not tested by jUnit")  //This can be used to give good looking name while dealing with many test methods.
    void disabled() {
        fail("While doing TDD, suppose you want to checkin your code in between development. You can't because" +
                "you test method is still not successful. And it will fail during build process. In that case you can disable the test method");
    }

    @BeforeEach
    void beforeEachMethod() {
        System.out.println("Before each method");
        mathUtils = new MathUtils();
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println("After each method");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before even this Test class in instantiated, that why needs to be static, because Test class object is made for every method call");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After the Test class object is destroyed");
    }

}