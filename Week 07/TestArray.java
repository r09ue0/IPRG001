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
    }

    public void setupPrices()
    {
        for(int i=0; i<prices.length; i++)
        {
            prices[i] = 101 + i;
        }
    }
    public void addArray()
    {
        int total = 0;
        for(int i=0; i<prices.length; i++)
        {
            total += prices[i];
        }
        System.out.println(total);
    }
}