import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//      Q1
//        addInt(3, 2);
//        subInt(3, 2);
//        multiply(3, 2);
//        division(10, 2);
//        modulus(2, 100);


//      Q2
//        getInteger(1, 10);

//        Q3
//        fact(1, 10);
//

//        Q4
//        rollDice(1, 6);
    }

    //  Q1

//    public static void addInt(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public static void subInt(int a, int b) {
//        System.out.println(a - b);
//    }
//
//    public static void multiply(int a, int b) {
//        System.out.println(a * b);
//    }
//
//    public static void division(int a, int b) {
//        System.out.println(a / b);
//    }
//
//    public static void modulus(int a, int b) {
//        System.out.println(a % b);
//    }

//  Q2
//
    public static int getInteger(int min, int max) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();

        if (userInput > min || userInput < max) {
            System.out.println("Good job!");

        } else {
            return getInteger(min, max);
        }
        return userInput;
    }


//   Q3

//    public static long fact(long min, long max) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = sc.nextInt();
//
//        String result = userInput + "! = ";
//        result += userInput;
//        if (userInput > 0 && userInput < 11) {
//
//            for (int i = userInput - 1; i >= 1; i--) {
//                result +=  " x " + i;
//                userInput *= i;
//            }
//        } else {
////            return fact(min, max);
//                System.out.println(result + " = " + userInput);
//        }
//        return userInput;
//
//    }
}

//    Q4

//    public static int rollDice(int die1, int die2) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of sides for the dice: ");
//        int userInput = sc.nextInt();
//
//        die1 = (int) (Math.random() * userInput) + 1;
//        die2 = (int) (Math.random() * userInput) + 1;
////        int roll = die1 + die2;
//
//        System.out.println("Die 1 is:" + die1);
//        System.out.println("Die 2 is:" + die2);
////        System.out.println("Your total roll is " + roll);
//
//
//    return userInput;
//    }
//}


