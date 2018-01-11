package Shopping;

import java.text.NumberFormat;
/**
 * Item represents an item in a shopping cart.
 * @author Jake
 * @version 1.0
 */
public class Item {
    /**
     * Item name.
     */
    private String name;
    
    /**
     * Item price.
     */
    private double price;
    
    /**
     * Item quantity.
     */
    private int quantity;

    /**
     * Create a new item with the given attributes.
     * @param itemName
     * item name
     * @param itemPrice
     * item price
     * @param numPurchased
     * item quantity
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    /**
     * Return a string with the information about the item.
     * @return
     * content
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t\t" + fmt.format(price) + "\t\t" 
                    + quantity + "\t\t" + fmt.format(price * quantity));
    }

    /**
     * Returns the unit price of the item.
     * @return
     * Item price
     */
    public double getPrice() {
        return price;
    }

   /**
    * Returns the name of the item.
    * @return
    * item name
    */
    public String getName() {
        return name;
    }

    /**
     * Returns the quantity of the item.
     * @return
     * Item quantity
     */
    public int getQuantity() {
        return quantity;
    }
}
