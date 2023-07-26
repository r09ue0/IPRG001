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
    
    Friend(String name, String location, String brandOfPhone)
    {
        this.name = name;
        this.location = location;
        this.brandOfPhone = brandOfPhone;
    }
    
    void sayHello()
    {
        System.out.println("Hi, nice to meet you, my name is " + name +".");
    }
}