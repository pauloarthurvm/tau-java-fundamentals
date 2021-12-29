package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUseful {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of grades:");
        int size = scanner.nextInt();
        double[] grades = new double[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Grade " + (i+1) + ":");
            grades[i] = scanner.nextDouble();
        }

        System.out.println("Average: " + getAverage(grades));
        System.out.println("Highest: " + getHighest(grades));
        System.out.println("Lowest: " + getLowest(grades));
    }

    private static double getLowest(double[] grades) {
        Arrays.sort(grades);
        return grades[0];
    }

    private static double getHighest(double[] grades) {
        Arrays.sort(grades);
        return grades[grades.length - 1];
    }

    private static double getAverage(double[] grades) {
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return (total / grades.length);
    }

}
