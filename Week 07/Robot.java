public class Robot
{
    private int id;
    private String color;    
    private int x = 2;
    private int y = 1;

    // default constructor
    public Robot()
    {
        id = 1;
        //color = "silver";
        paint("silver");
    }

    // alternate constructor
    public Robot(int id, String color)
    {
        this.id = id;
        //this.color = color;
        paint(color);
    }

    // mutators
    public void setId(int id)
    {
        this.id = id;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    // mutator for color
    public void paint(String color)
    {
        this.color = color;
    }
    
    // accessors
    public int getId()
    {
        return id;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
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
    
    public String toString()
    {
        return "The " + color + " Robot with id " + id 
            + " is at position (" + x + "," + y + ")";
    }
}