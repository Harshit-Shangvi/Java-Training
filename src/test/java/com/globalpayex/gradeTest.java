package com.globalpayex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest{
    @Test
    void testGrade() {

        var a = 95;
        var expected= 'A';

        var actual= Grade.grade(a);

        assertEquals(expected,actual);


    }
    @ParameterizedTest
    @CsvSource({

            "71,A",
            "70,A",
            "62,B",
            "39,F"




    })
    void testGrader(int marks,char expected){
        var actual = Grade.grade(marks);
        assertEquals(expected,actual);

    }






}
