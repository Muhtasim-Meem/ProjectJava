package banking;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String name, String nid, double balance, double interestRate) {
        super(name, nid, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
