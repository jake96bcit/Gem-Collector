package AnotherTypeOfEmployee;

public class Commission extends Hourly {
    public int totalSales = 0;
    public double comishRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
            double commission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        comishRate = commission;
    }

    public void addSales(double intervalSales) {
        totalSales += intervalSales;
    }

    public double pay() {
        double amtPaid = super.pay() + (totalSales * comishRate);
        totalSales = 0;
        return amtPaid;
    }

    public String toString() {
        String comish = super.toString();
        comish = comish + "\nTotal Sales:" + totalSales;
        return comish;
    }
}