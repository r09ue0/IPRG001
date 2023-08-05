public class French
{
    private int id;
    private final String LANGUAGE = "French";
    private String name;
    private String food;
    private String color;

    public French(int theId, String theName, String food, String color)
    {
        id = theId;
        name = theName;
        this.food = food;
        this.color = color;
    }            

    public void displayLanguage()
    {
        System.out.println("In France most people speak " + LANGUAGE);
    }
    
    public void displayFood()
    {
        System.out.println("My name is " + name + " and I like to eat " + food);
    }
    
    public void displayColor()
    {
        System.out.println("My name is " + name + " and I like " + color);
    }
}
