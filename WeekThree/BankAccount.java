import java.util.Scanner;

class BankAccount
{
    final double INTEREST_RATE = 0.1;    

    double balance; // class attribute

    BankAccount(double theBalance) // BankAccount constructor 
    {
        // Initialise class attributes
        balance = theBalance;
    }

    // deposit is a procedure method, parameter amount
    void deposit(double amount)
    {
        balance = balance + amount;
    }

    double calcInterest()
    {
        double interest = balance * INTEREST_RATE;// local variable interest
        return interest;
    }

    void displayBalance()
    {
        System.out.println("The balance of your account is now: " + balance);
    }

    void withdraw(double amount) // parameter amount
    {
        balance = balance - amount;
    }

    void getLoginInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = in.next(); // local variable username
        System.out.println("Please enter your PIN:");
        int pin = in.nextInt();// local variable pin
        // Continue login process... Check details etc
    }

    void startDeposit()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = in.nextDouble();
        deposit(amount);
    }
    
    void addBonus(double amount)
    {
        if(balance > 5000)
        {
            deposit(amount);
        }
    }

    void addInterest()
    {
        if(balance >= 10000)
        {
            deposit(0.1 * balance);
        }
        else if(balance < 10000 && balance >= 5000)
        {
            deposit(0.05 * balance);
        }
        else if(balance <= 4999 && balance >= 1000)
        {
            deposit(0.01 * balance);
        }
        else if(balance < 1000)
        {
            deposit(0);
        }
    }
}