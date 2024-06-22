package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {
/*
    @Test
    void testGet(){
        int[] arr = {5,3,4,6};
        MyArray a = new MyArray<Integer>(arr);
        a.set(1,100);
        var expected = 100;
        var actual = a.get(1);
        assertEquals(expected,actual);


    }*/

    /*@Test
    void testSet(){
        Integer[] nos = {5,3,4,6};
        var na = new MyArray<Integer>(nos);
        MyArray a = new MyArray(arr);
        var expected = 9;
        na.set(2,9);
        assertEquals(expected,na.get(2));

    }*/

    @Test
    void testMyArrayOfStudents(){
        Student[] students = {
                new Student("mehul",8,'m',90),
                new Student("rahul",9,'m',80),
                new Student("harshit",10,'m',70),
                new Student("prathmesh",11,'m',40),


        };

        MyArray<Student> na = new MyArray<>(students);

        assertEquals("mehul",na.get(1).getName());
    }


}