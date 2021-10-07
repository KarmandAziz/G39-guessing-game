package org.example;

import java.util.Scanner;

public class UserInputUtil {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String THE_VALUE_ENTERED_IS_NOT_A_VALID_INTEGER = "The value entered is not a valid integer";

    public static String getStringFromUser(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextLine();
    }

    public static int getIntFromUser(String prompt) {

        int number = 0;
        boolean invalidNumber = true;
        while(invalidNumber) {
            System.out.println(prompt);
            try{
                String s = SCANNER.nextLine();
                number = Integer.parseInt(s);
                invalidNumber = false;
            }catch (NumberFormatException ex){
                System.out.println(THE_VALUE_ENTERED_IS_NOT_A_VALID_INTEGER);
            }
        }
        return number;


    }

}
