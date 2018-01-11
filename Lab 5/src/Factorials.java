import java.util.Scanner;
/**
 * Factorials.
 * @author Jake
 * @version 1.0
 */
public class Factorials {
    
    /**
     * Calculating factorials of a input number.
     * @param args
     *  Program arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /**
         * Declare value, result, and counter 
         */
        int value;
        int result = 1;
        int counter;
        
        /**
         * input value
         * continue asking user to enter a non-negative number until they do so 
         */
        do {
            System.out.println("Please enter non-negative integer number: ");
            value = scan.nextInt();
        } while (value < 0);
        
        /**
         * calculation
         */
        if (value == 0) {
            result = 1;
        } else {
            counter = 1; // initialize counter to the starting number
            while (counter <= value) {
                result = result * counter;
                counter = counter + 1;
            } 
        }
        
        /**
         * output value
         */
        System.out.println("Factorials of " + value + " is " + result);
        scan.close();
    }

}
