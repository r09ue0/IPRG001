class Friend
{
    String name, location, brandOfPhone;
    
    Friend()
    {
        name = "Lalit";
        location = "Panadura";
        brandOfPhone = "Google";
    }
    
    Friend(String name)
    {
        this.name = name;
    }
    
    void sayHello()
    {
        System.out.println("Hi, nice to meet you, my name is " + name +".");
    }
}