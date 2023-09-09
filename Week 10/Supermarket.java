public class Supermarket
{
    // Declare the 2 arrays for bar code and price
    private int barCodes[] = new int[] {111, 112, 122, 130, 140};
    private double prices[] = new double[] {50, 10, 12, 40, 100};
    private static String name = "Coles";

    public void setName(String theName)
    {
        name = theName;
    }

    public void displayName()
    {
        System.out.println("Name = " + name);
    }

    public void findProductCost(int code)
    {
        boolean found = false;
        for(int i = 0; i < barCodes.length && !found; i++)
        {
            if (barCodes[i] == code)
            {
                System.out.println("Bar code is found at index " + i +
                    " and the cost is " + prices[i]);
                found = true;
            }
        }
        
        if (!found)
        {
            System.out.println(code + " - Bar code not found ");
        }
    }
}