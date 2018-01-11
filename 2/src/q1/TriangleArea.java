package q1;

import java.util.Scanner;

/**
 * Triangle area.
 * @author Vinh Le
 * @version 1.0
 */
public class TriangleArea {
    /**
     * This is the main method that gets the side of triangle from the user
     * and calculate the perimenter and area of the triangle.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        Scanner scan = new Scanner(System.in);
        
        // Require user enter the length of the side of the triangle 
        System.out.println("Please enter the first length" 
                        + "of a side of a triangle: ");
        a = scan.nextInt();
        System.out.println("Please enter the second length" 
                        + "of a side of a triangle: ");
        b = scan.nextInt();
        System.out.println("Please enter the third length" 
                        + "of a side of a triangle: ");
        c = scan.nextInt();
        
        /**
         * Calculate the perimeter and area then print out the results.
         */
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The perimeter of your triangle is: " + s);
        System.out.println("The area of your triangle is: " + area);
        scan.close();
    }

}
