
class PowerTest
{   
    public static int GetPowerTwo(int num)
    {
        return num * num;
    }
}


public class Test
{
    public Test()
    {
        int powerTwo = PowerTest.GetPowerTwo(10);
        System.out.println(powerTwo);
    }
}