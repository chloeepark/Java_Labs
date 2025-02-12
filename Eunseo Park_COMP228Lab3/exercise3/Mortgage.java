package exercise3;

public abstract class Mortgage implements MortgageConstants {
    private String mortgageNumber;
    private String customerName;
    private double amountOfMortgage;
    private double interestRate;
    private int term;

    // Constructor
    public Mortgage(String mortgageNumber, String customerName, double amountOfMortgage, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        setAmountOfMortgage(amountOfMortgage);
        this.interestRate = interestRate;
        setTerm(term);
    }

    // Getters
    public void setAmountOfMortgage(double amountOfMortgage) {
        if (amountOfMortgage > MAX_MORTGAGE_AMOUNT) {
            throw new IllegalArgumentException("Mortgage amount cannot exceed " + MAX_MORTGAGE_AMOUNT);
        }
        this.amountOfMortgage = amountOfMortgage;
    }

    // Setters
    public void setTerm(int term) {
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    // Abstract method
    public abstract void setInterestRate(double currentRate);
    
    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Amount of Mortgage: $" + amountOfMortgage + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " years\n" +
                "Total Amount Owed: $" + (amountOfMortgage + amountOfMortgage * interestRate / 100 * term);
   }
}
