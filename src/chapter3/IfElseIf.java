package chapter3;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
//        Give letter grade by test score

        Scanner scanner = new Scanner(System.in);
        Double score = scanner.nextDouble();
        char grade;

        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        } else if(score >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Your grade is: " + grade);

    }

}
