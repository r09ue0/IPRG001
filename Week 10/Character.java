public class Character
{        
    private String name;
    private String hairColour;
    private String gender;
    private boolean hasHat = false;
    private boolean hasGlasses = false;
    public Character( String name, String hairColour, String gender)
    {    
        this.name = name;
        this.hairColour = hairColour;
        this.gender = gender;

    }   

    public Character(String name, String hairColour, String gender, boolean hasHat, boolean hasGlasses)
    {    
        this.name = name;
        this.hairColour = hairColour;
        this.gender = gender;
        this.hasHat = hasHat;
        this.hasGlasses = hasGlasses;
    }  

    String getName()
    {
        return name;
    }

    String getHairColour()
    {
        return hairColour;
    }

    String getGender()
    {
        return gender;
    }

    boolean getHasHat()
    {
        return hasHat;
    }

    public String toString()
    {
        String result = name + " is "  + gender + " with " + hairColour + " hair" ;
        if (hasGlasses)
            result += " and glasses ";
        if(hasHat)
            result += " and a hat";

        return result;
    }

    public void show()
    {

        System.out.println(toString());

    }

}
