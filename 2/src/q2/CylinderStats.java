package q2;

import java.util.Scanner;

/**
 * Cylinder stats.
 *
 * @author Vinh Le
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method that require user to enter the radius and the 
     * height of the cylinder.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Required user to enter radius and height
        System.out.print("Enter radius r: ");
        double radius = scan.nextInt();

        System.out.print("Enter height h: ");
        double height = scan.nextInt();
        
        /**
         * Calculate the cylinder volume and surface then print out the result.
         */
        double volume = Math.PI * Math.pow(radius, 2.0) * height;
        System.out.println("Your cylinder volume is: " + volume);
        
        double surface = 2 * Math.PI * radius * (radius + height);
        System.out.println("Your cylinder surface is: " + surface);
        scan.close();
    }

}
