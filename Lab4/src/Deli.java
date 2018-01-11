import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 * This program is using to calculate the price based on the weight of the
 * product.
 * 
 * @author Vinh Le
 * @version 1.0
 */
public class Deli {

    /**
     * The amount of ounces per pound.
     */
    public static final double OUNCES_PER_POUND = 16.0;

    /**
     * Instant data price per pounds.
     */
    private static double pricePerPound;

    /**
     * Instant data weights in ounces.
     */
    private static double weightOunces;

    /**
     * Instant data weight.
     */
    private static double weight;

    /**
     * Instant data total price.
     */
    private static double totalPrice;

    /**
     * Currency format.
     */
    private static NumberFormat money = NumberFormat.getCurrencyInstance();

    /**
     * Decimal format.
     */
    private static DecimalFormat fmt = new DecimalFormat("0.##");

    /**
     * Input the value.
     */
    private static Scanner scan = new Scanner(System.in);

    /**
     * The main method application.
     * 
     * @param args
     *            program arguments
     */
    public static void main(String[] args) {

        /**
         * Read the input.
         */
        System.out.println("Welcome to the CS Deli! ! \n ");
        System.out.println("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        System.out.println("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        /**
         * Convert ounces to pounds and compute the total price
         */
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        /**
         * Print the label using the formatting objects
         */
        System.out.println("**** CSDeli *****");
        System.out.println();
        System.out.println("Unite Price: " + money.format(pricePerPound));
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println();
        System.out.println("TOTAL: " + money.format(totalPrice));
    }
}