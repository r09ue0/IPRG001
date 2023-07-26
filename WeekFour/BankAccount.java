class BankAccount 
{
    // Interest rate is a constant value, it will not change throughout  
    // the program, so we use the keyword final 

    final double INTEREST_RATE = 0.1;

    // Instance variable balance
    double balance;

    BankAccount(double openingBalance)
    { 
        // Initialise instance variables 
        balance = openingBalance; 
    } 

    void deposit(double amount)
    { 
        balance = balance + amount; 
    } 


    double calcInterest() 
    { 
        double interest = balance * INTEREST_RATE; 
        return interest;
    } 


    void displayBalance() 
    {
        System.out.println("The balance of your account is: " + balance); 
    } 


    // withdraw() method 
    
    
} 