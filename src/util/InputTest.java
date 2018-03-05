package util;

public class InputTest {
    public static void main(String[] args) {

        Input userInput = new Input();

        int num1 = userInput.getInt(1, 100, "Enter number between 1 and 100" );
        System.out.println("You inputted " + num1);

        System.out.println("Do you want to input another integer?");
        boolean answer = userInput.yesNo();

        if(answer) {
            int num2 = userInput.getInt("Please enter any integer");
            System.out.println("You inputted: " + num2);
        }

        if(userInput.yesNo("Wanna enter an integer?")) {
            int num3 = userInput.getInt("Please enter a number");
            System.out.println("You entered: " + num3);
        }

        double aDouble;
        aDouble = userInput.getDouble("Please input a number");
        System.out.println("You inputted " + aDouble);

        double doubleMinMax;
        doubleMinMax = userInput.getDouble(1.1, 9.9, "Input a number between 1.1 and 9.9");

        System.out.println(doubleMinMax);






    }
}
