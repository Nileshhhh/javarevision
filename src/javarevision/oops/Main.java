package javarevision.oops;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Nilesh" , 5000);
        BankAccount b2 = new BankAccount("Friend", 2000);
        b1.deposit(1000);
        b2.withdraw(3000);
        b1.showBalance();
        b2.showBalance();
        SavingAccount s = new SavingAccount("Nilesh", 5000, 4.5);
        s.deposit(1000);
        s.showBalance();
        b1.withdraw(500);
        s.withdraw(6500);
        s.addInterest();
        s.showBalance();
    }

}
