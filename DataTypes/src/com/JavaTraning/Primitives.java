package com.JavaTraning;

public class Primitives {
    public static void main(String[] args) {
//        To Store Integer type Data we have Four different DataTypes

        // byte: 8-bit signed integer, range from -128 to 127
        // Typically used for saving memory in large arrays where the memory savings matter
        byte age;
        age = 54;

        // short: 16-bit signed integer, range from -32,768 to 32,767
        // Used to save memory in large arrays, often used in place of int where their limits are enough
        short s;
        s = 30000;


        // int: 32-bit signed integer, range from -2^31 to 2^31-1
        // Default integer type, typically used for general-purpose integer variables
        int averageSalary;
        averageSalary = 54000;


        // long: 64-bit signed integer, range from -2^63 to 2^63-1
        // Used when a wider range than int is needed, suffix 'L' is mandatory
        long annualSalary;
        annualSalary = 900000l;


//        To store real numbers we have two different DataTypes

        // float: 32-bit IEEE 754 floating point, single precision
        // Typically used for saving memory in large arrays of floating point numbers
        // Suffix 'f' is mandatory
        float price;
        price = 148.65f;

        // double: 64-bit IEEE 754 floating point, double precision
        // Default type for decimal values, generally the default choice for decimal numbers
        double annualSale;
        annualSale = 5400018.958;


//        To Store charater values we have one DataType

        // char: 16-bit Unicode character
        // Used to store any character
        char c;
        c = 'A';

//        To Store boolean values we have one DataType

        // boolean: true or false
        // Used for simple flags that track true/false conditions
        boolean bl;
        bl = false;


        System.out.println("Byte value: " + age);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + averageSalary);
        System.out.println("Long value: " + annualSalary);
        System.out.println("Float value: " + price);
        System.out.println("Double value: " + annualSale);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + bl);

    }
}
