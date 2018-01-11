package TrackingSale;

import java.text.NumberFormat;

//***************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople.  Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//***************************************************************

import java.util.Scanner;

/**
 * Tracking sale.
 * @author Jake
 * @version 1.0
 * 
 */
public class Sales {
    
    /**
     * Main method.
     * @param args
     * program arguments
     */
    public static void main(String[] args) {
        final int SALESPEOPLE;
        int i;
        int sum;
        int average;
        int maxPerson = 0;
        int maxSale = 0;
        int minPerson = 0;
        int minSale = Integer.MAX_VALUE;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of sales people:");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];

        for (i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();

            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxPerson = i;
            }

            if (sales[i] < minSale) {
                minSale = sales[i];
                minPerson = i;
            }
        }

        System.out.println("\nSalesperson  Sales");
        System.out.println(" ------------------ ");
        sum = 0;

        for (i = 0; i < sales.length; i++) {
            System.out.println("     " + (i + 1) 
                        + "         " + money.format(sales[i]));
            sum += sales[i];
        }

        average = (sum / sales.length);

        System.out.println("\nTotal sales: " + money.format(sum));
        System.out.println("Average Sales: " + money.format(average));
        System.out.println("Salesperson " + (maxPerson + 1) 
                    + " had the highest sales with " 
                        + money.format(maxSale) + ".");
        System.out.println("Salesperson " + (minPerson + 1) 
                    + " had the lowest sales with " 
                        + money.format(minSale) + ".");
        System.out.print("Enter the value to exceed: ");
        int exceed = scan.nextInt();
        int exceedCount = 0;
        for (i = 0; i < sales.length; i++) {
            if (sales[i] > exceed) {
                System.out.println("Salesperson " 
                        + (i + 1) + " sales = " 
                            + money.format(sales[i]));
                exceedCount++;
            }
        }

        System.out.println("We have " + exceedCount + " Salespeople exceeded " + money.format(exceed));
        scan.close();
    }
}