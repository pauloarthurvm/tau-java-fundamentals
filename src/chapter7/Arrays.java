package chapter7;

import java.util.concurrent.ThreadLocalRandom;

public class Arrays {

    public static void main(String[] args) {

        final int MIN = 1;
        final int MAX = 69;
        final int LENGTH = 6;

        int randomNum;
        int[] ticket = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            do {
                randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
            } while(haveNumber(randomNum, ticket));
            ticket[i] = randomNum;
        }
        java.util.Arrays.sort(ticket);
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(ticket[i]);
        }

    }

    private static boolean haveNumber(int numberToSearch, int[] array) {
        for (int value : array) {
            if (value == numberToSearch)
                return true;
        }
        return false;
    }


}
