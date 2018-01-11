package q1;

import java.util.Scanner;

/**
 * <p>
 * Palindrome tester is a program that use to
 * determind a string is a palidrome or not. This 
 * palidrome tester is ignoring spaces, punctuation
 * and uppercase or lowercase when determine wheter a string is a 
 * palidrome or not.
 * </p>
 *
 * @author Vinh Le
 * @version 1.0
 */
public class PalindromeTester {
    /**
     * <p>
     * This is the main method that 
     * read the input from the users
     * and print out the result to
     * the screen.
     * </p>
     *
     * @param args
     * command line arguments.
     */
    public static void main(String[] args) {
        String string;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your string:");
        string = scan.nextLine();
        boolean isPalindromeTest = isPalindromeTest(string);
        
        if (isPalindromeTest) {
            System.out.println("Your string is a palindrome.");
        } else {
            System.out.println("Your string is not a palindrome.");
        }
        scan.close();
    }
    
    /**
     * <p>This is a method that change spaces,
     * punctuation, uppercase or lowercase to
     * nothing, so it can't effect when we
     * determining wheter a string is a palindrome
     * or not.</p>
     * @param string
     * String that get from the users.
     * @return
     * return whether the string is a palidrome or not.
     */
    private static boolean isPalindromeTest(String string) {
        int i;
        int mid;
        int length;

        String trimPunc = string.replaceAll("[^a-zA-Z0-9]", "");
        String lower = trimPunc.toLowerCase();
        length = lower.length();
        mid = length / 2;
        for (i = 0; i < mid; i++) {
            if (lower.charAt(i) != lower.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
