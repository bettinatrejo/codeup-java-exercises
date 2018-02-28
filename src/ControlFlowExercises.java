import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        -LOOP BASICS-

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is equal to " + i);
//            i++;
//        }

//        for(int i =5; i <= 15; i++) {
//            System.out.println("i is equal to " + i);
//        }


//        int count = 0;
//        do {
//            System.out.println("Count is "+ count);
//            count= count + 2;
//        } while (count <= 100);


//        for(int i =0; i <= 100; i+=2) {
//            System.out.println("i is equal to " + i);
//        }


//        int count = 100;
//        do {
//            System.out.println("Count is "+ count);
//            count= count - 5;
//        } while (count >= -10);


//        for(int i =100; i >= -10; i-=5) {
//            System.out.println("i is equal to " + i);
//        }


//        long count = 2;
//        do {
//            System.out.println(count);
//            count= count*count;
//        } while (count < 1000000);


//        for(long count =2; count < 1000000;) {
//            System.out.println(count);
//            count= count*count;
//        }

//      -FIZZBUZZ-

//        for(int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        -DISPLAY A TABLE OF POWERS-

//        Scanner sc = new Scanner(System.in);
//
//            String input = "yes";
//        do
//        {
//
//            System.out.print("Enter a number: ");
//            int userInput = sc.nextInt();
//
//            String header = "Number  " + "Squared " + "Cubed   " + "\n"
//                    +   "======  " + "======= " + "=====   ";
//            System.out.println(header);
//
//            int square = 0;
//            int cube = 0;
//
//            String row = "";
//            for (int i = 1; i <= userInput; i++)
//            {
//
//                square = i * i;
//                cube = i * i * i;
//
//                row = i + "       " + square + "       " + cube;
//                System.out.println(row);
//            }
//
//            System.out.print("Continue? (yes/no): ");
//            input = sc.next();
//            System.out.println();
//
//        }
//        while (!input.equalsIgnoreCase("no"));

//      -Covert given number grades into letter grades-


        Scanner sc = new Scanner(System.in);
        String input = "y";

        do {

            System.out.print("Enter a numerical grade: ");
            int userInput = sc.nextInt();
            char result;
            if (userInput >= 90)
                { result = 'A'; }
            else if (userInput >= 80)
                { result = 'B'; }
            else if (userInput >= 70)
                { result = 'C'; }
            else if (userInput >= 60)
                { result = 'D'; }
            else
                { result = 'F'; }

            System.out.println("The grade is:  " + result);

            System.out.print("Continue? (y/n): ");
            input = sc.next();
            System.out.println();

        } while (!input.equalsIgnoreCase("n"));





    }
}
