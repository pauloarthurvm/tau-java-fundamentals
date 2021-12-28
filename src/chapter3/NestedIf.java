package chapter3;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
//        make >= 30000
//        job time >= 2 years - 24 months

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much you make a year:");
        Double salary = scanner.nextDouble();

        System.out.println("How many months are you working:");
        int months = scanner.nextInt();

        if (salary >= 30000 && months >= months){
            System.out.println("YOU GOOD!");
        } else {
            System.out.println("too bad");
        }



    }
}
