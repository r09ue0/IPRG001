public class TestRobot
{
    //private Robot robot = new Robot(1, "Pink");
    private Robot[] robots = new Robot[4];
    
    public TestRobot()
    {
        //robot.print();        
        // Move the robot to coordinate (4, 3)
        //robot.move(2, 2);
        //robot.print();
        
        // Populate the array. 
        // odd robots are blue, even robots are red. use a for loop?
        for(int i = 0; i < robots.length; i++)
        {
            int id = i + 1;
            String color = "";
            if (id % 2 == 1)
            {
                // odd
                color = "blue";
            }
            else
            {
                // even
                color = "red";
            }
            robots[i] = new Robot(id, color);
        }
        
        move();
        print();
    }   
    
    public void move()
    {
        for(int i = 0; i < robots.length; i++)
        {
            // moves each robot 1 space down and 1 space across.
            robots[i].move(1, 1);
        }
    }
    
    public void print()
    {
        for(int i = 0; i < robots.length; i++)
        {
            robots[i].print();
        }
    }
}