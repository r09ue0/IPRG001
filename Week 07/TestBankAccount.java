public class TestBankAccount
{
    // Set the size of the array accounts as 20
    private BankAccount[] accounts = new BankAccount[20];

    public TestBankAccount()
    {   
        // Create all 20 objects – use a for loop
        for(int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new BankAccount(500.0);
        }

        // Call deposit() for all 20 objects
        depositAll(100.0);

        // Call displayBalance() for all 20 objects
        displayBalanceForAll();

        endMonth();

        // Call displayBalance() for all 20 objects
        displayBalanceForAll();
    }

    private void depositAll(double depositAmount)
    {
        for(int i = 0; i < accounts.length; i++)
        {
            accounts[i].deposit(depositAmount);
        }
    }

    private void displayBalanceForAll()
    {
        for(int i = 0; i < accounts.length; i++)
        {
            accounts[i].displayBalance();
        }
    }

    private void endMonth()
    {
        for(int i = 0; i < accounts.length; i++)
        {
            accounts[i].withdraw(10);
        }
    }
}