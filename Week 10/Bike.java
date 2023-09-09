
public class Bike
{
    private String colour;
    private Wheel frontWheel;
    private Wheel backWheel;

    public Bike(String col)
    {  
        colour = col;
        frontWheel = new Wheel(0);
        backWheel = new Wheel(0);
    }

    public String getColour()
    {
        return colour;
    }

    public void displayColour()
    {
        System.out.println("The bike is " + colour);    
    }

    public void moveForward()
    {
        frontWheel.moveForward();
        backWheel.moveForward();
    }

    public void moveBackward()
    {
        frontWheel.moveBackward();
        backWheel.moveBackward();
    }

    public void reverse(int distance)
    {
        for(int i=0;i<distance;i++)
        {
            moveBackward();
        }
    }

    public void driveForward(int distance)
    {
        int i=0;
        while(i<distance)
        {            
            moveForward();                                   
            i++;
        }
    }
}