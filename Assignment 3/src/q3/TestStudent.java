package q3;

/**
 * Represents a college student.
 * @author Vinh Le
 * @version 1
 */
public class TestStudent {
    /**
     * 
     */
    static final double JTEST1 = 7.0;
    /**
     * 
     */
    static final double JTEST2 = 8.0;
    /**
     * 
     */
    static final double JTEST3 = 7.5;
    /**
     * 
     */
    static final double MTEST1 = 6.0;
    /**
     * 
     */
    static final double MTEST2 = 7.0;
    /**
     * 
     */
    static final double MTEST3 = 6.5;
    /**
     * 
     */
    static final int TEST3 = 3;
    /**
     * Creates some Address and Student objects and prints them.
     * @param args Unused
     */
     public static void main(String[] args) {
         
         Address school = new Address("3700 Willingdon Ave.", "Burnaby", "BC",
                 "V5G 3H2");

         Address jHome = new Address("21 Jump Street", "Langley", "BC",
                     "V3A 6K6");
         Student john = new Student("John", "Smith", jHome, school);

         Address mHome = new Address("123 Main Street", "North Pole", "NU",
                     "H0H 0H0");
         Student marsha = new Student("Marsha", "Jones", mHome, school);
         john.setTestScore(1, JTEST1);
         john.setTestScore(2, JTEST2);
         john.setTestScore(TEST3, JTEST3);
         
         marsha.setTestScore(1, MTEST1);
         marsha.setTestScore(2, MTEST2);
         marsha.setTestScore(TEST3, MTEST3);

         System.out.println(john);
         System.out.println();
         System.out.println(marsha);
     }
}

