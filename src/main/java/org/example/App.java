package org.example;

import java.sql.SQLOutput;

/**
 * guessing game
 * @author Karmand Aziz
 */
public class App {

    public static final String GREETING = "Welcome to the guessing game!\nP. Play\nQ. Quit";
    public static final String GOOD_BYE = "Good Bye!";

    public static void main(String[] args) {

        boolean isRunning = true;
        do {
            String answer = UserInputUtil.getStringFromUser(GREETING);
            switch(answer){
                case "P":
                    GuessingGame.play();
                    break;
                case "Q":
                case "q":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Unrecognized input " + answer);
            }
        } while(isRunning);
        System.out.println(GOOD_BYE);
    }
}