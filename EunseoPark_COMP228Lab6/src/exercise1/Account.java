package exercise1;

public class Account {
    private double balance; 

    // Constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Fix the deposit
    public synchronized void deposit(double amount) {
        double newBalance = balance + amount;
        try {
            Thread.sleep(1000); // Simulating some processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = newBalance;
        System.out.println("Deposited $" + amount + ", new balance: $" + balance);
    }

    // Fix the withdraw
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            double newBalance = balance - amount;
            try {
                Thread.sleep(1000); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
            System.out.println("Withdrew $" + amount + ", new balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        }
    }
}
