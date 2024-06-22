package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentOpsTest {

    @Test
    void studentOps(){
        //testdata
        String name = "Harshit";
        char gender = 'm';
        int rollNo = 123;
        int marks = 70;
        var expected = "Name:Harshit\nGender:m\nRoll No:123\nMarks:70"; // Corrected semicolon and removed extra space

        var actual = StudentOps.ops(name, gender, rollNo, marks);

        assertEquals(expected, actual);
    }

}
