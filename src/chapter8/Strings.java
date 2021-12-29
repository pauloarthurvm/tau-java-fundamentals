package chapter8;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
//        countWords("I am studying java fundamentals");
//        reverseString("Programming is cool!");
        addSpaces("HelloWorld!ThisIsJava!");
    }

    private static void addSpaces(String text) {
        var modifiedString = new StringBuilder(text);
        for(int i = 0; i < modifiedString.length(); i++) {
            if(i != 0 && Character.isUpperCase(modifiedString.charAt(i))) {
                modifiedString.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedString);
    }

    private static void reverseString(String text) {
        for (int j = (text.length() - 1); j >= 0 ; j--) {
            System.out.print(text.charAt(j));
        }
    }

    private static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;
        System.out.println(String.format("It contains %d words", numberOfWords));
    }

}
