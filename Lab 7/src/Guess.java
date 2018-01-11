import java.util.Random;
import java.util.Scanner;

/**
 * Guess.
 * 
 * @author Jake
 * @version 1.0
 */
public class Guess {
     /**
      * Main method.
      * @param args
      * program arguments
      */
    public static void main(String[] args) {
        final int maxRange = 10;
        Random rand = new Random();
        int numberToGuess = rand.nextInt(maxRange);
        Scanner scan = new Scanner(System.in);

        int guess;
        do {
            System.out.println("Guess a number between 1 and 10: ");
            guess = scan.nextInt();
            
            if (guess == numberToGuess) {
                System.out.println("!!!Congratulation!!!");
                System.out.println("You got the number!!! The number is: " 
                                    + numberToGuess);
            } else {
                System.out.println("You got the wrong one!" 
                                        + "Let's try it again!");
            }
        } while (guess != numberToGuess);
        scan.close();
    }
}
