package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int width, int length) {
        super(width, length);
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length*width;
    }



//
////    protected properties
//   protected int length;
//   protected int width;
//
//
////   constructor
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
////    area method
//    public int getArea() {
//        return length * width;
//    }
//
////    perimeter method
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }


}



