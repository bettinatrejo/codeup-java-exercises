public class RestaurantTest {



    public static void main(String[] args) {

//        RestaurantDish dish = new RestaurantDish();
//        dish.costInCents = 1000;
//        dish.nameOfDish = "Taco Tower";
//        dish.wouldRecommend = true;
//
        RestaurantDish dish = new RestaurantDish(100, "Taco Tower", true);

//        System.out.println(dish.getCostInCents() +
//        dish.getNameOfDish() +
//        dish.isWouldRecommend());


        System.out.println( "Try the " + dish.getNameOfDish() + " it's only " + dish.getCostInCents() + "." + "Do I recommend it? " + dish.isWouldRecommend() + ". It's " + dish.eat());
//


    }
}
