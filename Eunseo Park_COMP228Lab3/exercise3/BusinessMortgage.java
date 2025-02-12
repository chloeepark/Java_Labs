package exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String mortgageNumber, String customerName, double amountOfMortgage, double currentRate, int term) {
        super(mortgageNumber, customerName, amountOfMortgage, currentRate + 1.0, term); // Business mortgage rate is 1% higher than current rate
    }

    @Override
    public void setInterestRate(double currentRate) {
        // Already set in constructor
    }
}
