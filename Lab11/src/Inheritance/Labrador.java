package Inheritance;

/**
 * Labrador
 * 
 * @author Jake
 * @version 1.0
 */
public class Labrador extends Dog {
    @SuppressWarnings("unused")
    private String color;
    private int breedWeight = 75;

    public Labrador(String name, String color) {
        super(name);
        this.color = color;
    }

    public String speak() {
        return "WOOF";
    }

    public int avgBreedWeight() {
        return breedWeight;
    }
}
