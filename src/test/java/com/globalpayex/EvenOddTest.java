package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void testIsEven(){
        var n=9;
        var expected = false;

        var actual = EvenOdd.isEven(n);

        assertEquals(expected, actual);

    }


    @Test
    void evenOdd() {
        var n=9;
        var expected = "Odd";

        var actual = EvenOdd.evenOdd(n);

        assertEquals(expected, actual);


    }
}