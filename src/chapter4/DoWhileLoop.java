package chapter4;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
//        Insert to number to a sum
//        Repeat as the user wants

        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        do {
            System.out.println("Number 1: ");
            int num1 = scanner.nextInt();
            System.out.println("Number 2: ");
            int num2 = scanner.nextInt();
            System.out.println("Sum: " + (num1+num2));

            System.out.println("Insert Q letter and enter to exit, or R to repeat");
            String repeat = scanner.next();
            if (repeat.equalsIgnoreCase( "Q")) {
                done = true;
            }
        } while (!done);



    }
}
