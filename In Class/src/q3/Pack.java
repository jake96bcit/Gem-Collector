package q3;
/**
 * This class implements an application to encode 5 characters to a base 56
 * number and then decode the base 56 number back to 5 characters.
 * @version 1.0
 * @author Vinh Le
 */ 
public class Pack {
    /**
     * The base constant.  
     */
    static final int BASE56 = 56;
    /**
     * Constant for power.
     */
    static final int EXPO1 = 4;
    /**
     * Constant for power.
     */
    static final int EXP02 = 3;
    /**
     * This method encodes 5 characters which are "digits" in a base 56 number
     * to an encoded value.
     * @param c1 the first character
     * @param c2 the second character
     * @param c3 the third character
     * @param c4 the fourth character
     * @param c5 the fifth character
     * @return the encoded result number
     */
    public static int encode(char c1, char c2, char c3, char c4, char c5) {
        int value1 = c1 - 'A' + 1;
        int value2 = c2 - 'A' + 1;
        int value3 = c3 - 'A' + 1;
        int value4 = c4 - 'A' + 1;
        int value5 = c5 - 'A' + 1;
        
        int place0 = (int) (value1 * Math.pow(BASE56, EXPO1));
        int place1 = (int) (value2 * Math.pow(BASE56, EXP02));
        int place2 = (int) (value3 * Math.pow(BASE56, 2));
        int place3 = (int) (value4 * Math.pow(BASE56, 1));
        int place4 = (int) (value5 * Math.pow(BASE56, 0));
    
        int result = place0 + place1 + place2 + place3 + place4; 
        return result;
    }
    
    /**
     * This method decodes a number to the 5 characters which are "digits" in
     * a base 56 number.
     * @param num encoded value
     * @return the decoded string
     */
    public static String decode(int num) {
        // convert base 56 to base 10
        int place1 = num % BASE56;
        num = num / BASE56;
        int place2 = num % BASE56;
        num = num / BASE56;
        int place3 = num % BASE56;
        num = num / BASE56;
        int place4 = num % BASE56;
        num = num / BASE56;
        int place5 = num % BASE56;
        num = num / BASE56;

        char char5 = (char) (place1 + 'A' - 1);
        char char4 = (char) (place2 + 'A' - 1);
        char char3 = (char) (place3 + 'A' - 1);
        char char2 = (char) (place4 + 'A' - 1);
        char char1 = (char) (place5 + 'A' - 1);
        
        // force to return the string instead of int
        return "" + char1 + char2 + char3 + char4 + char5;
    }
    
    /**
     * The main application.
     * @param args program arguments
     */
    public static void main(String[] args) {  
        final char c1 = 'I';
        final char c2 = 'F';
        final char c3 = 'E';
        final char c4 = 'B';
        final char c5 = 'A';

        int encodedResult = encode(c1, c2, c3, c4, c5);
        System.out.println("Original: " + c1 + c2 + c3 + c4 + c5);
        System.out.println("Encoded: " + encodedResult);

        int num = encodedResult; 
        String decodedResult = decode(num);    
        System.out.println("Decoded: " + decodedResult);
    }
}
