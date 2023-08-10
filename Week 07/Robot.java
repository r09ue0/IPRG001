public class Robot
{
    private int id;
    private String colour;
    private int x = 3;
    private int y = 1;
    
    public Robot()
    {
        id = 1;
        colour = "Silver";
    }
    
    public Robot(int id, String colour)
    {
        setId(id);
        setColour(colour);
    }
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getX()
    {
        return id;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getY()
    {
        return y;
    }
    public void setY(int id)
    {
        this.y = y;
    }
    
    public String getColour()
    {
        return colour;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    
    /*
    public String paint(String newColour)
    {
        System.out.println(newColour + " Paint Success");
        return newColour;
    }
    */
    
    public void move(int across, int down)
    {
        x += across;
        y += down;
    }
    
    public String toString()
    {
        return "The "+ colour +" Robot with id "+ id 
        +" is at position ("+ x +","+ y +")";
    }
}