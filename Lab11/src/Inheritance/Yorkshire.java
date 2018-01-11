package Inheritance;

/**
 * Inheritance
 * 
 * @author Jake
 * @version 1.0
 */
public class Yorkshire extends Dog {
    private int breedWeight = 7;

    public Yorkshire(String name) {
        super(name);
    }

    public String speak() {
        return "woof";
    }

    public int avgBreedWeight() {
        return breedWeight;
    }
}
