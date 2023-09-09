public class Product
{
    private int barCode;
    private double price;

    public Product(int theBarCode, double thePrice)
    {
        barCode = theBarCode;
        price = thePrice;
    }
    
    // Accessors and toString()
    public int getBarCode()
    {
        return barCode;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }

    public String toString()
    {
        return "Product barCode: " + barCode + ", price: " + price;
    }
}