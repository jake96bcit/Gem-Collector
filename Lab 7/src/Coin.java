/**
 * Coin.
 * 
 * @author Jake
 * @version 1.0
 */
public class Coin {

    /**
     * Declare heads value.
     */
    private static final int HEADS = 0;

    /**
     * Declare face value.
     */
    private static int face;

    /**
     * Declare tails value.
     */
    @SuppressWarnings("unused")
    private final int tails = 1;

    /**
     * Sets up the coin by flipping it initially.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips the coin by randomly chosing a face.
     */
    public void flip() {
        face = (int) (Math.random() * 2);
    }

    /**
     * Returns true if the current face of the coin is heads.
     * 
     * @return true
     */
    public static boolean isHEADS() {
        return (face == HEADS);
    }

    /**
     * Declare get coin face method.
     * 
     * @return face of the coin
     */
    public static int getFace() {
        return face;
    }

    /**
     * Returns the current face of the coin as a string.
     * 
     * @return face name
     */
    public String toString() {
        String faceName;
        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;
    }
}
