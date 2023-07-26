class Device
{
    String brand;
    double price;
    
    Device(String brand, double price)
    {
       this.brand = brand;
       this.price = price;
    }
    
    void activate()
    {
        System.out.println("Welcome "+ brand);
    }
}