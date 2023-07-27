public class Bike
{
    private String colour;
    private Wheel frontWheel;
    private Wheel backWheel;
    // Constant for the number of wheels

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

    // Accessors &amp; mutators
    public String toString()
    {
        return "Colour = " + colour + ", front wheel position is = " +
        frontWheel.getPosition() + ", back wheel position is = " +
        backWheel.getPosition();
    }
}