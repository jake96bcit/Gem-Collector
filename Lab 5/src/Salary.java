import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Salary.
 * @author Jake
 * @version 1.0
 */
public class Salary {

    /**
     * declare poor raise.
     */
    static final double POOR = 0.015;
    
    /**
     * declare good raise.
     */
    static final double GOOD = 0.04;
    
    /**
     * declare excellent raise.
     */
    static final double EXCELLENT = 0.06;
    
    /**
     * calculatin new salary for workers.
     * @param args
     *  Program argument
     */
    public static void main(String[] args) {

        // employee's current  salary
        // amount of the raise
        // new salary for the employee
        // performance rating
        double currentSalary;
        double raise = 0;
        double newSalary;
        String rating;
        
        /**
         * input work's performace
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating" 
                            + " (Excellent, Good, or Poor): "); 
        
        /**
         * 
        // Compute the raise using if ...
         */
        rating = scan.next();
        if (rating.equals("Excellent")) {
            raise = POOR * currentSalary;
        } else if (rating.equals("Good")) {
            raise = GOOD * currentSalary;
        } else if (rating.equals("Poor")) {
            raise = EXCELLENT * currentSalary;
        } else {
            System.out.print("Wrong rating value.");
            scan.close();
            return;
        }
        
        // Compute the raise 
        newSalary = currentSalary + raise;
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance(); 
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise)); 
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
        
        scan.close();
    }
}