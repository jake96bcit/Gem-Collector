package q4;

import java.util.Scanner;

/**
 * <p>
 * This is where you put your description about what this class does. You don't
 * have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 * </p>
 *
 * @author Vinh Le
 * @version 1.0
 */
public class Primes {
    
    /**
     * <p>Create a boolean array name primes.</p>
     */
    private boolean[] primes;
    
    /**
     * <p>Create a constructor that accepts 
     * a single integer and upper bound
     * and initialize the prime array's size + 1.</p>
     * @param upperBound
     * The size of the array.
     */
    public Primes(int upperBound) {
        int i;
        this.primes = new boolean[upperBound + 1];
        // by default assume all are prime.
        // we will eliminate by assign it to false later.
        for (i = 0; i <= upperBound; i++) {
            this.primes[i] = true;
        }
        this.calculatePrimes();
    }
    
    /**
     * <p>A method use to check a integer number
     * is a prime or not, it returns true 
     * if the number is a prime
     * or False if the number not a prime.</p>
     * @param x
     * An integer number that use to
     * check if it prime or not. 
     * @return
     * True if x is prime and 
     * False if x not a prime
     */
    private boolean isPrime(int x) {
        if (x == 0 || x == 1) {
            return false;
        }
        int i;
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * <p>A method that uses 
     * the Sieve of Eratosthenes to determine 
     * which indices are prime (true) 
     * and which are not (false).</p>
     */
    public void calculatePrimes() {
        int i;
        int j;
        int length = this.primes.length;
        int half = (length - 1) / 2;
        for (i = 0; i < half; i++) {
            if (this.isPrime(i)) {
                this.primes[i] = true;
                if (i >= 2) {
                    for (j = i + 1; j < length; j++) {
                        if (j % i == 0) {
                            this.primes[j] = false;
                        }
                    }
                }
            } else {
                this.primes[i] = false;
            }
        }
    }

    /**
     * <p>
     * This is the main method
     * that print out the result
     * to screen after get and calculate
     * the input from the users.
     * </p>
     *
     * @param args
     * command line arguments.
     */
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an upper bound: ");
        x = scan.nextInt();
        Primes primes = new Primes(x);
        primes.countPrimes();
        System.out.println("The prime number(s) between 0 and " 
                    + x + " is/are:");
        primes.printPrimes();
        scan.close();
    }
    
    /**
     * <p>Print prime is a method which use for
     * print out the list of primes. The primes 
     * that I calculated.</p>
     */
    private void printPrimes() {
        int i;
        for (i = 0; i < this.primes.length; i++) {
            if (this.primes[i]) {
                System.out.println(i);
            }
        }
    }
    
    /**
     * <p>This is a method which use for 
     * print out the number that
     * represent for the number of how many
     * prime numbers in the range from
     * 0 to upper bound.</p>
     */
    private void countPrimes() {
        int n = 0;
        int i;
        for (i = 0; i < this.primes.length; i++) {

            if (this.primes[i]) {
                n++;
            }
        }
        System.out.println("There is/are " + n 
                            + " prime numbers in your range.");
    }

}
