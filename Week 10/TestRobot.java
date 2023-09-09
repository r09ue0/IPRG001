public class TestRobot
{
    private Robot[] robots = new Robot[4];

    public TestRobot()
    {        
        //create red & blue robots
        for(int i = 0; i < robots.length; i++)
        {
            String colour = "red";
            if(i % 2 == 0)
            {
                colour = "blue"; //it is an odd
            }
            robots[i] = new Robot(i+1, colour);
        }

        robots[3].setColour("green");
        Robot robot = findRobot("green");
        if (robot != null)
        {
            System.out.println(robot.toString());
        }
        
        robot = findRobot(2);
        if (robot != null)
        {
            System.out.println(robot.toString());
        }
    }
    
    public Robot findRobot(int id)
    {
        for (int i = 0; i < robots.length; i++)
        {
            if(robots[i].getId() == id)
            {
                return robots[i];
            }
        }        
        return null;
    }
    
    public Robot findRobot(String colour)
    {
        for (int i = 0; i < robots.length; i++)
        {
            if (robots[i] != null && 
                robots[i].getColour().equals(colour))
            {
                return robots[i];
            }
        }        
        return null;
    }
    
    
    //move() - robot 1 across & 1 down
    public void move()
    {
        for(int i = 0;i < robots.length; i++)
        {
            robots[i].move(1, 1);
        }
    }

    //print() -  each robot
    public void print()
    {
        for(int i = 0; i < robots.length; i++)
        {
            robots[i].print();
        }

    }

}
