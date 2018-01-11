
/**
 * This class is about student.
 * 
 * @author Vinh Le 
 * @version 1.0
 */
public class Student {
    
    // Student first name.
    private String firstName;
    
    // Student last name.
    private String lastName;
    
    // Student ID.
    private String studentID;
    
    // Student email address.
    private String emailAddress;
    
    // Student courses completed.
    private int completedCourses;
    
    // Student grade.
    private double grade;
    
    //  Is student in good standing?
    private boolean isInGoodStanding;
    
    /**
     * Constructor for objects of class Student which does nothing.
     */
    public Student() {
    }

    /**
     * Constructor is expecting all data to be passed in as parameters.
     * 
     * @param initialFirstName        - The student object's initial first name.
     * @param initialLastName         - The student object's initial last name.
     * @param initialStudentID        - The student object's initial ID.
     * @param initialEmailAddress     - The student object's initial email address.
     * @param initialCompletedCourses - The student object's initial completed courses.
     * @param initialGrade            - The student object's initial grade.
     * @param initialIsInGoodStanding - The student object's initial is in good standing.
     * 
     */
    public Student(String initialFirstName, String initialLastName, String initialStudentID,
                              String initialEmailAddress, int initialCompletedCourses, double initialGrade,
                              boolean initialIsInGoodStanding) {
        firstName = initialFirstName;
        lastName = initialLastName;
        studentID = initialStudentID;
        emailAddress = initialEmailAddress;
        completedCourses = initialCompletedCourses;
        grade = initialGrade;
        isInGoodStanding = initialIsInGoodStanding;
    }
    
    /**
     * This is a method that return the letter grade value for the percent that has been entered.
     * 
     * @return letter grade.
     */
     public String getLetterGrade(double initialGrade) {
         if(initialGrade >= 90.0 && initialGrade <= 100.0) {
             return "A";
         } else if(initialGrade >= 80.0 && initialGrade <= 90.0) {
             return "B";
         } else if(initialGrade >= 70.0 && initialGrade <= 80.0) {
             return "C";
         } else if(initialGrade >= 60.0 && initialGrade <= 50.0) {
             return "D";
         } else {
             return "F";
         }
    }
}