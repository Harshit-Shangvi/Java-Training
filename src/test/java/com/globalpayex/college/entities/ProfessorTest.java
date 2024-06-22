package com.globalpayex.college.entities;

import com.abc.salary.SalaryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @BeforeEach
    void init(){
        Professor.count = 0;
    }

    @Test
    void testProfessorCount(){
        assertEquals(0,Professor.count);
        String[] arr1= {"c++", "Java"};
        String[] arr2= {"c++", "python"};

        var p1 = new Professor("harshit",'m',arr1, 15, 20);
        System.out.println(p1.calculate());
        var p2 = new Professor("kavish",'m',arr2, 25, 20);

        assertEquals(2,Professor.count);

        var p3 = new Professor("prathmesh",'m',arr1, 20,20);
        /*var actual= ;
        assertEquals();*/



    }
    @Test
    void testProfessorDetails(){

    }


}