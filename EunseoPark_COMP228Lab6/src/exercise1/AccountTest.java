package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000.0);

        List<Transaction> transactions = new ArrayList<>(); // Create a list of transactions
        transactions.add(new Transaction(account, TransactionType.WITHDRAW, 150.0));
        transactions.add(new Transaction(account, TransactionType.DEPOSIT, 700.0));
        transactions.add(new Transaction(account, TransactionType.WITHDRAW, 200.0));
        transactions.add(new Transaction(account, TransactionType.DEPOSIT, 900.0));

        ExecutorService executorService = Executors.newFixedThreadPool(transactions.size());
        for (Transaction transaction : transactions) {
            executorService.execute(transaction);
        }

        executorService.shutdown();
    }
}