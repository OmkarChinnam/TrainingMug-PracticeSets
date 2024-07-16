// Task: Write the code to find if the given number is a perfect number or not?
package com.PracticeSets.PerfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {

        // Declare and initialize variables
        int div;
        div = 1;

        int num;
        num = 496;

        // Variable to store the sum of divisors
        int sum;
        sum = 0;

        // Loop to find all divisors and calculate their sum
        while (div <= num/2){
            if (num % div == 0){
                sum  += div;
            }
            div++;
        }
        // Check if the sum of divisors is equal to the number
        if (num == sum) {
            System.out.println(num + " is Perfect Number");
        } else  {
            System.out.println(num + " is Not a Perfect Number");
        }
    }
}
