public class Italian
{
    private int id;
    private final String LANGUAGE = "Italian";
    private String name;

    public Italian(int theId, String theName)
    {
        id = theId;
        name = theName;
    }

    public void displayLanguage()
    {
        System.out.println("An Italian speaks " + LANGUAGE);
    }
}