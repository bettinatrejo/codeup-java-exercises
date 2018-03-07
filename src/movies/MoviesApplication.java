package movies;

import util.Input;

import java.util.*;


public class MoviesApplication {
    static Movie[] film = MoviesArray.findAll();
    static int input;



    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nWhat would you like to do? \n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - view movies in the comedy category\n" +
                    "7 - view movies in the musical category\n" +
                    "8 - add a movie\n" +
                    "\n" +
                    "Enter your choice: ");
            input = sc.nextInt();

            switch (input) {
                case (0):
                    System.out.println("Good-bye.");
                    break;
                case (1):
                    allMovies();
                    break;
                case (2):
                    grabCategory("animated");
                    break;
                case (3):
                    grabCategory("drama");
                    break;
                case (4):
                    grabCategory("horror");
                    break;
                case (5):
                    grabCategory("scifi");
                    break;
                case(6):
                    grabCategory("comedy");
                case(7):
                    grabCategory("musical");
                case (8):
                    addMovie();
            }

        } while (input != 0);

    }

    public static void grabCategory(String genre) {
        System.out.println("Movie Title/Category: \n");
        for (Movie movie : film) {
            if (movie.getCategory().equalsIgnoreCase(genre)) {
                System.out.println(movie.getName() + "-" + movie.getCategory());

            }
        }
    }

    public static void addMovie() {
        Input userInput = new Input();
        System.out.println("Enter Title: ");
        String newMovie = userInput.getString();
        System.out.println("Enter Category: ");
        String newCategory = userInput.getString();
        Movie userMovie = new Movie(newMovie, newCategory);
        Movie[] userMovies = Arrays.copyOf(film, film.length-1);
        int lastIndex = userMovies.length-1;
        userMovies[lastIndex] = userMovie;
        film = userMovies;
    }

    public static void allMovies() {
        System.out.println("Movie Title/Category: \n");
        for (Movie movie : film) {
            System.out.println(movie.getName() + "-" + movie.getCategory());
        }

    }

}




