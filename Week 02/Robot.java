class Robot
{
    int id;
    String colour;
    
    Robot()
    {
        id = 1;
        colour = "Silver";
    }
    
    Robot(int id, String colour)
    {
        this.id = id;
        this.colour = colour;
    }
    
    void paint(String newColour)
    {
        colour = newColour;
        System.out.println(colour + " Paint Success");
    }
}