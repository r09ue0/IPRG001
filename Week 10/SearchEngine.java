public class SearchEngine
{
    private String titles[] = new String[5];
    private int pageNumbers[] = new int[50];
    private Bike bikes[] = new Bike[5];

    public SearchEngine()
    {
        // Call setup method for each array
        setupTitles();
        setupPageNumbers();
        setupBikes();
        // Call find methods  
        
        String title = findTitle("pqr");
        if (title.equals(""))
        {
            System.out.println("Title was not found");
        }
        else
        {
             System.out.println("Found " +  title);
        }
        
        
        Bike bike = findBike("blue");
        if (bike != null)
        {
            System.out.println(bike.getColour() + " colour bike was found");
        }
        else
        {
            System.out.println("Bike was not found");
        }
    }
    //37,40,41,42,43,44
    public void setupTitles()
    {
        // Titles are any values you like
        titles[0] = "abc";
        titles[1] = "def";
        titles[2] = "xyz";
        titles[3] = "pqr";
        titles[4] = "lmn";
    }

    public void setupPageNumbers()
    {
        // Page numbers are from 1 - 50
        // Use a loop
        for(int i = 0; i < pageNumbers.length; i++)
        {
            pageNumbers[i] = i + 1;
        }
    }

    public void setupBikes()
    {
        // Bikes can be any colour
        bikes[0] = new Bike("Red");
        bikes[1] = new Bike("Green");
        bikes[2] = new Bike("Blue");
        bikes[3] = new Bike("Yellow");
        bikes[4] = new Bike("Purple");
    }

    // Find page number ‘num’
    public void findPageNumber(int num)
    {
        boolean found = false;
        for(int i = 0; i < pageNumbers.length && !found; i++)
        {
            if (pageNumbers[i] == num)
            {
                found = true;
                System.out.println(num + " was found in index " + i);
            }
        }

        if(!found)
        {
            System.out.println(num + " was not found");
        }
    }

    // Find the matching title
    public String findTitle(String theTitle)
    {
        for(int i = 0; i < titles.length; i++)
        {
            if (titles[i] != null && 
                titles[i].equalsIgnoreCase(theTitle))
            {
                System.out.println(theTitle + " was found in index " + i);
                return titles[i];
            }
        }
        return "";
    }

    // Find the bike with the matching colour
    public Bike findBike(String colour)
    {
        for(int i = 0; i < bikes.length; i++)
        {
            if (bikes[i] != null && bikes[i].getColour() != null &&
                bikes[i].getColour().equalsIgnoreCase(colour))
            {
                System.out.println(colour + " bike was found in index " + i);
                return bikes[i];
            }
        }
        return null;
    }

}