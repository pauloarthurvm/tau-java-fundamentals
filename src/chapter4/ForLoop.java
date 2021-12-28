package chapter4;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Total items:");
        int quantity = scanner.nextInt();
        double total = 0;

        for(int i = 0; i < quantity; i++) {
            System.out.println("Cost of item " + (i+1) + ":");
            double price = scanner.nextDouble();
            total = total + price;
        }

        System.out.println("Total: " + total);
    }


}
