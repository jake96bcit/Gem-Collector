package PaintingShapes;

public class Cylinder extends Shape {
    private final double radius;
    private final int height;
    final double pi = Math.PI;

    public Cylinder(double radius, int height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2) * height;
    }

    // -----------------------------------
    // Returns the cylinder as a String.
    // -----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }

}