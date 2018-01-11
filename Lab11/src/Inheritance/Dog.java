package Inheritance;

/**
 * Dog 
 * @author Jake
 * @version 1.0
 */
public abstract class Dog {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Woof";
    }

    public abstract int avgBreedWeight();
}
