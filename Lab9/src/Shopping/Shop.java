package Shopping;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Jake's shop.
 * 
 * @author Jake
 * @version 1.0
 */
public class Shop {

    /**
     * This is the main method.
     * 
     * @param args
     *            Program arguments
     */
    public static void main(String[] args) {

        /**
         * Declare shopping cart.
         */
        ShoppingCart shoppingCart = new ShoppingCart();

        /**
         * Declare item name.
         */
        String itemName;

        /**
         * Declare item price.
         */
        double itemPrice;

        /**
         * Declare item quantity.
         */
        int quantity;

        /**
         * Welcome statement.
         */
        System.out.println("Welcome to Jake's shop");
        System.out.println("");

        Scanner scan = new Scanner(System.in);

        /**
         * if enter y, continue shopping.
         */
        String keepShopping = "y";

        /**
         * Print out item, item information(price, quantity, name) and the sub
         * total of all the item orice inside the cart.
         */
        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();

            shoppingCart.addToCart(itemName, itemPrice, quantity);

            System.out.println("");
            System.out.println(shoppingCart.toString());
            System.out.println("");
            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        } while (keepShopping.equals("y"));
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.println("");
        System.out.println("Please pay: " 
                    + fmt.format(shoppingCart.getTotalPrice()));
        System.out.println("****Thank you for shopping" 
                    + " at Jake's shop****");

        scan.close();
    }
}