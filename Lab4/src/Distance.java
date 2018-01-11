import java.util.Scanner;

/**
 * This program is using to calculate the distance amount between two point.
 * 
 * @author Vinh Le
 * @version 1.0
 */
public class Distance {

    /**
     * This is the main method.
     * 
     * @param args
     *            program arguments
     */
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print("Enter the coordinates of the first point " 
                                + "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        // Compute the distance
        distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        // Print out the answer
        System.out.println("The distance between your two points are: " 
                            + distance);
        scan.close();
    }
}