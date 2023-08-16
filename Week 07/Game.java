public class Game
{    
    private String title;
    private double price;
    private boolean isAvailable;
    
    public Game(String title, double price, boolean isAvailable)
    {
        setTitle(title);
        setPrice(price);
        setIsAvailable(isAvailable);
    } 
    
    // accessors
    public String getTitle()
    {
        return title;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    
    // mutators
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    
    // toString()
    public String toString()
    {
        return "Game : " + title + 
            ", price : " + price + 
            ", Available : " + isAvailable;
    }
}