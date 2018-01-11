import java.util.Scanner;

public class Comparisons {

    public static void main(String[] args) {
        // Three Strings
        String s1;
        String s2;
        String s3;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first string: ");
        s1 = scan.next();
        System.out.print("Please enter the second string: ");
        s2 = scan.next();
        System.out.print("Please enter the third string: ");
        s3 = scan.next();
        System.out.println("");
        System.out.print("The largest string is: ");
        System.out.println(Compare3.largest(s1, s2, s3));

        // Three Integers
        int i1;
        int i2;
        int i3;

        System.out.println("");
        System.out.print("Please enter the first number: ");
        i1 = scan.nextInt();
        System.out.print("Please enter the second number: ");
        i2 = scan.nextInt();
        System.out.print("Please enter the third number: ");
        i3 = scan.nextInt();
        System.out.println("");
        System.out.print("The largest number is: ");
        System.out.println(Compare3.largest(i1, i2, i3));

        // Clean up
        scan.close();
    }

}
