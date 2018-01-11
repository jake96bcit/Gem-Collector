package MagicSquares;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * SquareTest 
 * 
 * @author Jake
 * @version 1.0
 */
public class SquareTest {
    private static Scanner scan;

    public static void main(String[] args) throws IOException {
        scan = new Scanner(new File("magicData"));
        int count = 1;
        int size = scan.nextInt();
        while (size != -1) {
            Square square = new Square(size);
            square.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");
            square.printSquare();
            for (int n = 0; n < size; n++) {
                System.out.println("The sum of row" + (n + 1) + ": " + square.sumRow(n));
            }
            for (int n = 0; n < size; n++) {
                System.out.println("The sum of columns" + (n + 1) + ": " + square.sumCol(n));
            }
            System.out.println("The sum of the main diagonal: " + square.sumMainDiag());
            System.out.println("The sum of the other diagonal: " + square.sumOtherDiag());
            if (square.magic()) {
                System.out.println("This is a magic square!");
            } else {
                System.out.println("This is NOT a magic square...");
            }
            count++;
            size = scan.nextInt();
        }

    }
}
