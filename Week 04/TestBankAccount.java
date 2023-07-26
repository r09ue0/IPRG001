class TestBankAccount 
{ 
    BankAccount account; 

    TestBankAccount()
    {         
        account = new BankAccount(500); 

        // Perform a deposit 
        account.deposit(150.0); 

        // Calculate the interest due 
        double interest = account.calcInterest(); 

        // Display the interest due          
        System.out.println("The interest due is: $" + interest); 

        // Deposit the interest - NOTE: we can use a variable as an argument 
        account.deposit(interest); 

        // Disply the final balance 
        account.displayBalance();
        
        // Call withdraw() here 
        account.withdraw(100);
        account.displayBalance();
    } 
    /*
     1. BankAccount(500)
     2. deposit(150)
     3. calcInterest()
     4. println()
     5. deposit(interest)
     6. displayBalance()
     7. println()
     
     FLOW
     7, 10, 13, 7
     10, 16, 18
     13, 21, 23, 24, 13
     16
     19, 16, 18
     22, 27, 29
    */
} 

