package chapter2javafundamentals;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
//        Create a program that asks a user for a season of the year, then a whole number, then an adjective.
//        And use the input to complete the sentence below. Output the result.

//        1. Hours Worked
//        2. Hourly pay rate
//        3. Multiply 1. and 2.
//        4. Display

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours you worked");
        Integer workedHours = scanner.nextInt();

        System.out.println("How much you are paid per hour?");
        Double payRate = scanner.nextDouble();

        System.out.println("You must receive = " + workedHours + " x " + payRate);
        System.out.println(workedHours*payRate);



    }

}
