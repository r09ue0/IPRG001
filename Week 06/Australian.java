public class Australian
{
    private int id;
    private String language;
    private String name;
    private String food;

    public Australian(int theId, String theLanguage, String theName, String theFood)
    {
        id = theId;
        language = theLanguage;
        name = theName;
        food = theFood;
    }

    public void displayLanguage()
    {
        System.out.println("An Australian speaks " + language);
    }

    // Method displayFood()
    public void displayFood()
    {
        System.out.println(name +"'s favourite food is "+ food);
    }
}