/**
 * Name.
 * @author Jake
 * @version 1.0
 */
public class Name {
    
    /**
     * declare first name.
     */
    private String firstName;
    
    /**
     * declare middle name.
     */
    private String middleName;
    
    /**
     * declare last name.
     */
    private String lastName;
    
    /**
     * declare class name.
     * @param first
     *      First name
     * @param middle
     *      Middle name
     * @param last
     *      Last name
     */
    public Name(String first, String middle, String last) {
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
    }
    
    /**
     * Get first name.
     * @return
     *      Return the first name
     */
    public String getFirst() {
        return this.firstName;
    }
    
    /**
     * Get middle name.
     * @return
     *      Return the middle name
     */
    public String getMiddle() {
        return this.middleName;
    }
    
    /**
     * Get lasst name.
     * @return
     *      Return last name
     */
    public String getLast() {
        return this.lastName;
    }
    
    /**
     * get full name: first middle last.
     * @return
     *      Return the full name
     */
    public String firstMiddleLast() {
        String firstMiddleLast = this.firstName + " " + this.middleName 
                + " " + this.lastName;
        return firstMiddleLast;
    }
    
    /**
     * Get full name: last, first middle.
     * @return
     *      Return the full name
     */
    public String lastFirstMiddle() {
        String lastFirstMiddle = this.lastName + ", " 
                + this.firstName + " " + this.middleName;
        return lastFirstMiddle;
    }
    
    /**
     * Note: Eclipse requires that a definition of 'equals()' 
     * must be provided with a corresponding definition of 'hashCode()'.
     * this method is dummy just to by pass this complain.
     * this assignment doesn't require a hash code
     * @return 0
     */
    public int hashCode() {
        return 0;
    }
    
    /**
     * Comparing the old name with the new name.
     * @param otherName
     *      Comparing the new name with the old name
     * @return
     *      true if the old name is the same with the new name
     */
    public boolean equals(Name otherName) {      
        boolean isFirstEqual =
                this.firstName.equalsIgnoreCase(otherName.getFirst());
        boolean isMiddleEqual =
                this.middleName.equalsIgnoreCase(otherName.getMiddle());
        boolean isLastEqual =
                this.lastName.equalsIgnoreCase(otherName.getLast());
        
        boolean isEqual = isFirstEqual && isMiddleEqual && isLastEqual;
        
        return isEqual;
    }
    
    /**
     * Get the first letter of first, middle, and last name, then change them
     * to Upper Case.
     * @return return the result after compare tow names
     */
    public String initials() {
        String firstNameInitial =
                this.firstName.substring(0, 1).toUpperCase();
        String middleNameInitial =
                this.middleName.substring(0, 1).toUpperCase();
        String lastNameInitial =
                this.lastName.substring(0, 1).toUpperCase();
        
        return firstNameInitial + middleNameInitial + lastNameInitial;
    }
    
    /**
     * Counting how many letter of the whole name.
     * @return
     *      The number of letter of the name
     */
    public int length() {
        return (this.firstName.length() 
                + this.middleName.length() + this.lastName.length());
    }
}
