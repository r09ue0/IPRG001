public class TestBankAccount
{
    private BankAccount accounts[];

    public TestBankAccount()
    {        
        // Set the size of the array accounts as 20
        accounts = new BankAccount[20];

        // Create all 20 objects – use a for loop
        for(int i=0; i<accounts.length; i++)
        {
            accounts[i] = new BankAccount(500);
        }

        // Call deposit() for all 20 objects
        for(int i=0; i<accounts.length; i++)
        {
            accounts[i].deposit(100);
        }
        // Call displayBalance() for all 20 objects
        for(int i=0; i<accounts.length; i++)
        {
            accounts[i].displayBalance();
        }
    }
    
    public void endMonth()
    {
        for(int i=0; i<accounts.length; i++)
        {
            accounts[i].withdraw(10);
        }
    }
}