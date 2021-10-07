package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void play() {
        int maxTries = 10;
        int theNumber = ThreadLocalRandom.current().nextInt(1, 101);

        for(int i = 1; i<=maxTries; i++) {
            //generate random number
            //Prompt for guess
            //Take input from User
            int guess = UserInputUtil.getIntFromUser("Try " + i + " of " + maxTries);
            //Evaluate
            String result= evaluateGuess(guess, theNumber);
            System.out.println(result);
            if(result.startsWith("You guess the number!")){
                break;
            }
        }
    }

    public static String evaluateGuess(int guess, int theNumber) {
        if (guess == theNumber) {
            return "you guess the number! It was " + theNumber;
        }
        if (guess < theNumber) {
            return "Go higher!";
        }else {
            return "Go lower!";
        }
    }
}

