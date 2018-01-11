package Averaging;

/**
 * Average 
 * 
 * @author Jake
 * @version 1.0
 */
public class Average {
    public static void main(String[] args) {
        int count = 0;
        int average = 0;
        int[] list = new int[1];
        String content = "";

        if (args.length == 0) {
            System.out.println("No arguments.");
        } else {
            if (list.length < args.length) {
                list = new int[args.length];
            }
            for (int n = 0; n < args.length; n++) {
                Integer argNumber = 0;
                argNumber = Integer.valueOf(args[n]);
                list[n] = argNumber;
                content += argNumber + "\t";
            }
            for (int n = 0; n < args.length; n++) {
                count += list[n];
            }
            average = count / args.length;
            System.out.println("The integers are: \n" + content);
            System.out.println("\nThe average is: " + average);
        }

    }
}
