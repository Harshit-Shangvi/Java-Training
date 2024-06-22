package com.globalpayex;

import java.util.Arrays;
import java.util.HashSet;

public class PlaySet {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("mehul");
        uniqueNames.add("harshit");
        uniqueNames.add("mehul");
        System.out.println(uniqueNames);

        var list = Arrays.asList(1,2,3,1,4,3,6);
        HashSet<Integer> uniqueMarks = new HashSet<>(list);

        for(Integer marks: uniqueMarks){
            System.out.println(marks);
        }

        var nDiva= Arrays.asList(1,3,5);
        var nDivb= Arrays.asList(3,5,9);

        HashSet<Integer> s1= new HashSet<>(nDiva);
        HashSet<Integer> s2= new HashSet<>(nDivb);

        s1.retainAll(s2); //finds common between 2 and adds in s1
        System.out.println(s1);

        HashSet<Integer> s3= new HashSet<>(nDiva);
        HashSet<Integer> s4= new HashSet<>(nDivb);

        s3.addAll(s4);
        System.out.println(s3);








    }
}
