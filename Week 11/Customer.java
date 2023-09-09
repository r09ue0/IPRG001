public class Customer
{
    private String name;
    private String phoneNumber;
    private double credit;

    public Customer(String name, String phoneNumber, double credit)
    {
        //this.name = name;
        setName(name);
        //this.phoneNumber = phoneNumber;
        setPhoneNumber(phoneNumber);
        //this.credit = credit;
        setCredit(credit);
    }

    // accessors
    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public double getCredit()
    {
        return credit;
    }

    // mutators
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setCredit(double credit)
    {
        this.credit = credit;
    }

    // PSEUDOCODE 
    // if customer.credit >= game price
    //      if game is available
    //          game.isAvailable = false
    //          credit = credit = game.price
    //          display 'purchase success'
    //      else
    //          display 'game out of stock'
    // else
    //      display 'not enough credit'
    public void purchase(Game theGame)
    {
        if (credit >= theGame.getPrice())
        {
            if (theGame.getIsAvailable())
            {
                theGame.setIsAvailable(false);
                //credit = credit - theGame.getPrice();
                credit -= theGame.getPrice();
                System.out.println("Purchase of " + theGame.getTitle() + " was successful");
            }
            else
            {
                System.out.println("Error - game out of stock");
            }
        }
        else
        {
            System.out.println("Error - not enough credit");
        }
    }

    // toString()
    public String toString()
    {
        return "name : " +  name + 
        ", phone number : " + phoneNumber + 
        ", credit : " + credit;
    }
}