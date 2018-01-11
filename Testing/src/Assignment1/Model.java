package Assignment1;

/**
 * This is a class about Model.
 * 
 * @author Vinh Le
 * @version 1.0
 */
public class Model {
    
    // Model first name.
    private String firstName;
    
    // Model last name.
    private String lastName;
    
    // Model height
    private int height;
    
    // Model weight.
    private double weight;
    
    // Can travel?
    private boolean canTravel;
    
    // Is smoker?
    private boolean isSmoker;
    
    // Occupation
    private static String occupation = "modeling";
    
    // Kilogram
    private long kilo;
    
    // Pounds
    private double pounds;
    
    // Feet
    private int feet;
    
    // Inches
    private int inches;
    
    // Metric units
    private boolean metricUnits;
    
    // Inches to centimeters
    public static final double INCHES_TO_CENTIMETER = 2.24;
    
    // minimum name lenght
    public static final int MINIMUM_NAME_LENGHT = 3;
    
    // maximum name lenght
    public static final int MAXIMUM_NAME_LENGHT = 20;
    
    // minimum height
    public static final int MINIMUM_HEIGHT = 24;
    
    // maximum height
    public static final int MAXIMUM_HEIGHT = 84;
    
    // minimum weight
    public static final double MINIMUM_WEIGHT = 80;
    
    // maximum weight
    public static final double MAXIMUM_WEIGHT = 280;
    
    // pounds to kilograms
    public static final double POUNDS_TO_KILO = 2.2;
    
    // inches per feet
    public static final int INCHES_PER_FOOT = 12;
    
    // base rate dollars per hour
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    
    // tall inches
    public static final int TALL_INCHES = 67;
    
    // thin pounds
    public static final double THIN_POUNDS = 140.0;
    
    // tall thin bonus dollar per hour
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    
    // travel bonus dollars per hour
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    
    // smoker deduction dollars per hour
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    /**
     * Default constructor
     */
    public Model() {
    }
    
    /**
     * Constructor for objects of class Model
     * Second
     * 
     * @param newFirstName - model first name
     * @param newLastName  - model last name
     * @param newHeight    - model height
     * @param newWeight    - model weight
     * @param newCanTravel - can model travel?
     * @param newIsSmoker  - does model smoking?
     * 
     */
    public Model(String newFirstName, String newLastName, int newHeight,
                 double newWeight, boolean newCanTravel, boolean newIsSmoker) {
           setName(newFirstName, newLastName);
           setModelHeight(newHeight);
           setModelWeight(newWeight);
           setTravel(newCanTravel);
           setSmoker(newIsSmoker);
    }
    
    /**
     * This is the mutator for model name.
     * 
     * @param newFirstName - model first name
     * @param newLastName  - model last name
     */
    public final void setName(String newFirstName, String newLastName) {
        if((newFirstName != null && newFirstName.length() >= MINIMUM_NAME_LENGHT && newFirstName.length() <= MAXIMUM_NAME_LENGHT) && (newLastName != null && newLastName.length() >= MAXIMUM_NAME_LENGHT && newLastName.length() <= MAXIMUM_NAME_LENGHT)) {
            firstName = newFirstName;
            lastName = newLastName;
        } else {
        }
    }
    
    /**
     * This is the mutator for model height.
     * 
     * @param newHeight - model height
     * 
     */
    public final void setModelHeight(int newHeight) {
        if (newHeight >= MINIMUM_HEIGHT && newHeight <= MAXIMUM_HEIGHT) {
               height = newHeight;
        } else {
        }
    }
    
    /**
     * This is the mutator for model weight.
     * 
     * @param newWeight - model weight
     * 
     */
    public final void setModelWeight(double newWeight) {
        if (newWeight >= MINIMUM_WEIGHT && newWeight <= MAXIMUM_WEIGHT) {
               weight = newWeight;
        } else {
        }
    }
    
    /**
     * This is the mutator for can model travel
     * 
     * @param newCanTravel - can model travel
     * 
     */
    public final void setTravel(boolean newCanTravel) {
        if (newCanTravel = true) {
            System.out.println(" yep");
        } else {
            System.out.println(" nope");
        }
    }
    
    /**
     * This is the mutator for is model smoking
     * 
     * @param newIsSmoker - is model smoker
     * 
     */
    public final void setSmoker(boolean newIsSmoker) {
        if (newIsSmoker = true) {
            System.out.println( "yep");
        } else {
            System.out.println(" nope");
        }
    }
    
    /**
     * Constructor for objects of class Model
     * Third
     * 
     * @param first          - model first name
     * @param last           - model last name
     * @param modelHeight    - model height
     * @param modelWeight    - model weight
     * 
     */
    public Model(String newFirstName, int newHeight, String newLastName,
                 double newWeight) {
           setName(newFirstName, newLastName);
           setModelHeight(newHeight);
           setModelWeight(newWeight);
    }
   
