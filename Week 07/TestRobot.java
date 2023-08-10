public class TestRobot
{
    private Robot robots[] = new Robot[4];
    
    public TestRobot()
    {
        for(int i=0; i<robots.length; i++)
        {
            robots[i] = new Robot();
            robots[i].setId(i+1);
            if((i+1)%2 == 0)
                robots[i].setColour("red");
            else
                robots[i].setColour("blue");
        }
        
    }
    
    public void move()
    {
        for(int i=0; i<robots.length; i++)
        {
            robots[i].move(1,1);
        }
    }
    
    public void print()
    {
        for(int i=0; i<robots.length; i++)
        {
            System.out.println(robots[i].toString());
        }
    }
}