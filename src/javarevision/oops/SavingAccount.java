package javarevision.oops;

public class SavingAccount extends BankAccount{

    private double interestRate;

    SavingAccount (String owner, int balance, double interestRate)
    {
        super(owner, balance);
        this.interestRate = interestRate;
    }
    public void addInterest()
    {
        int interest = (int) (getBalance()* interestRate/100);
        deposit(interest);
    }
    @Override
    public void withdraw(int amount)
    {
        if (getBalance() - amount <1000)
        {
            System.out.println("Minimum balance of 1000 required");
        } else {
            super.withdraw(amount);
        }
    }
}
