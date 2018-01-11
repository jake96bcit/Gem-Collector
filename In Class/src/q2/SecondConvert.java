package q2;
import java.util.Scanner;

/**
 * This program converting from hour, minute to second.
 * @author Vinh Le
 * @version 1.0
 */
public class SecondConvert {
    /**
     * This is the number to convert from hour to minute, and from minute 
     * to second.
     */
    private static final int TIME = 60;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int hours;
        int minutes;
        int seconds;
        int result;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter how many hours " 
                           + "you want to convert to seconds: ");
        hours = scan.nextInt();
        System.out.println("Please enter how many minutes " 
                + "you want to convert to seconds: ");
        minutes = scan.nextInt();
        
        System.out.println("Please enter how many seconds "
                + "to make the total time amount: ");
        seconds = scan.nextInt();
        
        result = ((hours * TIME) * TIME) + (minutes * TIME) + seconds;
        System.out.println("The total amount of time that "
                + "you want to convert into seconds are: " + result + ".");
        
        scan.close();
    }

}
