package cointossgame;

import java.util.Scanner;

import static cointossgame.Coin.HEADS;
import static cointossgame.Coin.TAILS;

public class CoinTossGame {

//    It asks player 1 to choose heads or tails, and ensures that player 1’s guess is valid.
//    Don't move on until player 1 actually has a valid guess.
//    Then, automatically assign player 2’s guess to the opposite of what player 1 chose.
//    You're going to flip the coin in this class to determine which side it landed on. Then you're going to determine a winner based on what the coin landed on.
//    Also, be sure to use methods appropriately in this class.
//    Give it a go.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player p1 = new Player("Bruno");
        Player p2 = new Player("Maria");
        Coin coin = new Coin();

        System.out.println(p1.getName() + " pick HEADS or TAILS");
        p1.setGuess(scanner.next());
        while(!p1.getGuess().equals(HEADS) && !p1.getGuess().equals(TAILS)) {
            System.out.println("Not valid!    Pick HEADS or TAILS");
            p1.setGuess(scanner.next());
        }

        if(p1.getGuess().equals(HEADS))
            p2.setGuess(TAILS);
        else
            p2.setGuess(HEADS);

        for (int i = 0; i < 20; i++) {
            coin.flip();
            if (coin.getSide().equals(p1.getGuess()))
                System.out.println("P1 WINS - COIN = " + coin.getSide() + " - P1 GUESS = " + p1.getGuess());
            else
                System.out.println("P2 WINS - COIN = " + coin.getSide() + " - P2 GUESS = " + p2.getGuess());
        }
    }




}
