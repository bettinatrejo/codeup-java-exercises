package movies;


import java.util.*;
import java.util.Arrays;



public class MoviesApplication {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Movie moviesArray[] = MoviesArray.findAll();

        int userInput;

        do {
            System.out.println("\nWhat would you like to do? \n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a movie\n" +
                    "\n" +
                    "Enter your choice: ");
            userInput = sc.nextInt();

            switch (userInput) {
                case (0):
                    System.out.println("Good-bye.");
                    break;
                case (1):
                    System.out.println("Movie Title/Category: \n");
                    for (Movie movie : moviesArray) {
                        System.out.println(movie.getName() + "-" + movie.getCategory());
                    }
                    break;
                case (2):
                    System.out.println("Movie Title/Category: \n");
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                    break;
                case (3):
                    System.out.println("Movie Title/Category: \n");
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                    break;
                case (4):
                    System.out.println("Movie Title/Category: \n");
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equalsIgnoreCase("horror")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                    break;
                case (5):
                    System.out.println("Movie Title/Category: \n");
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                    break;
                case (6):
                    Movie[] newMoviesArray = Arrays.copyOf(moviesArray, moviesArray.length +1);

                    int newIndex = moviesArray.length - 1;
                    String newValue = "Lion King";

                    for (int i = moviesArray.length - 1; i > newIndex; i--) {
                        newMoviesArray[i] = moviesArray[i];
                    }
//                    moviesArray[newIndex] = newValue;
                    System.out.println("New Array: " + Arrays.toString(moviesArray));

            }

        }while (userInput != 0) ;

        }

    }



