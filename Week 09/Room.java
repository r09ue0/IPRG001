public class Room
{
    private int id;
    private int capacity;
    private double price;
    private boolean booked = false;
    private boolean paid = false;

    public Room(int id, int capacity, double price)
    {
        this.id = id;
        this.capacity = capacity;
        this.price = price;
    }

    public void book()
    {
        booked = true;
    }

    public void pay()
    {
        paid = true;
    }
    
    public int getId()
    {
        return id;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public boolean isBooked()
    {
        return booked;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public String toString()
    {
        return "Room "+ id +" : capacity:"+ capacity +" price:$"+ price;
    }
}
