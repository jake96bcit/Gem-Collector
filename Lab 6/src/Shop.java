import java.util.ArrayList;
import java.util.Scanner;

/**
 * Jake's shop.
 * @author Jake
 * @version 1.0
 */
public class Shop {
    
    /**
     * This method is use to calculate and print out 
     * the total price of the cart.
     * @param cart
     * Shopping cart
     */
    public static void printCart(@SuppressWarnings("rawtypes") ArrayList cart) {
        int i;
        Item item;
        double total = 0;
        
        /**
         * Create the counting method to count how many item in the cart
         * and how many quantity of each item.
         * Print them with the information(name, price per each quantity) 
         * and the subtotal out.
         */
        for (i = 0; i < cart.size(); i++) {
            item = (Item) cart.get(i);
            System.out.println(item.getName() 
                    + "\t$" + item.getPrice() 
                    + "\t" + item.getQuantity() 
                    + "\t$" + item.getSubTotal());
            total = total + item.getSubTotal();
        } 
        System.out.println("Cart total: \t\t$" + total);
    };
    
    /**
     * This is the main method.
     * @param args
     * Program arguments
     */
      @SuppressWarnings("unchecked")
    public static void main(String[] args) {
          
          @SuppressWarnings("rawtypes")
          ArrayList cart = new ArrayList();
          
          /**
           * Declare item.
           */
          Item item;
          
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
           * Print out item, item information(price, quantity, name)
           * and the sub total of all the item orice inside the cart.
           */
          do {
              System.out.print("Enter the name of the item: ");
              itemName = scan.next();
              System.out.print("Enter the unit price: ");
              itemPrice = scan.nextDouble();
              System.out.print("Enter the quantity: ");
              quantity = scan.nextInt();
              
              item = new Item(itemName, itemPrice, quantity);
              cart.add(item);
              
              System.out.println("");
              System.out.println("Current cart: ");
              printCart(cart);
              System.out.println("");
              System.out.print("Continue shopping (y/n)? ");
              keepShopping = scan.next();
          } while (keepShopping.equals("y"));
          
          do {
              System.out.println("");
              System.out.println("Current cart: ");
              printCart(cart);
              System.out.println("****Thank you for shopping" 
                                      + "at Jake's shop****");
              break;
          } while (keepShopping.equals("n"));
          scan.close();
      } 
}