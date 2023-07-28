public class Wheel
{
    private double position;
    
    public Wheel(double thePosition)
    {
        position = thePosition;
    }

    public double getPosition()
    {
        return position;
    }

    public void moveForward(double distance)
    {
        position = position + distance;
    }

    public void moveBackward(double distance)
    {
        position = position - distance;
    }

    // toString() example sentence is: “position is = 5”
    public String toString()
    {
        return "Position is "+ position;
    }
}