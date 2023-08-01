public class French
{
    private int id;
    private final String LANGUAGE = "French";
    private String name;

    public French(int theId, String theName)
    {
        id = theId;
        name = theName;
    }

    public void displayLanguage()
    {
        System.out.println("In France most people speak " + LANGUAGE);
    }
}