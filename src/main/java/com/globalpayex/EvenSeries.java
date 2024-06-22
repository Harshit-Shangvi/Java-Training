package com.globalpayex;

public class EvenSeries {

    public static String numbers(int n){

        String result = "";

        for(var i=0; i<=n; i = i + 2){
            result += i;
            if(i<n-1){
                result += ",";
            }
        }
        return result;


    }



}
