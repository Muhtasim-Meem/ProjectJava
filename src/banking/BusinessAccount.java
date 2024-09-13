package banking;

public class BusinessAccount extends BankAccount {
    private String tradeLicense;

    public BusinessAccount(String name, String nid, double balance, String tradeLicense) {
        super(name, nid, balance);
        this.tradeLicense = tradeLicense;
    }

    public String getTradeLicense() {
        return tradeLicense;
    }
}
