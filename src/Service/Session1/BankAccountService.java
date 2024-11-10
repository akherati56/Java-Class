package Service.Session1;

import java.util.ArrayList;

public class BankAccountService {

    private double balance;
    private String Branch;
    private boolean locked;
    private ArrayList<String> transaction = new ArrayList<>();

    public BankAccountService(double balance) {
        this.balance = balance;
        this.Branch = "Tehran";
        this.locked = false;
        this.transaction.add("initial balance");
    }

    public BankAccountService(double balance, String Branch) {
        this.balance = balance;
        this.Branch = Branch;
        this.locked = false;
        this.transaction.add("initial balance");
    }

    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            this.transaction.add("withdraw " + amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transaction.add("deposit " + amount);
    }

    public ArrayList<String> GetLastTransaction() {
        return this.transaction;
    }

    public String info(){
        return "balance: " + this.balance + "\nBranch: " + this.Branch + "\nLocked: " + this.locked + "\nTransactions History: " + this.transaction;
    }

}
