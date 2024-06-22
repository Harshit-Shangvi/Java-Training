package com.globalpayex;

public class Grade {
     public static char grade (int marks) {
         if (marks < 0 || marks > 100) return 'I';
         else if (marks >= 70) return 'A';
         else if (marks >= 60) return 'B';
         else if (marks >= 40) return 'c';
         else if (marks < 40) return 'F';

         return 'I';

     }
}
