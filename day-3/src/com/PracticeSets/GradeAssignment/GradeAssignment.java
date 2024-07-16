// Task: Write a program that assigns grades based on a student's score.
package com.PracticeSets.GradeAssignment;
// This program assigns grades based on a student's score.
public class GradeAssignment {
    public static void main(String[] args) {
        byte score;
        score = 79;
// This program assigns grades based on a student's score.

//       checks if the score is 90 or above and assigns grade A.
        if (score >= 90){
            System.out.println("Grade A");

//       checks if the score is between 80 and 89 and assigns grade B.
        } else if (score >= 80) {
            System.out.println("Grade B");
//       checks if the score is between 70 and 79 and assigns grade C.
        } else if (score >= 70) {
            System.out.println("Grade C");
//       checks if the score is between 60 and 69 and assigns grade D.
        } else if (score >= 60) {
            System.out.println("Grade D");
//       assigns grade F if the score is below 60.
        } else {
            System.out.println("Grade F");
        }

    }
}
