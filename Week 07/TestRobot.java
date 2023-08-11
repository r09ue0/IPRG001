public class TestRobot
{
    private Robot robots[] = new Robot[4];
    
    public TestRobot()
    {
        for(int i=0; i<robots.length; i++)
        {
            String colour = "";
            if((i+1)%2 == 0)
                colour = "red";
            else
                colour = "blue";
                
            robots[i] = new Robot(i+1,colour);
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