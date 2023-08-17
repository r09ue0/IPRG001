public class TestWhile
{
    TestWhile()
    {
        int total = 0;
        int counter = 10;
        while(counter<15)
        {
            total += counter;
            counter++;
        }
        System.out.println("Total = "+ total);
    }
    
    public void testDoWhile()
    {
        int total = 0;
        int counter = 10;
        do
        {
            total += counter;
            counter++;
        }
        while(counter<15);
        System.out.println("Total = "+ total);
    }
}