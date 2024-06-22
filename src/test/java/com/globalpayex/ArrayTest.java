package com.globalpayex;

import org.junit.jupiter.api.Test;

import static com.globalpayex.Array.ArrayAverage;
import static com.globalpayex.Array.ArrayMax;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void testArrayAverage(){
        int[] arr = {5,3,6,2};
        var expected = 4.0;

        var actual= ArrayAverage(arr);

        assertEquals(expected,actual);


    }
    @Test
    void testArrayMax(){
        int[] arr = {5,3,6,2};
        var expected = 6;

        var actual = ArrayMax(arr);

        assertEquals(expected,actual);


    }

    /*
    @Test
    void testNextGenSum(){
        int actual= Array.nextGenSum(){




        }

     */




    }


