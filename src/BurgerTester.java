public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools.mostPopularTopping = "Cheese";
        BurgerTools.averageDaysBeforeExpiration = 2;
        BurgerTools.temperatureWhenCooked = 375;


        System.out.println("Most Popular: " + BurgerTools.mostPopularTopping);
        System.out.println("Average Days Before Expiring: " + BurgerTools.averageDaysBeforeExpiration);
        System.out.println("Temp: " + BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();




    }


}
