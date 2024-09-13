package banking;

import java.util.*;

public class Bank {
    private String name;
    private Map<String, BankAccount> accounts;
    private List<Transaction> transactions;

    public Bank(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
        this.transactions = new ArrayList<>();
    }

    public void deposit(String accountNumber, double amount) throws InvalidAccountException {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new InvalidAccountException("Account not found");
        }
        account.deposit(amount);
        transactions.add(new Transaction(accountNumber, "Deposit", amount));
    }

    public void withdraw(String accountNumber, double amount) throws InvalidAccountException, InSufficientBalanceException {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new InvalidAccountException("Account not found");
        }
        account.withdraw(amount);
        transactions.add(new Transaction(accountNumber, "Withdraw", amount));
    }

    public void transfer(String fromAccount, String toAccount, double amount) throws InvalidAccountException, InSufficientBalanceException {
        BankAccount from = accounts.get(fromAccount);
        BankAccount to = accounts.get(toAccount);
        if (from == null || to == null) {
            throw new InvalidAccountException("One or both accounts not found");
        }
        from.withdraw(amount);
        to.deposit(amount);
        transactions.add(new Transaction(fromAccount, "Transfer", amount));
    }

    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }

    public void createAccount(String name, String nid, double balance) {
        BankAccount account = new BankAccount(name, nid, balance);
        accounts.put(account.getAccountNumber(), account);
    }

    // Additional methods and classes
}

