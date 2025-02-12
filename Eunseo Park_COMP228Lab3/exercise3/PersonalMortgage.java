package exercise3;

public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String mortgageNumber, String customerName, double amountOfMortgage, double currentRate, int term) {
        super(mortgageNumber, customerName, amountOfMortgage, currentRate + 2.0, term); // Personal mortgage rate is 2% higher than current rate
    }

    @Override
    public void setInterestRate(double currentRate) {
       // Already set in constructor
    }
}
