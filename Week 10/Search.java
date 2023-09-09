public class Search
{
    int table[] = new int[100];

    public Search()
    {
        for (int k=0; k < table.length; k++)
        {
            table[k]= k+1; 
        }
    }

    public void searchFor7Method1()
    {
        boolean found = false;
        for (int k=0; k < table.length; k++)
        {
            //System.out.println("Comapre with " + table[k]);
            if (table[k] == 7) 
            {            
                found = true;   
                System.out.println("Found at position " + k); 
            }            
        }
        if (found==false)  
            System.out.println("not found ");        
    }

    public void searchFor7While()
    {
        int k = 0;
        while (k < table.length && table[k] != 7)   // when 7 found exit loop
        {
            System.out.println("While - Comapre with " + table[k]);
            k++;
        }
        if (k == table.length)  // if k == 100, means we searched entire array for 7, but did not find it
        {
            System.out.println("7 not found \n");
        }
        else    // else we found 7
        {
            System.out.println("7 found at position " + k);
        }
    }

    public void searchFor7Method2()
    {
        boolean found = false;
        
        // loop body executes as long as k < 100 && found==false
        for (int k=0; k < table.length && found == false; k++) 
        {
            System.out.println("For - Comapre with " + table[k]);
            if (table[k] == 7) 
            {            
                System.out.println("Found at position " + k); 
                found = true;       // found it. set found to false, so that we can exit
            }
        }
        
        if (!found)          // after the loop
            System.out.println("7 not found ");        
    }
}