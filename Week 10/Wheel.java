public class Wheel
{
    private double position;

    public Wheel(double thePosition)
    {
        position = thePosition;
    }

    public void moveForward()
    {
        position = position + 1;
    }    

    public void moveBackward()
    {
        position = position - 1;
    }    

    public double getPosition()
    {
        return position;        
    }

    public void setPosition(double pos)
    {
        position = pos;
    }        
}