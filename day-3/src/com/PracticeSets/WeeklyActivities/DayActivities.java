// Task: Write a program that suggests activities based on the day of the week.
package com.PracticeSets.WeeklyActivities;

public class DayActivities {
    public static void main(String[] args) {

        byte day;
        day = 2;

 // Use a switch statement to suggest activities for each day of the week
        switch (day) {
            case 1:
                System.out.println("Monday: Gym");
                break;
            case 2:
                System.out.println("Tuesday: Yoga");
                break;
            case 3:
                System.out.println("Wednesday: Swimming");
                break;
            case 4:
                System.out.println("Thursday: Reading");
                break;
            case 5:
                System.out.println("Friday: Movies");
                break;
            case 6:
                System.out.println("Saturday: Hiking");
                break;
            case 7:
                System.out.println("Sunday: Rest");
                break;
            default:
                System.out.println("Invalid day. Please enter a value between 1 and 7.");
        }

    }
}
