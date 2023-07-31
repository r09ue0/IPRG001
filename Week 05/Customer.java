public class Customer
{
    private String name;
    private double credit;
    private boolean isMember;
    
    public Customer(String name, double credit, boolean isMember)
    {
        setName(name);
        setCredit(credit);
        setIsMember(isMember);
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getCredit()
    {
        return credit;
    }
    
    public boolean isMember()
    {
        return isMember;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setCredit(double credit)
    {
        this.credit = credit;
    }
    
    public void setIsMember(boolean isMember)
    {
        this.isMember = isMember;
    }
    
    public String toString()
    {
        return "Name: "+ name +", Credit: "+ credit
        +", Is a Loyalty Customer"+ isMember;
    }
    
    public void purchase(Game game)
    {
        if(getCredit() >= game.getPrice())
        {
            if(game.getIsAvailable())
            {
                game.setIsAvailable(false);
                credit -= game.getPrice();
                System.out.println(game.getName() +" Purchase Success!");
            }
            else
            {
                System.out.println(game.getName() +" is Out of Stock!");
            }
        }
        else
        {
            System.out.println("Not Enough Credits!");
        }
    }
}