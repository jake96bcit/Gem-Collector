package AnotherTypeOfEmployee;

//******************************************************************
//Employee.java      Author: Lewis/Loftus
//
//Represents a general paid employee.
//******************************************************************

public class Employee extends StaffMember {
    protected String socialSercurityNumber;
    protected double payRate;

    // ---------------------------------------------------------------
    // Sets up an employee with the specified information.
    // ---------------------------------------------------------------
    public Employee (String eName, String eAddress, String ePhone,
                String socSecNumber, double rate) {
        super (eName, eAddress, ePhone);
        socialSercurityNumber = socSecNumber;
        payRate = rate;
    }
    // ---------------------------------------------------------------
    // Returns information about an employee as a string.
    // ---------------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSercurityNumber;
        return result;
    }

    // ---------------------------------------------------------------
    // Returns the pay rate for this employee.
    // ---------------------------------------------------------------
    public double pay() {
        return payRate;
    }
}