import java.util.Scanner;

/**
 * Test name.
 * @author Jake
 * @version 1.0
 */
public class TestName {
   
    /**
     * declare scan.
     */
    private static Scanner scan;
    
    /**
     * Making main funtion code shorter.
     * @return Name
     */
    private static Name inputAndCreateNameObject() {
        String firstName;
        String middleName;
        String lastName;
        
        /**
         * Input for first person
         */
        System.out.println("First name: ");
        firstName = scan.next();
        System.out.println("Middle name: ");
        middleName = scan.next();
        System.out.println("Last name: ");
        lastName = scan.next();
        
        return new Name(firstName, middleName, lastName);
    }
    
    /**
     * testing 2 persons name.
     * @param args
     *  program arguments
     */
    public static void main(String[] args) {
        
        scan = new Scanner(System.in);
        
        /**
         * Input for first person
         */
        System.out.println("Please enter the first person's name. ");
                
        
        /**
         * declare Name variables to hold first person's name 
         * without instantiation 
         */
        Name name1 = inputAndCreateNameObject();
        
        /**
         * input for second person
         */
        System.out.println("Please enter the second person's name" 
                            +  " follow by first-middle-last.");
        /**
         * declare Name variables to hold second person's name 
         * without instantiation 
         */
        Name name2 = inputAndCreateNameObject();
        
        /**
         * print person's information
         */
        System.out.println("First person information:");
        System.out.println("- First-middle-last: " + name1.firstMiddleLast());
        System.out.println("- Last-first-middle: " + name1.lastFirstMiddle());
        System.out.println("- Initials: " + name1.initials());
        System.out.println("- Length: " + name1.length());
        System.out.print("");
        
        System.out.println("Second person information:");
        System.out.println("- First-middle-last: " + name2.firstMiddleLast());
        System.out.println("- Last-first-middle: " + name2.lastFirstMiddle());
        System.out.println("- Initials: " + name2.initials());
        System.out.println("- Length: " + name2.length());
        
        /**
         * Now compare two names
         */
        if (name1.equals(name2)) {
            System.out.println("Two names are equal.");  
        } else {
            System.out.println("Two names are not equal.");
        }
    }
}