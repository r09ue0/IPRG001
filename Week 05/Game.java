public class Game
{
    private String name;
    private double price;
    private boolean isAvailable;
    
    public Game(String name, double price, boolean isAvailable)
    {
        setName(name);
        setPrice(price);
        setIsAvailable(isAvailable);
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    
    public String toString()
    {
        return "Name: "+ name +", Price: "+ price
        +", Is Available"+ isAvailable;
    }
}