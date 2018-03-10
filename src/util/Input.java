package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    int number = 0;
    double doubleNum = 0;

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
        String userInput = scanner.nextLine();
        try {
            number = Integer.valueOf(userInput);
        } catch (NumberFormatException e){
            System.out.println("Try again please");
            getInt("Enter another number");
        }
        return number;
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

//    public double getDouble(double min, double max) {
//        double userInput = getDouble();
//        if (userInput < min && userInput > max) {
//            return getDouble(min, max);
//            } else {
//            return userInput;
//        }
//    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        try{
            doubleNum = Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, that is not a double");
            getDouble("Enter Another Number");
        }
        return (doubleNum);
    }

//    public double getDouble(double min, double max, String prompt) {
//        System.out.println(prompt);
//        return getDouble(min, max);
//    }



//public int getHex(){
//    int userInput = scanner.nextLine();
//    return Integer.valueOf((userInput, radix: 16))
//
//}
}

