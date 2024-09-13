package banking;

import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String accountNumber, String type, double amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("Date: %s, Account: %s, Type: %s, Amount: %.2f", timestamp, accountNumber, type, amount);
    }
}
