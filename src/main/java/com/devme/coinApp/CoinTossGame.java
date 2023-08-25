package com.devme.coinApp;

import java.util.Scanner;

public class CoinTossGame {
    private Scanner scanner;
    public static void main (String[] args){
        CoinTossGame game = new CoinTossGame();
        Player p1 = new Player(game.askName());
        p1.setGuess(game.askGuess());

        Player p2 = new Player(game.askName());
        if(p1.getGuess().equalsIgnoreCase(Coin.HEADS)){
            p2.setGuess(Coin.TAILS);
        } else {
            p2.setGuess(Coin.HEADS);
        }

    }
    public String askName(){
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    public String askGuess(){
        String prompt = String.format("%s or %s?",Coin.HEADS, Coin.TAILS);
        System.out.println(prompt);
        String guess = scanner.nextLine();

        while (!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)){
            System.out.println("Invalid answer. Try again." + prompt);
            guess = scanner.nextLine();
        }

        return guess;
    }

    public void startGame(Player p1, Player p2, Coin coin){
        String winner;
        if(p1.getGuess().equalsIgnoreCase(coin.getSide())){
            winner = p1.getName();
        } else {
            winner = p2.getName();
        }

        System.out.println("The winner is " + winner);
    }
}
