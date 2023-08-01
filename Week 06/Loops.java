public class Loops
{
    public Loops()
    {
        int i = 0;
        for(i=0; i<10; i++)
        {
            System.out.println("Hi");
        }
    }

    public void insideOutside()
    {
        int k = 0;
        for(k=0; k<10; k++)
        {
            System.out.println ("Inside the loop " + k);
        }
        System.out.println ("After the loop " + k);
    }

    public void displayNumbers()
    {

    }

    public void addNumbers()
    {
        int total = 0;
        for(int i=0; i<=20; i++)
        {
            total += i;
        }
        System.out.println(total);
    }

    public void lgeToSmall()
    {
        for(int i=30; i>0; i--)
        {
            System.out.println(i);
        }
    }

    public void printLine(int length)
    {
        String display = "";
        for(int k=0; k < length; k++)
        {
            display = display +"*";
            //display = "" + "*" = "*" i=0
            //display = "*" + "*" = "**" i=1
        }
        display = display + "\n";
        System.out.println(display);
    }
    
    public void countTo20()
    {
        for(int i=1; i <= 20; i++)
        {
            System.out.println(i);
        }
    }
    
    public void evenNumbers()
    {
        int total = 0;
        for(int i=0; i<20; i+=2)
        {
            total += i;
        }
        System.out.println(total);
    }
}