import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

    game(1,5);

    }


    public static void game(int min, int max) {
        Scanner sc = new Scanner(System.in);
        String input = "y";
        double randResponse = (Math.round(Math.random() * 5 + 1));

        do {
            System.out.println("Guess the number: ");
            int userInput = sc.nextInt();


            System.out.println("The computer number is: " + randResponse);

            if (userInput == randResponse) {
                randResponse = (Math.round(Math.random() * 5 + 1));
                System.out.println("Good Guess!");
                System.out.println("Would you like to guess a new number? (y/n)");
                input = sc.next();
                System.out.println();
            } else if (userInput > randResponse) {
                System.out.println("Lower!");
            } else if (userInput < randResponse){
                System.out.println("Higher!");
            }


            } while (!input.equalsIgnoreCase("n")) ;

    }
}

