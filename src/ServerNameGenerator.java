
public class ServerNameGenerator {

    final static String[] adjectives = {
            "Beautiful",
            "Smart",
            "Important",
            "Funny",
            "Fast",
            "Fresh",
            "Sweet",
            "Chilly",
            "Bright",
            "Cool"
    };


    final static String[] nouns = {
            "Walt Disney",
            "Gina Rodriguez",
            "San Antonio",
            "Squirrel",
            "Texas",
            "Jimmy Kimmel",
            "Mt. Everest",
            "Table",
            "Fruit",
            "Book"
    };

//    for(String[] adjective : adjectives) {
//        System.out.println(adjective);
//    }


    public static String randomAdj() {
        return adjectives[(int) (Math.random() * adjectives.length)];
    }

    public static String randomNoun() {
        return nouns[(int)(Math.random()*nouns.length)];
    }




    public static void main(String[] args) {

        System.out.println("Your server is " + randomAdj() + "-" + randomNoun() + "!");

    }

}
