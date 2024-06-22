package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenSeriesTest {

    @Test
    void testEvenSeries(){
        var n= 11;
        var expected = "0,2,4,6,8,10";

        var actual = EvenSeries.numbers(n);

        assertEquals(expected,actual);
    }

}