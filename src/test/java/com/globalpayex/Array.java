package com.globalpayex;

public class Array {
    public static double ArrayAverage (int[] arr){
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;




    }

    public static int ArrayMax(int[] arr){
        int max = arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }



}



/*

public class ArrayOps{
    public static float average(int[] elements){

    }
}
*/