import java.text.NumberFormat;

/**
 * Item.
 * @author Jake
 * @version 1.0
 */
public class Item {
    
    /**
     * Declare name of the item.
     */
    private String name;
    
    /**
     * Declare price of the item.
     */
    private double price;
    
    /**
     * Declare the quantity of the item.
     */
    private int quantity;
    
    /**
     * Create a new item with the given attributes.
     * @param itemName
     *  name of the item
     * @param itemPrice
     *  price of the item
     * @param numPurchased
     *  how many do you buy per an item.
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        this.name = itemName;
        this.price = itemPrice;
        this.quantity = numPurchased;
    }
    
    /**
     * Return a string with the information about the item.
     * @return
     *  the information of the item 
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (this.name + "\t" + fmt.format(price) + "\t" 
                        + this.quantity + "\t" 
                            + fmt.format(this.price * this.quantity));
    }
    
    /**
     * Returns the unit price of the item.
     * @return
     * return the price of the item
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Returns the name of the item.
     * @return
     * return the name of the item
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Returns the quantity of the item.
     * @return
     * return the quantity of the item
     */
    public int getQuantity() {
        return this.quantity; 
    }
    
    /**
     * Return the sub total of all the product that you purchase.
     * @return
     * return the sub total.
     */
    public double getSubTotal() {
        return this.price * this.quantity;
    }
}


