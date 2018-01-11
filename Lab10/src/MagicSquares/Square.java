package MagicSquares;

import java.util.Scanner;

/**
 * Square 
 * 
 * @author Jake
 * @version 1.0
 */
public class Square {
    int size;
    int[][] square;
    private int rowSum;
    private int colSum;
    private int mainDiSum;
    private int othDiSum;

    public Square(int size) {
        square = new int[size][size];
        this.size = size;
    }

    public int sumRow(int row) {
        rowSum = 0;
        for (int n = 0; n < size; n++) {
            rowSum += square[row][n];
        }
        return rowSum;
    }

    public int sumCol(int col) {
        colSum = 0;
        for (int n = 0; n < size; n++) {
            colSum += square[n][col];
        }
        return colSum;
    }

    public int sumMainDiag() {
        mainDiSum = 0;
        for (int n = 0; n < size; n++) {
            mainDiSum += square[n][n];
        }
        return mainDiSum;
    }

    public int sumOtherDiag() {
        othDiSum = 0;
        int count = (size - 1);
        for (int n = 0; n < size; n++) {
            othDiSum += square[count][n];
            count--;
        }
        return othDiSum;
    }

    public boolean magic() {
        if (rowSum == colSum && rowSum == mainDiSum && rowSum == othDiSum) {
            return true;
        }
        return false;
    }

    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col++)
                square[row][col] = scan.nextInt();
    }

    public void printSquare() {
        System.out.println("The square is: ");
        for (int n = 0; n < size; n++) {
            for (int i = 0; i < size; i++) {
                System.out.print(square[n][i] + "\t");
                if ((i + 1) % size == 0) {
                    System.out.println();
                }
            }
        }
    }
}
