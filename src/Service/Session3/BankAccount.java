package Service.Session3;

public class BankAccount {
    private String branch;
    private String name;
    private double balance;

    public BankAccount(String branch, String name, double balance) {
        this.branch = branch;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(){

    }

    @Override
    public String toString() {
        return "BankAccount [branch=" + branch + ", name=" + name + ", balance=" + balance + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getBranch() {
        return branch;
    }
}
