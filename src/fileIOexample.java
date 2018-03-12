import java.io.*;
import java.util.Scanner;



public class fileIOexample {

    public static void main(String[] args) {
        File file = new File("example.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter buffering = new BufferedWriter(writer);

        if(!file.exists()) {
            System.out.println("File does not exist");

        } else {
            System.out.println("File exists");
        }


        //Writes to the file
        PrintWriter output = null;
        try {
            output = new PrintWriter(file);
            output.println("Bettina");
            output.println(24);
            output.close();
        } catch (IOException e) {
            System.out.println("There was an IO error");
        }


//      Reads from the file
        Scanner input = null;
        try {
            input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();
            System.out.printf("Name: %s Age: %d\n", name, age);
        } catch (FileNotFoundException e) {
            System.out.println("File not found error");
        }









    }

}
