class Room
{
    int id;
    int capacity;
    double price;
    boolean booked = false;
    boolean paid = false;

    Room(int id, int capacity, double price)
    {
        this.id = id;
        this.capacity = capacity;
        this.price = price;
    }

    void book()
    {
        booked = true;
    }

    void pay()
    {
        paid = true;
    }
}
