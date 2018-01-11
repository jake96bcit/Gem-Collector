package q2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * <p>
 * Rock, paper, scissors program.
 * </p>
 * <p>
 * This program will ask the user(player) to enter one of three choice(rock,
 * paper, scissor) and compare with the computer. Output is who is the winner,
 * how many times player and computer win, lose, or tie. Then ask the player to
 * countinue or stop.
 * </p>
 * 
 * @author Vinh Le
 * @version 1.0
 */
public class RockPaperScissors {

    /**
     * Declare rock value.
     */
    static final int ROCK = 1;

    /**
     * Declare paper value.
     */
    static final int PAPER = 2;

    /**
     * Declare scissor value.
     */
    static final int SCISSORS = 3;
    
    /**
     * Innitialize player win count.
     */
    private static int playerWin;
    
    /**
     * Innitialize player lose count.
     */
    private static int playerLose;
    /**
     * Innitialize player tie count.
     */
    private static int tie;
    /**
     * <p>
     * Coordinate the inputRead and decideWinner function to test the game.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        playerWin = 0;
        playerLose = 0;
        tie = 0;
        System.out.println("Welcome to the Rocks, Papers, Scissors game!");
        Scanner scan = new Scanner(System.in);
        String continueChoice = "no";
        
        do {
            System.out.println("Pick 1, 2, or 3 for ROCK(1)," 
                        + " PAPER(2), SCISSORS(3): ");
            try {
                int[] choices = inputRead(scan);
            
                decideWinner(choices[0], choices[1]);
            } catch (InputMismatchException ex) {
                System.out.println("Please enter an integer from 1 to 3!");
                scan.next();
                //System.out.println("Please restart the program!");
            }
            System.out.println("Do you want to countinue?(Yes/ No)");
            //while (scan.hasNext()) {
            continueChoice = scan.next();
            //}
        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println("You win " + playerWin + " time(s).");
        System.out.println("You lose " + playerLose + " time(s).");
        System.out.println("You tie " + tie + " time(s).");
        System.out.println("Goodbye!");
        scan.close();
    }
    
    /**
     * <p>Read input from user and generate a random number.</p>
     * 
     * @param scan scanner to read input
     * @return array an array of integer including two elements: 
     *  the first element is player choice, second element is computer choice.
     * @throws InputMismatchException throws exception of the input
     */
    public static int[] inputRead(Scanner scan) throws InputMismatchException {
        int playerChoice;
        int computerChoice;
        int[] array = new int[2];

        Random ran = new Random();

        try {
            playerChoice = scan.nextInt();
            if (playerChoice < ROCK || playerChoice > SCISSORS) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            throw ex;
        }
        computerChoice = ran.nextInt(SCISSORS) + 1;
        array[0] = playerChoice;
        array[1] = computerChoice;
        return array;
    }
    
    /**
     * <p>Determine who is the winner or loser or tie.</p>
     * 
     * @param playerChoice Input from user
     * @param computerChoice Random chosen
     */
    public static void decideWinner(int playerChoice, int computerChoice) {
        if (playerChoice > 0 && playerChoice <= SCISSORS) {
            System.out.println("Computer play: " + computerChoice);
            if (playerChoice == computerChoice) {
                System.out.println("It's is a tie!");
                tie++;
            } else {
                switch (playerChoice) {
                case ROCK:
                    playerChoice = ROCK;
                    if (computerChoice == SCISSORS) {
                        System.out.println("Rock crushes scissors." 
                                    + " You win!!");
                        playerWin++;
                    } else {
                        System.out.println("Paper cover rocks." 
                                    + " Computer win!!");
                        playerLose++;
                    }
                    break;
                case PAPER:
                    playerChoice = PAPER;
                    if (computerChoice == 1) {
                        System.out.println("Paper cover rocks. You win!!");
                        playerWin++;
                    } else {
                        System.out.println("Scissors cut papers." 
                                    + " Computer win!!");
                        playerLose++;
                    }
                    break;
                case SCISSORS:
                    playerChoice = SCISSORS;
                    if (computerChoice == 2) {
                        System.out.println("Scissors cut papers." 
                                    + " You win!!");
                        playerWin++;
                    } else {
                        System.out.println("Rock crushes scissors." 
                                    + " Computer win!!");
                        playerLose++;
                    }
                    break;
                default:
                    break;
                }
            }
        }
    }
}
