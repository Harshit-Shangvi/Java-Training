package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Random;

public class UniversalSelection {

    public static <T> T surpriseMe(T[] elements){
        Random random = new Random();
        int n = random.nextInt(elements.length);
        return elements[n];
    }

    public static void main(String[] args) {
        String[] movies ={"3 idiots","Avatar", "Terminator","Robot"};
        String movie = surpriseMe(movies);
        System.out.println(movie);

        Student[] students = {
                new Student("harshit", 20, 'm',40),
                new Student("mehul", 30, 'm',60),
                new Student("jane", 60, 'f',30),
                new Student("prathmesh", 40, 'm',90)



        };
        Student monitor = surpriseMe(students);
        System.out.println(monitor);
    }
}
