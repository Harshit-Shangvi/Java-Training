package com.globalpayex;

import java.util.Arrays;

public class PlayArrayList {
    public static void main(String[] args) {
        var nos = Arrays.asList(10, 4, 1, 9, 7);

        /*for (int no : nos) {
            if (no % 2 == 0 && no > 4) {
                System.out.println(no);

            }
        }*/
        nos.forEach(no ->{
            if (no % 2 == 0 && no > 4) {
                System.out.println(no);


            }
        });
        var names = Arrays.asList("HARSHIT","shangvi", "mehul","xyz");
        names.forEach(name->{
            if(name.length()>5){
                System.out.println(name.toUpperCase());

            }
            else{
                System.out.println(name.toLowerCase());

            }

        });



    }
}
