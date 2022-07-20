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
        assertEquals(expected, actual);
    }


}