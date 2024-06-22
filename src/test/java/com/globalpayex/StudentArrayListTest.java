package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentArrayListTest {

        @Test
        void testStudentArraylist() {
            ArrayList<Student> students = new ArrayList<>();
            var s1 = new Student("Harshit", 40, 'm', 10);
            var s2 = new Student("Mehul", 20,'m', 5);
            var s3 = new Student("Akshat", 20, 'm', 15);

            students.add(s1);
            students.add(s2);
            students.add(s3);

            double expected = 10.0;
            double actual = StudentArrayList.average(students);

            assertEquals(expected,actual);



    }

}