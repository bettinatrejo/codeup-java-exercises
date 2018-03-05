package shapes;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Number of circles created: ");
        System.out.println(Circle.getNumberOfCircles());


        Circle first = new Circle(1);
        System.out.println(Circle.getNumberOfCircles());

        Circle another = new Circle (44);
        System.out.println(Circle.getNumberOfCircles());
    }
}
