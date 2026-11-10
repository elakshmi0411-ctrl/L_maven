package com.example.mavennn;

/**
 * Hello world!
 */




public class Grade {

    public static String calculateGrade(int marks) {

        if (marks > 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 70) {
            return "C";
        }
        else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        System.out.println("Grade for 95: " + calculateGrade(95));
        System.out.println("Grade for 85: " + calculateGrade(85));
        System.out.println("Grade for 75: " + calculateGrade(75));
        System.out.println("Grade for 60: " + calculateGrade(60));

    }
}