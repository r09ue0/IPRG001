class TestRobot
{
    Robot robotOne;
    
    TestRobot()
    {
        robotOne = new Robot(1, "Pink");
        robotOne.move(2,2);
        robotOne.print();
    }
}