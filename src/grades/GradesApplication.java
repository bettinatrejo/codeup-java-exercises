package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class GradesApplication {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Input userInput = new Input();


        HashMap<String, Student> students = new HashMap<>();


        Student username1 = new Student("Jim");
        username1.addGrade(90);
        username1.addGrade(91);
        username1.addGrade(90);
        students.put("prankster", username1);


        Student username2 = new Student("Pam");
        username2.addGrade(80);
        username2.addGrade(81);
        username2.addGrade(80);
        students.put("hellothisispam", username2);

        Student username3 = new Student("Michael");
        username3.addGrade(70);
        username3.addGrade(71);
        username3.addGrade(70);
        students.put("grilledfoot", username3);

        Student username4 = new Student("Dwight");
        username4.addGrade(60);
        username4.addGrade(61);
        username4.addGrade(60);
        students.put("ryanstartedthefire", username4);


        do {
            System.out.println(
                    "Welcome!\n" +
                            "Here are the github usernames of our students:\n"
            );

            Set<HashMap.Entry<String, Student>> entries = students.entrySet();
            for (Map.Entry<String, Student> student : entries) {
                System.out.print("|" + student.getKey() + "|");
            }

            System.out.println("\n");
            System.out.println("What student would you like to see more information on?");
            String response = userInput.getString();

            if (students.containsKey(response)) {
                Student student = students.get(response);
                student.display();
                System.out.println("GitHub Username: " + response);
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + "\'" + response + "\'");

            }
        } while(userInput.yesNo("Do you want to see another student's information? (Y or yes to agree)")); {

            System.out.println("Bye, have a wonderful day!");
        }
    }
}
