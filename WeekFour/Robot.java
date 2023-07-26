class Robot
{
    int id;
    String colour;
    int x = 2;
    int y = 1;
    
    Robot()
    {
        id = 1;
        colour = "Silver";
    }
    
    Robot(int id, String colour)
    {
        this.id = id;
        this.colour = paint(colour);
    }
    
    String paint(String newColour)
    {
        System.out.println(newColour + " Paint Success");
        return newColour;
    }
    
    void move(int across, int down)
    {
        x += across;
        y += down;
    }
    
    void print()
    {
        System.out.println("The "+ colour +" Robot with id "+ id 
        +" is at position ("+ x +","+ y +")");
    }
}