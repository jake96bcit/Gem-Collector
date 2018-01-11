package Inheritance;

/**
 * DogTest.
 * @author Jake
 * @version 1.0
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Yorkshire("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());
        System.out.println("===================================================");
        Yorkshire yorkie = new Yorkshire("Yorkie");
        Labrador lab = new Labrador("Labby", "black");
        System.out.println(yorkie.getName() + " says " + dog.speak());
        System.out.println("The average of breed weight is: " + yorkie.avgBreedWeight());
        System.out.println("===================================================");
        System.out.println(lab.getName() + " says " + dog.speak());
        System.out.println("The average of breed weight is: " + lab.avgBreedWeight());
    }
}
