package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchStudents {
    public static void main(String[] args) {

        //search student based on user input and show details of student if found
        /*
        var students = Arrays.asList(
                new Student("jane",20,'f',90),
                new Student("harshit",50,'m',80),
                new Student("priyanka",60,'f',70)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the roll no");
        int rn = scanner.nextInt(); */


        /*
        boolean isFound = false;
        for (Student student: students){
            if(student.roll == rn){
                isFound=true;
                System.out.println(student);
                break;
            }
        }
        if (!isFound){
            System.out.println("Not found");
        }*/

        //if u just want to check if student is present and not like above where u also
        //print the details, use below..but .contains calls the isEquals which
        //checks the address..but we want to check values inside so we override
        //isEquals in Student such that it checks value instead of address

        /*
        if (students.contains(new Student("",rn,'m',0))){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }*/

        //above takes time to search so we use hashmaps for faster seacrh
        //HashMap<key,value>
        HashMap<Integer, Student> studentsMap = new HashMap<>();
        studentsMap.put(12,new Student("harshit",12,'m',80));
        studentsMap.put(13,new Student("mehul",13,'m',90));
        studentsMap.put(14,new Student("jane",14,'f',70));

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the roll no");
        int rn = scanner.nextInt();

        Student student = studentsMap.get(rn);

        if(student!= null){

            System.out.println(student);

        }
        else {
            System.out.println("not found");
        }





    }
}
