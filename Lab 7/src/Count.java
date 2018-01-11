import java.util.Scanner;

/**
 * Counts.
 * @author Jake
 * @version 1.0
 */
public class Count {
    
    /**
     * Main method
     * calculate and print out results.
     * @param args
     * program arguments
     */
    public static void main(String[] args) {
        
        /**
         * Declare values.
         */
        String phrase;
        int countBlank;
        int length;
        char ch;
        int countA;
        int countE;
        int countS;
        int countT;
        
        Scanner scan = new Scanner(System.in);
        
        /**
         * Starting the loop.
         */
        do {
            System.out.println("Character Counter");
            System.out.println("");
            
            /**
             * Getting input values.
             */
            System.out.println("Enter a sentence or phrase: ");
            phrase = scan.nextLine();
            length = phrase.length();
            while (true) {
                if (phrase.equalsIgnoreCase("quit")) {
                    System.out.println("Thanks for using this!");
                } else {
                  
                  /**
                   * Setting default value.
                   */
                  countBlank = 0;
                  countA = 0;
                  countE = 0;
                  countS = 0;
                  countT = 0;
        
                  for (int i = 0; i < length; i++) {
                      ch = phrase.charAt(i);
                      
                      switch (ch) {
                      case ' ':
                      countBlank++;
                              break;
                      case 'a':
                      case 'A': countA++;
                                break;
                      case 'e':
                      case 'E': countE++;
                                break;
                      case 's':
                      case 'S': countS++;
                                break;
                      case 't':
                      case 'T': countT++;
                                break;
                      default:
                                break;
                      }
                  } 
                  
                  /**
                   * Print out results.
                   */
                  System.out.println("Number of Blank spaces: " + countBlank);
                  System.out.println("");
                  System.out.println("Total characters: " + length);
                  System.out.println("Number of A's: " + countA);
                  System.out.println("Number of E's: " + countE);
                  System.out.println("Number of S's: " + countS);
                  System.out.println("Number of T's: " + countT);
                  System.out.println("Continue? (yes or quit)");
                  phrase = scan.nextLine();
                  break;
                }
            }
        } while (phrase.equalsIgnoreCase("yes"));
        scan.close();
    }    
}
