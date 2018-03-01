import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ask Bob: ");
        String response = sc.nextLine();


        if (response.endsWith("?")) {
            System.out.println("Sure");
        } else if (response.trim().equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (response.endsWith("!") || response.toUpperCase().equals(response)) {
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever");
        }




    }
}
