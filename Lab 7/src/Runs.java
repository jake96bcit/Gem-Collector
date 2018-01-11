/**
 * Run.
 * 
 * @author Jake
 * @version 1.0
 */
public class Runs {

    /**
     * Main method.
     * 
     * @param args
     *            Program arguments
     */
    public static void main(String[] args) {
        final int flip = 100;

        int currentRun = 0;
        int maxRun = 0;

        Coin coin = new Coin();

        for (int i = 0; i < flip; i++) {
            coin.flip();
            int flipCount = i + 1;
            System.out.println("Flip " + flipCount + ": " + coin.toString());

            if (Coin.isHEADS()) {
                if (maxRun < currentRun) {
                    maxRun = currentRun;
                }
                currentRun += 1;
            } else {
                currentRun = 0;
            }

            System.out.println("Maximum run of heads in a row: " + maxRun);
        }
    }
}
