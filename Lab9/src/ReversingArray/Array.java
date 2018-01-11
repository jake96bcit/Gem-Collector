package ReversingArray;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int total;
        int i;
        int reverseI;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers for array: ");
        total = scan.nextInt();
        int[] values = new int[total];
        for (i = 0; i < total; i++) {
            System.out.println("Enter the value of array's element " + (i + 1) + ": ");
            values[i] = scan.nextInt();
        }
        System.out.print("Original array: ");
        for (i = 0; i < total; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
        System.out.print("Reversed array: ");
        for (i = 0; i < total; i++) {
            reverseI = total - i - 1;
            System.out.print(values[reverseI] + " ");
        }
        scan.close();
    }
}
