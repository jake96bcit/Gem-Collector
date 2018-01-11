package EuqualMethod;

import java.util.Scanner;

/**
 * Player
 * 
 * @author Jake
 * @version 1.0
 */
public class Player {
    private static Scanner scan;
    private String name;
    private String team;
    private int jerseyNumber;

    public void readPlayer() {
        scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }

    public boolean equals(Player player) {
        Player comparePlayer = player;
        String currentName = comparePlayer.getName();
        String currentTeam = comparePlayer.getTeam();
        int currentNumber = comparePlayer.getNumber();
        if (currentName.equals(name) && currentTeam.equals(team) && currentNumber == jerseyNumber) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getNumber() {
        return jerseyNumber;
    }
}
