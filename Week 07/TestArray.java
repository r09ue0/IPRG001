public class TestArray
{
    private int table[] = new int[100];
    private String names[]={"Mary", "Barbarella","Judy", "Josephine", "Nicolle", "Rosemary"};

    public TestArray()
    {
        for(int i=0;i<table.length;i++)
        {
            table[i]=i+1;
        }
    }

    public void setupPrices()
    {
        for(int i=0; i<50; i++)
        {
            table[i] = 101 + i;
        }
    }
    public void addArray()
    {
        int total = 0;
        for(int i=0; i<table.length; i++)
        {
            total += table[i];
        }
        System.out.println(total);
    }
}