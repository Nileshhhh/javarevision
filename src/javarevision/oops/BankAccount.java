package javarevision.oops;

public class BankAccount {
    private String owner;
    private int balance;

    BankAccount(String owner,int balance)
    {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int amount)
    {
       balance = amount + balance;
        System.out.println(this.owner + " " + "has deposited " + amount);
    }
    public void withdraw(int amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println(this.owner + " has debited with : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void showBalance()
    {
        System.out.println(this.owner + " has balance of : " + balance);
    }
    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}


