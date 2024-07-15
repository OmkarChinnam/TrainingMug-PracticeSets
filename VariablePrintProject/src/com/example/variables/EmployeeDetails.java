package com.example.variables;

// This program demonstrates implicit type conversion (automatic typecasting)
// using an example of employee details.

public class EmployeeDetails {
    public static void main(String[] args) {
        // Variable declarations
        String empName;
        byte empAge;
        char empGender;
        long empMobileNum;
        int emAge;

        // Assigning values to the variables
        empName = "Omkar";
        empAge = 22;
        empGender = 'M';

        // Implicit type conversion (automatic typecasting)
        // long can hold larger values than int, so no explicit cast is needed.
        empMobileNum = 9456821188L; // Adding 'L' to indicate long literal

        // Implicit type conversion from byte to int
        // byte can be safely converted to int as int has a larger range.
        emAge = empAge;


        System.out.println("Employee Details: ");
        System.out.println("Name: " + empName);
        System.out.println("Age: " + empAge);
        System.out.println("Gender: " + empGender);
        System.out.println("Mobile Number: " + empMobileNum);
        System.out.println("Age (as int): " + emAge);
    }
}
