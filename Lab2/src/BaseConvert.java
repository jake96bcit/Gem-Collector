import java.util.Scanner;

/**
 * Base Convert.
 * 
 * @author Jake
 * @version 1.0
 */
public class BaseConvert {

    /**
     * 
     * @param args
     *     Comand Line Arguments
     */
    public static void main(String[] args) {
        int base;
        int base10Num;
        int MaxNumber;

        int place0;
        int place1;
        int place2;
        int place3;
        String baseBnum = new String("");
        Scanner scan = new Scanner(System.in);

        System.out.println();

        System.out.println("Base Conversion Program");

        System.out.println();

        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();

        MaxNumber = (int) Math.pow(base, 4) - 1;
        System.out.println("Please enter a base 10 number to convert " + "with the maximum number is " + MaxNumber
                + " to convert: ");
        base10Num = scan.nextInt();

        place0 = base10Num % base;
        base10Num = base10Num / base;

        place1 = base10Num % base;
        base10Num = base10Num / base;

        place2 = base10Num % base;
        base10Num = base10Num / base;

        place3 = base10Num % base;
        base10Num = base10Num / base;

        baseBnum = (place3 + "" + place2 + "" + place1 + "" + place0);
        System.out.println(baseBnum);
    }
}
