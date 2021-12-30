package cointossgame;

import java.util.Random;

public class Coin {

//    It should contain
//    a field called side,
//    encapsulation,
//    constant variables for heads and tails,
//    a method called flip(), which randomly chooses heads or tails and assigns that value to side.

    private String side;
    public static final String HEADS = "HEADS";
    public static final String TAILS = "TAILS";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        Random random = new Random();
        if (random.nextBoolean()) {
            side = HEADS;
        } else {
            side = TAILS;
        }
    }
}
