/*
    This program demonstrates arithmetic operations using the compound interest concept.
    Compound interest is calculated using the formula:

    A = P (1 + r/n)^(nt)

    where:
    P = principal amount (initial investment)
    r = annual interest rate (decimal)
    n = number of times interest is compounded per year
    t = time the money is invested for (in years)
    A = amount of money accumulated after n years, including interest
*/

package com.example.variables;

public class CompoundInterest_ArithmeticOperations {

    public static void main(String[] args) {


// Principal amount (initial investment)
        double principal = 1000.0;

        // Annual interest rate
        double rate = 0.05;

        // Number of times interest is compounded per year
        int compoundingsPerYear = 4; // Quarterly

        // Time the money is invested for (in years)
        int years = 10;

        // Calculate the amount of money accumulated after n years, including interest
        double amount = principal * Math.pow(1 + (rate / compoundingsPerYear), compoundingsPerYear * years);

        // Calculate total interest gained
        double totalInterest = (amount - principal);

        System.out.println("Principal: $" + principal);
        System.out.println("Annual Interest Rate: " + (rate * 100) + "%");
        System.out.println("Times Compounded Per Year: " + compoundingsPerYear);
        System.out.println("Years: " + years);
        System.out.println("Amount after " + years + " years: $" + amount);
        System.out.println("Interest gained: $" + totalInterest);
    }

}
