package PaintingShapes;

public class Rectangle extends Shape {
    private final double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    // -----------------------------------
    // Returns the rectangle as a String.
    // -----------------------------------
    public String toString() {
        return super.toString() + " of width " + width + " and length " + length;
    }

}
