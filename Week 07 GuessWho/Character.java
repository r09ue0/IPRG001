public class Character
{   
    private String name;
    private String hairColor;
    private String gender;
    private boolean hasHat;
    private boolean hasGlasses;

    public Character(String name, String hairColor, String gender)
    {       
        setName(name);
        setHairColor(hairColor);
        setGender(gender);
    }   

    public Character(String name, String hairColor, String gender, 
                        boolean hasHat, boolean hasGlasses)
    {       
        //this.name = name;
        //this.hairColor = hairColor;
        //this.gender = gender;
        setName(name);
        setHairColor(hairColor);
        setGender(gender);

        //this.hasHat = hasHat;     
        //this.hasGlasses = hasGlasses;
        setHasHat(hasHat);
        setHasGlasses(hasGlasses);
    }

    // accessors
    public String getName()
    {
        return name;
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public String getGender()
    {
        return gender;
    }

    public boolean getHasHat()
    {
        return hasHat;
    }

    public boolean getHasGlasses()
    {
        return hasGlasses;
    }

    // mutators
    public void setName(String name)
    {
        this.name = name;
    }

    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setHasHat(boolean hasHat)
    {
        this.hasHat = hasHat;
    }

    public void setHasGlasses(boolean hasGlasses)
    {
        this.hasGlasses = hasGlasses;
    }

    public void show()
    {
        System.out.println(toString());
    }

    // Anita is female with blonde hair 
    // Joe is male with blonde hair and glasses
    // George is male with grey hair and a hat
    public String toString()
    {
        String str = name + " is " + gender +" with " + hairColor + " hair";
        if (hasHat)
        {
            str += " and a hat";
        }
        if (hasGlasses)
        {
            str += " and glasses";
        }
        return str;
    }
}