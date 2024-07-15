package com.example.variables;

public class SuperMarket_ManualConversion {
    public static void main(String[] args) {

/*      Let's assume this is a supermarket bill scenario. For this case,
        I've taken only two inputs to demonstrate explicit type casting,
        i.e., manual conversion of one data type to another.
 */
        double item1;
        double item2;

        item1 = 150.80;
        item2 = 520.90;

//        Casting the double data type to int
        int totalBill;
        totalBill = (int) (item1 + item2);

/*
        Here, you may observe that narrowing the data type may cause data loss,
        resulting in incorrect calculations. The correct result should be 671.70,
        but due to the casting, it becomes 671. This is a small example, but imagine
        dealing with a large number of computations. It could result in significant
        calculation errors and data loss in real-life scenarios.
*/
        System.out.println("The Total Bill For Your Cart Is : "  + totalBill);

    }
}
