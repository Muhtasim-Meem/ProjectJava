package banking;

public class StudentAccount extends BankAccount {
    private String institutionName;

    public StudentAccount(String name, String nid, double balance, String institutionName) {
        super(name, nid, balance);
        this.institutionName = institutionName;
    }

    public String getInstitutionName() {
        return institutionName;
    }
}
