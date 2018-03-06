package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input()  {

        scanner = new Scanner (System.in);
    }


    public String getString() {
        return scanner.next();
    }
    public String getString(String prompt) {
        return scanner.next();
    }



    //    prompt being asked
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

// y/n answer for prompt
    public boolean yesNo() {
        String answer = getString();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

//    min and max with user input
    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput < min && userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

//    prompt
    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

//    integer
    public int getInt() {
    return scanner.nextInt();
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }


    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput < min && userInput > max) {
            return getDouble(min, max);
            } else {
            return userInput;
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

}
