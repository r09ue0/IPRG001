public class Bike
{
    private String colour;
    private Wheel frontWheel;
    private Wheel backWheel;
    // Constant for the number of wheels
    private final int NUM_OF_WHEELS = 2;

    public Bike(String colour, Wheel frontWheel, Wheel backWheel)
    {
        this.colour = colour;
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
    }

    private void displayColour()
    {
        System.out.println("The bike is " + colour);
    }

    public void moveForward(double distance)
    {
        frontWheel.moveForward(distance);
        backWheel.moveForward(distance);
    }
    // moveBackwards method
    public void moveBackward(double distance)
    {
        frontWheel.moveBackward(distance);
        backWheel.moveBackward(distance);
    }

    public String toString()
    {
        return "Colour = "+ colour +", Front Wheel "+frontWheel.toString() 
        +", Back Wheel "+ backWheel.toString();
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public Wheel getFrontWheel()
    {
        return frontWheel;
    }
    
    public Wheel getBackWheel()
    {
        return backWheel;
    }
    
    public int getNumOfWheels()
    {
        return NUM_OF_WHEELS;
    }
    
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    
    public void setFrontWheel(Wheel frontWheel)
    {
        this.frontWheel = frontWheel;
    }
    
    public void setBackWheel(Wheel backWheel)
    {
        this.backWheel = backWheel;
    }
}