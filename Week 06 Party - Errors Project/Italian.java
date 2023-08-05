public class Italian
{
    private int id;
    private final String LANGUAGE = "Italian";
    private String name;
    private String food;
    private String color;

    public Italian(int theId, String theName, String food, String color)
    {
        id = theId;
        name = theName;
        this.food = food;
        this.color = color;
    }      
      
    public void displayLanguage()
    {
        System.out.println("An Italian speaks " + LANGUAGE);
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
