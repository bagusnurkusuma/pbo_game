/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.game;

/**
 *
 * @author D-23
 */
//File Main.java
public class Main {
    public static void main(String[] args) {
        
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();

        String[] words = {"apel", "pisang", "mangga"};
        wordGuessingGame wordGame = new wordGuessingGame(5, words);
        wordGame.play();
    }
}