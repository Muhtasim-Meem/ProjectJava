package banking;

import java.util.UUID;

public class BankAccount {
    private String accountNumber;
    private String name;
    private String nid;
    private double balance;

    public BankAccount(String name, String nid, double balance) {
        this.accountNumber = UUID.randomUUID().toString();
        this.name = name;
        this.nid = nid;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getNid() {
        return nid;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InSufficientBalanceException {
        if (amount > balance) {
            throw new InSufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Account Number: %s, Name: %s, Balance: %.2f", accountNumber, name, balance);
    }
}

        
