package chap07;

/**
 * Represents a college student.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Student {
    
    final static int MAX_TEST = 3;
    
    private double test1;
    private double test2;
    private double test3;
    
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    

    /**
    * Constructor: Sets up this student with the specified values.
    * @param first The first name of the student
    * @param last The last name of the student
    * @param home The home address of the student
    * @param school The school address of the student
    */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    public void setTestScore(int i, int score) {
        if (i == 1) {
            test1 = score;
        } else if (i == 2) {
            test2 = score;
        } else {
            test3 = score;
        }
    }
    
    public double getTestScore (int i) {
        if (i == 1) {
            return test1;
        } else if (i == 2) {
            return test2;
        } else {
            return test3;
        }
    }
    
    public double average() {
        double average;
        average = Math.round((test1 + test2 + test3) / MAX_TEST);
        return average;
    }

    /**
    * Returns a string description of this Student object.
    * @return formatted name and addresses of student
    */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test 1:   " + test1 + "\n";
        result += "Test 2:   " + test2 + "\n"; 
        result += "Test 3:   " + test3 + "\n"; 
        result += "Average:  " + average();
        return result;
    }
}
