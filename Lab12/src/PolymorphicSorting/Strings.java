package PolymorphicSorting;

import java.util.Scanner;

public class Strings {
    private static Scanner scan;

    public static void main(String[] args) {
        int size;
        scan = new Scanner(System.in);
        System.out.print("\nHow many Strings do you want to sort?");
        size = scan.nextInt();
        String[] stringList = new String[size];
        System.out.println("\nEnter the Strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next();
        }
        Sorting.insertionSort(stringList);
        System.out.println("\nYour Strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
        }
        System.out.println();
    }
}
