package chapter4;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
//        Each make 15/hour
//        Enter weekly hour for each person
//        Calculate pay

        int rate = 15;
        int maxHours = 40;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hours worked this week:");
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours) {
            System.out.println("Invalid total hours.");
            hoursWorked = scanner.nextDouble();
        }

        System.out.println("Total pay: " + (hoursWorked * rate));

    }
}
