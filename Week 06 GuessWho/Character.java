public class Character
{
    private String name;
    private String gender;
    private String hairColor;
    private boolean hasGlasses;
    private boolean hasEarings;
    private boolean hasHat;
    
    public Character(String name, String gender, String hairColor)
    {
        setName(name);
        setGender(gender);
        setHairColor(hairColor);
    }
    
    public Character(String name, String gender, String hairColor, boolean hasGlasses,
    boolean hasEarings, boolean hasHat)
    {
        setName(name);
        setGender(gender);
        setHairColor(hairColor);
        setHasGlasses(hasGlasses);
        setHasEarings(hasEarings);
        setIsHasHat(hasHat);
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public String getHairColor()
    {
        return hairColor;
    }
    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }
    
    public boolean getHasGlasses()
    {
        return hasGlasses;
    }
    public void setHasGlasses(boolean hasGlasses)
    {
        this.hasGlasses = hasGlasses;
    }
    
    public boolean getHasEarings()
    {
        return hasEarings;
    }
    public void setHasEarings(boolean hasEarings)
    {
        this.hasEarings = hasEarings;
    }
    
    public boolean getIsHasHat()
    {
        return hasHat;
    }
    public void setIsHasHat(boolean hasHat)
    {
        this.hasHat = hasHat;
    }
    
    public String toString()
    {
        String str = name +" is "+ gender +" with "+ hairColor + " hair";
        if(hasGlasses && hasEarings && hasHat)
        {
            str += ", Glasses, Earings, and Hat.";
        }
        else if(hasGlasses && hasEarings)
        {
            str += " Glasses, and Earings.";
        }
        else if(hasHat && hasEarings)
        {
            str += ", Earings, and Hat.";
        }
        else if(hasHat && hasGlasses)
        {
            str += ", Glasses, and Hat.";
        }
        else if(hasGlasses)
        {
            str += ", and Glasses.";
        }
        else if(hasHat)
        {
            str += ", and Hat.";
        }
        else if(hasEarings)
        {
            str += ", and Earings.";
        }
        else
        {
            str += ".";
        }
        return str;
    }
    
    public void show()
    {
        System.out.println(toString());
    }
}