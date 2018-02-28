import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        int userInput;
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        userInput = sc.nextInt();
//
//        System.out.println("You entered: " + userInput);


//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter three words: ");
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//
//        System.out.println(wordOne );
//        System.out.println(wordTwo );
//        System.out.println(wordThree );


//        System.out.println("What is your favorite thing to do on the weekends? ");
//        String userString = sc.nextLine();
//        System.out.println("You entered: " + userString);


        System.out.print("Enter the length: ");
        double width = Double.parseDouble(sc.nextLine());

        System.out.print("Enter the length: ");
        double length = Double.parseDouble(sc.nextLine());

        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);



    }
}
