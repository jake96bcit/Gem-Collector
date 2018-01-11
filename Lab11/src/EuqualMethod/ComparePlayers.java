package EuqualMethod;

import java.util.Scanner;

/**
 * ComparePlayer.
 * 
 * @author Jake
 * @version 1.0
 *
 */
public class ComparePlayers {
    @SuppressWarnings("unused")
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        player1.readPlayer();
        player2.readPlayer();
        if (player1.equals(player2)) {
            System.out.println("Two players are the same.");
        } else {
            System.out.println("Two players are different.");
        }
    }
}
