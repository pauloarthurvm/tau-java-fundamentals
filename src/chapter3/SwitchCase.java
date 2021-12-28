package chapter3;

import java.security.MessageDigestSpi;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
//        Enter the grade and print a message

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter letter grade:");
        String grade = scanner.next();
        String message;

        switch (grade) {
            case "A":
                message = "AWESOME";
                break;
            case "B":
                message = "Great!";
                break;
            case "C":
                message = "Cool";
                break;
            case "D":
                message = "Oh";
                break;
            case "E":
                message = "Sorry";
                break;
            default:
                message = "ERROR!";
        }

        System.out.println(message);

    }

}
