public class Australian
{
    private int id;
    private String language;
    private String name;
    private String food;
    private String color;
   
    public Australian(String theName, String theLanguage, String theFood, String color)
    {
        language = theLanguage;
        name = theName;
        food = theFood;
        this.color = color;
    }
    
    public void displayLanguage()
    {
        System.out.println("An Australian speaks " + language);
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
