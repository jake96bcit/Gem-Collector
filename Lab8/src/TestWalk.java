
// ***********************************************************
//  TestWalk.java
//
//  Program to test methods in the RandomWalk class.
// ***********************************************************
import java.util.Scanner;

/**
 * Test walk.
 * @author Jake
 * @version 1.0
 */
public class TestWalk {
    
    /**
     * Main method.
     * @param args
     * program arguments
     */
    public static void main(String[] args) {

        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int x;
        int y;
        RandomWalk walk1 = new RandomWalk(10, 5, 0, 0);
        RandomWalk walk2;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nRandom Walk Test Program");
        System.out.println("");

        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();

        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();

        System.out.print("Enter the starting x and y" 
                                + "coordinates with a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();

        walk2 = new RandomWalk(maxSteps, maxCoord, x, y);
        System.out.println("Current position: ");
        System.out.println("Walk1: " + walk1.toString());
        System.out.println("Walk2: " + walk2.toString());

        // Question 4.
        for (int i = 0; i < 5; i++) {
            walk1.takeStep();
            walk2.takeStep();
            System.out.println("");
            System.out.println("Walk1 max distance: " + walk1.getMaxDistance());
            System.out.println("Walk2 max distance: " + walk2.getMaxDistance());
        }
        System.out.println("");
        System.out.println("Position after 5 random walks: ");
        System.out.println("Walk1: " + walk1.toString());
        System.out.println("Walk2: " + walk2.toString());
        
        /*
         * // Question 7. RandomWalk walk3 = new RandomWalk(200, 10, 0, 0);
         * System.out.println("Current position: "); System.out.println(
         * "Walk3: " + walk3.toString()); System.out.print(
         * "Start walking within boundary of 10 and maximum 200 steps.");
         * walk3.walk(); System.out.println("After walking position: ");
         * System.out.println("Walk3: " + walk3.toString());
         */

        // Clean up
        scan.close();
    }
}