package com.globalpayex;

public class StudentOps {

    public static String ops(String name, char gender, int rollNo, int marks) {
        return "Name: " + name + "\nGender: " + gender + "\nRoll No: " + rollNo + "\nMarks: " + marks;
    }

    public static char grade(int marks) {
        char result;

        if (marks < 0 || marks > 100) {
            result = 'I'; // Invalid marks
        }
        else if (marks >= 70) {
            result = 'A'; // Grade A
        }
        else if (marks >= 60) {
            result = 'B'; // Grade B
        }
        else if (marks >= 40) {
            result = 'C'; //
        }
        else {
            result = 'F';
        }

        return result;
    }
}
