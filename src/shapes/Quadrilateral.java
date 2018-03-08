package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{


//    protected length/width properties
    protected int width;
    protected int length;


//    constructor
    public Quadrilateral(int width, int length) {
        this.width = width;
        this.length = length;
    }


//    getters for length/width
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

//    abstract methods for setting length/width
    public abstract void setWidth(int width);

    public abstract void setLength(int length);



}
