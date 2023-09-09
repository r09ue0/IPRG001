
public class Robot
{
    private int id;
    private String colour;
    private int x = 3, y = 1;
    public Robot()
    {
        id = 1;
        colour = "Silver";
    }

    public Robot(int newId, String newColour)
    {
        id = newId;
        setColour(newColour);
    }

    public void setColour(String newColour)
    {
        colour = newColour;
    }

    public void move(int across, int down)
    {
        x += across;
        y += down;
    }

    public void print()
    {
        System.out.println(toString());
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return "The " + colour + " Robot with id " + id + " is at position (" + x + "," + y +")";
    }
}
