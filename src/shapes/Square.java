package shapes;

class Square extends Quadrilateral{

    public Square(int width, int length) {
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
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*length;
    }





//    private int side;
//    public Square(int side) {
//        super(side,side);
//        this.side = side;
//    }
//
////    overriding rectangle methods
//    @Override
//    public int getArea() {
//        return side*side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4*side;
//    }
}
