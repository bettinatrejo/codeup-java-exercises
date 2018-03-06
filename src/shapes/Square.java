package shapes;

class Square extends Rectangle{
    private int side;
    public Square(int side) {
        super(side,side);
        this.side = side;
    }

//    overriding rectangle methods
    @Override
    public int getArea() {
        return side*side;
    }

    @Override
    public int getPerimeter() {
        return 4*side;
    }
}
