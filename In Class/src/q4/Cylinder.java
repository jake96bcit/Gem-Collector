package q4;
import java.util.Scanner;
/**
 * This program is calculating cycle's volume. 
 * @author Vinh Le
 * @version 1.0
 */
public class Cylinder {
    /**
     * This is a PI amount.
     */     
    private static final double PI = 3.14159;
    
    /**
     * This is he main application.
     * @param args program arguments.
     */
    public static void main(String[] args) {

     @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
     
     
     final double r;
     final double h;
     
     System.out.println("Please enter the Radius amount: ");
     r = scan.nextDouble();
     System.out.println("Please enter the height amount: ");
     h = scan.nextDouble();
     
     double v = PI * r * r * h;
     
     System.out.println("The cylinder's volume is: " + v);
    }   
}
