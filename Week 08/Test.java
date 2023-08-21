import java.util.*;

public class Test
{    
    public Test()
    {        
    }

    public void basicWhile()
    {
        int counter = 0;
        while (counter < 10)
        {            
            System.out.println("Counter is "+counter);
            counter++;
        }
    }

    void addCounter() // Exercise D - rewrite with a while loop
    {
        int total=0;
        for (int k=10;k<15;k++)
        {
            total = total + k;
        }
        System.out.println("Total = " + total);
    }

    public void doWhile()
    {
        int k=1,total=0;
        do  
        { 
            total+=k;
            System.out.println("Total = " + total);
            k++;
        }
        while (k<10);
    }

    public void charInput()
    {
        Scanner in = new Scanner(System.in); 
        int k=0,total=0;
        char letter;
        do  
        { 
            total = total + k;
            System.out.println("Total = " + total);
            System.out.println("Do you wish to continue? (y/n)");
            letter = in.next().charAt(0); // yes
            k++;
        }
        while (letter == 'y' || letter == 'Y');
    }


    public void basicNestedFor()
    {
        for (int i=0; i < 10; i++)
        {
            for (int j=0; j < 10; j++)
            {
                System.out.println("i=" + i + "j=" + j);
            }
            // code here too
        }
    }

    public void multiplicationTable()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<= 5; j++)
            {
                System.out.print(i * j +" ");
            }
            System.out.println();
        }
    }
    
    public void whileMultiplicationTable()
    {
        int i = 1;
        while(i <= 5)
        {
            int j = 1;
            while(j <= 5)
            {
                System.out.print(i * j +" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
    public void doWhileMultiplicationTable()
    {
        int i = 1;
        do
        {
            int j = 1;
            do
            {
                System.out.print(i * j +" ");
                j++;
            }
            while(j <= 5);
            i++;
            System.out.println();
        }
        while(i <= 5);
    }
    
    public void challenge()
    {
        int array[] = {1, 4, 6, 2, 4};
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array[i]; j++)
            {
                System.out.print("&");
            }
            System.out.println();
        }
    }
    
    public void triangleStars(int num)
    {
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}