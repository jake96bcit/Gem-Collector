package Shopping;

//*************************************************************** 
// ShoppingCart.java
//Represents a shopping cart as an array of items
//***************************************************************
import java.text.NumberFormat;

/**
 * Shopping cart.
 * @author Jake
 * @version 1.0
 */
public class ShoppingCart {
    /**
     * Total number of items in the cart.
     */
    private int itemCount;
    
    /**
     * Total price of items in the cart.
     */
    private double totalPrice;
    
    /**
     * Current cart capacity.
     */
    private int capacity;
    
    /**
     * Cart.
     */
    private Item[] cart;

    /**
    * Creates an empty shopping cart with a capacity of 5 items.
    */
    public ShoppingCart() {
        this.capacity = 5;
        this.itemCount = 0;
        this.totalPrice = 0.0;
        this.cart = new Item[this.capacity];
    }

    /**
     * Adds an item to the shopping cart.
     * @param itemName
     * name of the item
     * @param price
     * price of the item
     * @param quantity
     * quantity of the item
     */
    public void addToCart(String itemName, double price, int quantity) {
        if (this.itemCount == this.capacity) {
            this.increaseSize();
        }
        this.cart[this.itemCount] = new Item(itemName, price, quantity);
        this.totalPrice = this.totalPrice + (price * quantity);
        this.itemCount++;
    }

    /**
    * Returns the contents of the cart together with
    * summary information.
    * @return
    * contents
    */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < this.itemCount; i++) {
            contents += this.cart[i].toString() + "\n";
            contents += "\n";
        }
        contents += "\nTotal Price: " + fmt.format(this.totalPrice);
        return contents;
    }
    
    /**
     * Get total price.
     * @return
     * total price
     */
    public double getTotalPrice() {
        return this.totalPrice;
    }

    /**
    * Increases the capacity of the shopping cart by 3.
    */
    private void increaseSize() {
        this.capacity = this.capacity + 3;
        Item[] newCart = new Item[this.capacity];
        int i;
        for (i = 0; i < this.itemCount; i++) {
            newCart[i] = this.cart[i]; 
        }
        this.cart = newCart;
    }
}
