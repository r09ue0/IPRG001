class TestUser 
{ 
    User myUser;
    
    TestUser()
    {
        // Create a User object  
        myUser = new User("Peter", 1989); 

        // Call the function calcAge() 
        int age = myUser.calcAge(2023); 

        System.out.println("The user is " + age + " years old this year"); 
        
        //call the function cost 
        double price = myUser.cost(2023);
        System.out.println("User please pay " + price); 
    }
} 