import java.util.*;

public class BankAccount
{
    private final double INTEREST_RATE = 0.1;    

    private double balance; // class attribute

    public BankAccount(double theBalance) // BankAccount constructor 
    {
        // Initialise class attributes
        balance = theBalance;
    }

    // deposit is a procedure method, parameter amount
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public double calcInterest()
    {
        double interest = balance * INTEREST_RATE;// local variable interest
        return interest;
    }

    public void displayBalance()
    {
        System.out.println("The balance of your account is now: " + balance);
    }

    public void withdraw(double amount) // parameter amount
    {
        balance = balance - amount;
    }

    public void getLoginInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = in.next(); // local variable username
        System.out.println("Please enter your PIN:");
        int pin = in.nextInt();// local variable pin
        // Continue login process... Check details etc
    }
}