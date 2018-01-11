import java.util.Scanner;
import java.util.Random;

/**
 * Rock Paper Scissors.
 * @author Jake
 * @version 1.0
 */
public class Rock {
    
    /**
     * Constant error.
     */
    static final int MAX_CHOICE = 3;
    
    /**
     * This is the main method.
     * @param args
     * Program arguments
     */
    public static void main(String[] args) {
        
        /**
         * Declare person play.
         */
        String personPlay;
        
        /**
         * Declare computer play.
         */
        String computerPlay;
        
        /**
         * Randomly generated number used to determine
         * computer's play.
         */
        int computerInt;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        computerInt = generator.nextInt(MAX_CHOICE);
        
        /**
         * Forcing the player to insert the right character
         * which is R (rocks), P (papers), and S (scissors).
         */
        do {
            System.out.print("Person play (S, P, and R only): ");
            personPlay = scan.next();
        } while (!personPlay.equalsIgnoreCase("R")
                && !personPlay.equalsIgnoreCase("P")
                && !personPlay.equalsIgnoreCase("S"));
        
        /**Get player's play 
         *Make player's play uppercase for ease of comparison
         *Generate computer's play (0,1,2)
         *Translate computer's randomly generated play to string
         */ 
        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
            default:
                computerPlay = "S";            
        }
        
        /**Print computer's play
          *See who won.
          */
        System.out.println("Computer play: " + computerPlay);
        if (personPlay.equalsIgnoreCase(computerPlay)) {
            System.out.println("tie");
        } else {
            if (personPlay.equalsIgnoreCase("R")) {
                if (computerPlay.equalsIgnoreCase("S")) {
                    System.out.println("Rock crushes scissors. You win!!");
                } else {
                    System.out.println("Paper cover rocks. Computer win!!");
                }
            } else if (personPlay.equalsIgnoreCase("P")) {
                if (computerPlay.equalsIgnoreCase("R")) {
                    System.out.println("Paper cover rocks. You win!!");
                } else {
                    System.out.println("Scissors cut papers. Computer win!!");
                }
            } else  { 
                if (computerPlay.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut papers. You win!!");
                } else {
                    System.out.println("Rock crushes scissors. Computer win!!");
                }
            }
        }
        scan.close();
    }
}     