package PolymorphicSorting;

@SuppressWarnings("rawtypes")
public class SalesPerson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public SalesPerson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        // return (lastName.equals(((Salesperson)other).getLastName()) &&
        // firstName.equals(((Salesperson)other).getFirstName()));
        return (getLastName().equals(((SalesPerson) other).getLastName()));
    }

    public int compareTo(Object other) {
        int result;
        Integer currentSale = new Integer(getSales());
        result = currentSale.compareTo(((SalesPerson) other).getSales());
        if (result == 0) {
            if (getLastName().equals(((SalesPerson) other).getLastName())) {
                result = getFirstName().compareTo(((SalesPerson) other).getFirstName());
            } else {
                result = getLastName().compareTo(((SalesPerson) other).getLastName());
            }

        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}