package com.devme.coinApp;

import java.util.Random;

public class Coin {
    private String side;

    public static final String TAILS = "Tails";
    public static final String HEADS = "Heads";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){
        if (new Random().nextBoolean()){
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }
        return getSide();
    }
}
