import java.util.Random;

/**
 * Account program.
 * 
 * @author Jake
 * @version 1.0
 */
public class Account1 {

    /**
     * Declare number of accounts.
     */
    private static int numAccounts;

    /**
     * Declase the balance number in every accounts.
     */
    private double balance;

    /**
     * Account name.
     */
    private String name;

    /**
     * Declare account number.
     */
    private long accountNum;
    

    /**
     * Setting account information.
     * 
     * @param initBal
     *            account balance
     * @param owner
     *            account owner
     * @param number
     *            account number
     */
    public Account1(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        accountNum = number;
        numAccounts++;
    }

    /**
     * Getting account info.
     * 
     * @param initBal
     *            balance
     * @param owner
     *            name
     */
    public Account1(double initBal, String owner) {
        Random generator = new Random();
        balance = initBal;
        name = owner;
        accountNum = generator.nextLong();
        numAccounts++;
    }

    /**
     * Account owner.
     * 
     * @param owner
     *            owner
     */
    public Account1(String owner) {
        Random generator = new Random();
        name = owner;
        balance = 0;
        accountNum = generator.nextLong();
        numAccounts++;
    }

    /**
     * Checks to see if balance is sufficient for withdrawal. If so, decrements
     * balance by amount; if not, prints message.
     * @param amount
     * amount
     * @param fee
     * fee
     */
    public void withdraw(double amount, int fee) {
        if (balance >= amount) {
            balance -= amount - fee;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    /**
     * Withdraw money.
     * @param amount
     * withdraw amount
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    /**
     * Deposit fee.
     * @param amount
     * amount
     */
    public final void deposit(double amount) {
        balance += amount;
    }

    /**
     * Get balance amount.
     * 
     * @return blance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Get account number.
     * @return
     * account number
     */
    public long getAccountNum() {
        return accountNum;
    }
    
    /**
     * Get account name.
     * @return
     * name
     */
    public String getName() {
        return name;
    }

    /**
     * Get account information.
     * 
     * @return account information
     */
    public String toString() {
        return "Name: " + name + "\nAccount Number: " 
                                        + accountNum + "\nBalance: " + balance;
    }


    /**
     * Get the account number.
     * 
     * @return Account number
     */
    public static int getNumAccount() {
        return numAccounts;
    }
    
    /**
     * Close method.
     */
    public void close() {
        name += " Closed";
        balance = 0.0;
        numAccounts--;
    }

    /**
     * Account consolidation.
     * 
     * @param acct1
     *            account 1
     * @param acct2
     *            account 2
     * @return account consolidate
     */
    public static Account1 consolidate(Account1 acct1, Account1 acct2) {
        if ((acct1.getName()).equalsIgnoreCase(acct2.getName())) {
            Random generator = new Random();
            long newAccountNum = generator.nextLong();
            Account1 acctConsolidate = new Account1(acct1.getBalance() 
                                    + acct2.getBalance(), acct1.getName(),
                                        newAccountNum);
            acct1.close();
            acct2.close();
            return acctConsolidate;
        } else {
            return null;
        }
    }
}