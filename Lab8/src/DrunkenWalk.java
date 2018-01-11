import java.util.Scanner;

// Question 8

public class DrunkenWalk {

    public static void main(String[] args) {
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int numDrunks;
        RandomWalk drunkWalk;
                
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDrunken Walk Test Program");
        System.out.println("");

        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();

        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        
        System.out.print("Enter the number of drunks: ");
        numDrunks = scan.nextInt();
        
        int numFallOff = 0;
        
        for (int i = 0; i < numDrunks; i++) {
            drunkWalk = new RandomWalk(maxSteps, maxCoord);
            drunkWalk.walk();
            if (!drunkWalk.inBounds()) {
                numFallOff++;
            }
        }
        System.out.println("Number of Drunks fall off: " + numFallOff);
        scan.close();
    }

}