    /**
     * This is the mutator for can model travel
     * 
     * @param newCanTravel - can model travel
     * 
     */
    public final void setWillTravel(boolean willTravel) {
        canTravel = willTravel;
        willTravel = true;
    }
    
    /**
     * This is the mutator for is model smoking
     * 
     * @param newIsSmoker - is model smoker
     * 
     */
    public final void setNotSmoker(boolean notSmoker) {
        isSmoker = notSmoker;
        notSmoker = false;
    }
    
    /**
     * This is the mutator for weight in kilograms
     * 
     * @param kilo
     * 
     */
    public final void setWeight(long kilo) {
        kilo = Math.round(weight / POUNDS_TO_KILO);
    }
    
    /**
     * This is the mutator for weight in pounds
     * 
     * @param pounds
     * 
     */
    public final void setWeight(double pounds) {
        weight = pounds;
    }
    
    /**
     * This is the mutator for height in feet and inches
     * 
     * @param feet 
     * @param inches
     * 
     */
    public final void setHeight(int feet, int inches) {
        feet = height / INCHES_PER_FOOT;
        inches = height % INCHES_PER_FOOT;
    }
    
    /**
     * This is the mutator for height in inches
     * 
     * @param inches
     * 
     */
    public final void setHeight(int inches) {
        height = inches;
    }
    
    /**
     * This is the method that return model fist name
     * 
     * @return first name
     * 
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * This is the method that return model last name
     * 
     * @return last name
     * 
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * This is the method that return model height
     * 
     * @return height
     * 
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * This is the method that return model weight
     * 
     * @return weight
     * 
     */
    public double getWeight() {
        return weight;
    }
    
    /**
     * This is the method that return can the model travel
     * 
     * @return true or false
     * 
     */
    public boolean getTraveler() {
        return canTravel;
    }
    
    /**
     * This is the method that return is the model smoking
     * 
     * @return true or false
     * 
     */
    public boolean getSmoker() {
        return isSmoker;
    }
    
    /**
     * This is the method that return the model height in feet and inches.
     * 
     * @return feet and inches
     * 
     */
    public String getHeightInFeetAndInches() {
        return feet + " feet " + inches + " inch(es).";
    }
    
    /**
     * This is the method that return model weight in kg.
     * 
     * return kg
     */
    public long getWeightKg() {
        return kilo;
    }
    
    /**
     * This is the method that return occupation.
     * 
     * @return occupation
     * 
     */
    public static String getOccupation() {
        return occupation;
    }
    
    /**
     * This is the mothod that print out the model details
     * 
     * return detail
     * 
     */
    public void printlnDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + getWeight() + " pounds");
        System.out.println(getTraveler());
        System.out.println(getSmoker());
    }
    
    /**
     * This method is returning model pay rate per hour
     * 
     * @return model pay rate
     * 
     */
    public int calculatePayDollarsPerHour() {
        int salary;
        if (height >= TALL_INCHES && weight <= THIN_POUNDS && canTravel == true && isSmoker == false) {
            return salary = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        } else if (height >= TALL_INCHES && weight <= THIN_POUNDS && canTravel == true && isSmoker == true) {
            return salary = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        } else if (height >= TALL_INCHES && weight <= THIN_POUNDS && canTravel == false && isSmoker == true) {
            return salary = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        } else if (height >= TALL_INCHES && weight <= THIN_POUNDS && canTravel == false && isSmoker == false) {
            return salary = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        } else if ((height <= TALL_INCHES || weight >= THIN_POUNDS) && canTravel == true && isSmoker == false) {
            return salary = BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        } else if ((height <= TALL_INCHES || weight >= THIN_POUNDS) && canTravel == true && isSmoker == true) {
            return salary = BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        } else if ((height <= TALL_INCHES || weight >= THIN_POUNDS) && canTravel == false && isSmoker == true) {
            return salary = BASE_RATE_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        } else {
            return salary = BASE_RATE_DOLLARS_PER_HOUR;
        }
    }
    
    /**
     * This is the method that display model details with hour rates
     * 
     * @return model details
     */
    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        System.out.println("Traveler: " + getTraveler());
        System.out.println("Smoker: " + getSmoker());
        System.out.println("Hourly rate: " + calculatePayDollarsPerHour());
    }
    
    /**
     * This is the overloaaded method that return model details in metrics
     * 
     * @return model details in metrics
     * 
     */
    public void disPlayModelDetails(boolean metricUnits) {
        if (metricUnits == true) {
             System.out.println("Name: " + getFirstName() + " " + getLastName());
             System.out.println("Height: " + Math.round(INCHES_TO_CENTIMETER * height) + (" cm"));
             System.out.println("Weight: " + getWeightKg() + " kg");
             System.out.println("Traveler: " + getTraveler());
             System.out.println("Smoker: " + getSmoker());
             System.out.println("Hourly rate: " + calculatePayDollarsPerHour());
        } else {
            displayModelDetails();
        }
    }
}
