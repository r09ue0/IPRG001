public class TestArray
{
    private int table[] = new int[100];
    private String names[]={"Mary", "Barbarella","Judy", "Josephine", "Nicolle", "Rosemary"};

    private double[] prices = new double[50];
    
    public TestArray()
    {
        for(int i=0;i<table.length;i++)
        {
            table[i]=i+1;
        }
        //prices = new double[25];
        setupPrices();
    }

    public void setupPrices()
    {  
        for(int i = 0; i < prices.length; i++)  
        {
            prices[i] = i + 101;
        }
    }

    public void addArray()
    {  
        double total = 0.0;
        for(int i = 0; i < prices.length; i++)
        {
            total += prices[i];  // total = total + prices[i]
        }
        
        // display total after adding
        System.out.println(total);
    }
}