package q2;

import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        int hours;
        int minutes;
        int seconds;
        int result;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter how many hours you want to convert to seconds: ");
        hours= scan.nextInt();
        
        System.out.print("Please enter how many minutes you want to convert to seconds: ");
        minutes = scan.nextInt();
        
        System.out.println("Please enter how many seconds to make the total time amount: ");
        seconds = scan.nextInt();
        
        result= ((hours*60)*60) + (minutes*60) + seconds;
        System.out.println("The total amount of time that you want to convert into seconds are: " + result + ".");
    }

}
