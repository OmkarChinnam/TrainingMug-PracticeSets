package com.example.variables;

public class StringAndChar {
    public static void main(String[] args) {
        // Declaration of character variables
        char ch1;
        char ch2;

        // Declaration of String variable
        String name;

        // Storing characters (char should be stored in single quotes)
        ch1 = 'A';
        ch2 = 'a';

        // Storing a string (strings are stored in double quotes)
        name = "Omkar";

        // Getting ASCII values of respective characters
        int num1;
        int num2;
        num1 = (int) ch1;  // Casting char to int to get ASCII value
        num2 = (int) ch2;  // Casting char to int to get ASCII value

        // Outputting ASCII values and string
        System.out.println("ASCII value of " + ch1 + ": " + num1);
        System.out.println("ASCII value of " + ch2 + ": " + num2);
        System.out.println("Name: " + name);
    }
}
