/* Task: Write a program that checks if a person is eligible to vote. The eligible age for voting
is 18 years or older. */
package com.PracticeSets.ControlStatements;
public class VoteEligibilityCheck {
    public static void main(String[] args) {
        byte age;
        age = 25;// Example age, can be changed to test different scenarios

        // Check if the age is less than 18
        if (age < 18) {
            // Print a message if the person is not eligible to vote
            System.out.println("You are not eligible to vote this year.");
        } else {
            // Print a message if the person is eligible to vote
            System.out.println("You are eligible to vote.");
        }
    }
}
