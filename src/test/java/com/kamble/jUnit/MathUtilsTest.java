package com.kamble.jUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test   //Test annotation registers this method with the jUnit engine
    void areaOfCircle() {

        //We need to create Object inorder to call the method.
        MathUtils mathUtils = new MathUtils();
        double actual = mathUtils.areaOfCircle(2);
        double expected = 12.566370614359172;

        //I'm asserting "telling" jUnit that actual and expected are equal.
        //We can add this extra message inorder for future developers to understand what this method is supposed to do exactly and make their lives easier.
        assertEquals(expected, actual, "This method should return area of a circle");
    }


    @Test
    void divide() {
        MathUtils mathUtils = new MathUtils();

        //I'm telling jUnit that this method should throw an Exception.
        assertThrows(ArithmeticException.class, ()->mathUtils.divide(1,0), "Dividing by zero should throw an Arithmetic Exception");

//        assertThrows(NullPointerException.class, ()->mathUtils.divide(1,0));

    }
}