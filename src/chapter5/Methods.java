package chapter5;

import java.util.Scanner;

public class Methods {


//    Access modifier: PUBLIC, private, protected, default (same package access)
//    Non Access Modifier: static, final, abstract, synchronized - not really necessary
//    Return type: int, String, boolean, void, ...
//    Name: calculateSum - usually start with a VERB

    public static int calculateSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        getName();
    }

    private static void getName() {
        System.out.println("What is your name?");
        String name = new Scanner(System.in).next();
        greet(name);
    }

    private static void greet(String name) {
        System.out.println("Hello " + name);
    }


}
