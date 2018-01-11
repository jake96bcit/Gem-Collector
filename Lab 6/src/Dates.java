import java.util.Scanner;

/**
 * Dates validation.
 * 
 * @author Jake
 * @version 1.0
 */
public class Dates {

    /**
     * Constant J.
     */
    static final int J = 1;
    /**
     * Constant Feb.
     */
    static final int FEB = 2;
    /**
     * Constant Mar.
     */
    static final int MAR = 3;
    /**
     * Constant Apl.
     */
    static final int APL = 4;
    /**
     * Constant May.
     */
    static final int MAY = 5;
    /**
     * Constant JN.
     */
    static final int JN = 6;
    /**
     * Constant JL.
     */
    static final int JL = 7;
    /**
     * Constant Aug.
     */
    static final int AUG = 8;
    /**
     * Constant SP.
     */
    static final int SP = 9;
    /**
     * Constant Oct.
     */
    static final int OCT = 10;
    /**
     * Constant Nov.
     */
    static final int NOV = 11;
    /**
     * Constant DE.
     */
    static final int DE = 12;
    /**
     * Constant maximum day of a month.
     */
    static final int S_MAX_DAY = 31;
    /**
     * Constant day of a month.
     */
    static final int MAX_DAY = 30;
    /**
     * Constant maximum Feb day.
     */
    static final int S_FEB_DAY = 29;
    /**
     * Constant normal Feb day.
     */
    static final int FEB_DAY = 28;
    
    /**
     * Constant minimum year.
     */
    static final int MIN_YEAR = 1000;
    
    /**
     * Constant maximum year.
     */
    static final int MAX_YEAR = 1999;
    
    /**
     * Constant 100.
     */
    static final int HUND = 100;
    
    /**
     * Constant 400.
     */
    static final int FHUND = 400;
    
    /**
     * The main method.
     * 
     * @param args
     *            Program arguments
     */
    public static void main(String[] args) {
        
        /**
         * DElare month, day, year, days in month,
         * month valid, year valid, day valid,
         * and leap year.
         */
        int day;
        int month;
        int year;
        int daysInMonth = 0;
        boolean monthValid = false;
        boolean yearValid = false;
        boolean dayValid;
        boolean leapYear = false;

        Scanner scan = new Scanner(System.in);
        
        /**
         * Input value.
         */    
        System.out.print("Type in month:");
        month = scan.nextInt();
        System.out.print("Type in day:");
        day = scan.nextInt();
        System.out.print("Type in year:");
        year = scan.nextInt();
        
        /**
         * Condition of a month, day, year, and leap year.
         */
        if (month >= J && month <= DE) {
            monthValid = true;
        } else {
            monthValid = false;
            }
        if (year >= MIN_YEAR && year <= MAX_YEAR) {
            yearValid = true;
        } else {
            yearValid = false;
        }
        if ((year % APL) == 0 && (year % HUND) != 0 || (year % FHUND) == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        
        /**
         * Day in month.
         */
        if (month == J || month == MAR || month == MAY || month == JL 
                        || month == AUG || month == OCT || month == DE) { 
            daysInMonth = S_MAX_DAY;
            } else if (month == APL || month == JN || month == SP 
                    || month == NOV) { 
                        daysInMonth = MAX_DAY;
                   }
        if (month == FEB && leapYear) {
            daysInMonth = S_FEB_DAY;
        } else { 
             daysInMonth = FEB_DAY;
        }
        if (day >= 1 && day == daysInMonth) {
            dayValid = true;
        } else {
            dayValid = false;
        }
        
        /**
         * Print the result is that the day, month, and year
         * are valid or not.
         */
        if (monthValid && yearValid && dayValid) {
            System.out.print("Date is valid.");            
        } else if (monthValid && yearValid && dayValid && leapYear) {
            System.out.println("Date is valid, and it is a leap year.");
        } else if (!dayValid && !monthValid && !yearValid) {
            System.out.println("Day or month or year is invalid.");
        }
        scan.close();
    }
}
