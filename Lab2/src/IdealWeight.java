import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jake
 *
 */
public class IdealWeight {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
        int heightfeets;
        int heightinches;
        int idealweight;
        int gender;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your gender (Male is 1, Female is 2): ");
        gender= scan.nextInt();
        
        System.out.print("Please enter the number of your height in feets: ");
        heightfeets = scan.nextInt();
        
        System.out.println("Please enter the number of your height in inches: ");
        heightinches = scan.nextInt();
        
        if (gender == 2) {
            
        idealweight = 100 + (((heightfeets*12) - (5*12)) + heightinches)*5;
        System.out.println("Your ideal weight is: " + idealweight + " pounds.");
        System.out.println("And your ideak wight range is: " + (idealweight - idealweight*0.15) + " pounds"
        + " to " + (idealweight + idealweight*0.15) + " pounds.");
        }
        
        if (gender == 1) {
            
        idealweight = 106 + (((heightfeets*12) - (5*12)) + heightinches)*6;

        System.out.println("Your ideal weight is: " + idealweight + " pounds.");
        System.out.println("And your ideak wight range is: " + (idealweight - idealweight*0.15) 
               + " pounds" + " to " + (idealweight + idealweight*0.15) + " pounds.");
        }
    }

        
        // TODO Auto-generated method stub

    }


