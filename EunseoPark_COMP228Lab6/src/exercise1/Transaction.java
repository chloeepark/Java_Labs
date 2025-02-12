package exercise1;

public class Transaction implements Runnable {
    private Account account;
    private TransactionType transactionType;
    private double amount;

    public Transaction(Account account, TransactionType transactionType, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    // Implement the run() method
    @Override
    public void run() {
        switch (transactionType) {
            case DEPOSIT:
                account.deposit(amount);
                break;
            case WITHDRAW:
                account.withdraw(amount);
                break;
        }
    }
}
