package q1;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * <p>
 * Staistics.java is used forcomputes and prints the mean and standard deviation
 * of a list of integers X1 through Xn.
 * </p>
 *
 * @author Vinh Le
 * @version 1.0
 */
public class Statistics {

    /**
     * <p>
     * Constant for the maximum input values that read from standard input with
     * no prompt.
     * </p>
     */
    static final int MAX_SIZE = 50;
    
    /**
     * Declare an array name number list.
     */
    private int[] numberList;
    
    /**
     * Declare the total number in the array.
     */
    private int total;

    /**
     * Declare statistics size.
     */
    public Statistics() {
        this.numberList = new int[MAX_SIZE];
        this.total = 0;
    }
    
    /**
     * Reading input function.
     */
    private void readInput() {
        Scanner s = new Scanner(System.in);
        int i = 0;

        while (s.hasNextInt() && i < MAX_SIZE) {
            this.numberList[i] = s.nextInt();
            i++;
        }
        this.total = i;
        s.close();
    }
    
    /**
     * Calcutaing then displaying the results to the screen.
     */
    private void output() {
        int i;
        int sum = 0;
        double mean = 0;
        double sdSum = 0;
        double sd = 0;
        NumberFormat fmt = NumberFormat.getInstance(); 
        for (i = 0; i < this.total; i++) {
            sum = sum + this.numberList[i];
        }
        fmt.setMinimumFractionDigits(2);
        mean = sum / this.total;
        for (i = 0; i < this.total; i++) {
            sdSum = sdSum + Math.pow(this.numberList[i] - mean, 2);
        }
        sd = Math.sqrt(sdSum / (this.total - 1));
        System.out.println("Mean: " + fmt.format(mean));
        System.out.println("Sd: " + fmt.format(sd));
    }
    
    /**
     * The method that including both reading input and
     * displaying output.
     */
    public void process() {
        this.readInput();
        this.output();
    }
}
