package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int salary = 1000;
        int bonus = 250;

        System.out.println("Sales made this week:");
        int sales = scanner.nextInt();

        if (sales > 10) {
            salary += bonus;
        }

        System.out.println("Salary: $" + salary);

    }

}
