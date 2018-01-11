import java.util.Random;
import java.util.Scanner;

/**
 * Test account.
 * 
 * @author Jake
 * @version 1.0
 */
public class TestAccount1 {

    /**
     * Constant of account balance.
     */
    static final double MIN = 100;

    /**
     * Main method.
     * 
     * @param args
     *            program arguments
     */
    public static void main(String[] args) {

        Random generator = new Random();
        long accountNum1 = generator.nextLong();
        long accountNum2 = generator.nextLong();
        long accountNum3 = generator.nextLong();
        Account acct1;
        Account acct2;
        Account acct3;
        Scanner scan = new Scanner(System.in);
        
        //First Account
        System.out.println("What is the name for account 1: ");
        String name = scan.nextLine();
        acct1 = new Account(MIN, name, accountNum1);
        System.out.println(acct1);
        System.out.println("Now there are " + Account.getNumAccount() 
                                + " accounts");
        
        // Second account
        System.out.println("");
        System.out.println("What is the name for account 2: ");
        name = scan.nextLine();
        acct2 = new Account(MIN, name, accountNum2);
        System.out.println(acct2);
        System.out.println("Now there are " + Account.getNumAccount() 
                                + " accounts");
        
        // Third account
        System.out.println("");
        System.out.println("What is the name for account 3: ");
        name = scan.nextLine();
        acct3 = new Account(MIN, name, accountNum3);
        acct1.close();
        System.out.println(acct3);
        System.out.println("Now there are " + Account.getNumAccount() 
                                + " accounts");
        
        // Consolidate Account
        System.out.println("");
        System.out.println("Account consolidated");
        Account newAcct = Account.consolidate(acct2, acct3);
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
        System.out.println(acct3.toString());
        if (newAcct != null) {
            System.out.println("");
            System.out.println(newAcct.toString());
        }
        System.out.println("Now there are " + Account.getNumAccount() 
                                + " accounts");
        scan.close();
    } 
}
