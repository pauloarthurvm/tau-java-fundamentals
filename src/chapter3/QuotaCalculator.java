package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quota = 10;

        System.out.println("Sales made:");
        int sales = scanner.nextInt();

        if (sales >= 10) {
            System.out.println("CONGRATS!");
        } else {
            System.out.println("too bad");
        }

    }


}
