package com.devme.coinApp;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    @Test
    void flip() {
        Coin coin = new Coin();
        String result = coin.flip();
        assertTrue(result.equals(Coin.TAILS) || result.equals(Coin.HEADS));
    }



}